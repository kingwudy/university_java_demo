package gaunzhuServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.DBconnect;

/**
 * Servlet implementation class gaunzhuServlet
 */
@WebServlet("/gaunzhuServlet")
public class gaunzhuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public gaunzhuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		DBconnect course = new DBconnect("jdbc:oracle:thin:@localhost:1521:orcl","jsp","000000");
		course.creatConnection();
		String coursename=request.getParameter("A");
		String guanzhu = request.getParameter("B");
		HttpSession session=request.getSession();
		String user = (String) session.getAttribute("user");
		if(guanzhu.equals("关注")){
			course.update("insert into GUANZHU1 (name,GUANZHUCOURSE) values ('"+user+"','"+coursename+"')");
			response.getWriter().write("成功关注");
		}
		if(guanzhu.equals("已关注")){
			course.update("delete from GUANZHU1 where name='"+user+"'and GUANZHUCOURSE='"+coursename+"'");
			response.getWriter().write("取消关注");
		}
		course.close();
	}

}
