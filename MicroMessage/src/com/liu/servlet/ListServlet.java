package com.liu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liu.service.QueryService;




//@WebServlet(name="ListServlet",urlPatterns="/List.action")
public class ListServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String command = req.getParameter("command");
		String description = req.getParameter("description");
		req.setAttribute("command", command);
		req.setAttribute("description", description);
		QueryService  listService = new  QueryService();
		req.setAttribute("messageList", listService.queryMessageList(command, description));
		req.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(req, resp);
	}
	
}
