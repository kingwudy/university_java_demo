<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request接收中文参数乱码问题</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/GetEncoding" method="get">
        	 姓名：<input type="text" name="name"/>
           <input type="submit" value="get方式提交表单"> 
     </form>
</body>
</html>