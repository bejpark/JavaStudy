<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>경로 지정에 대한 설정</title>
</head>
<body>
<h1>Hello jsp</h1>
<h3>경로 확인</h3>
<%= request.getContextPath() %> <br>
<%= request.getServletPath() %> <br>
<%= request.getRequestURI() %> <br>
<%= application.getContextPath() %> <br>
<%= pageContext.getServletContext().getContextPath() %> <br>
<%
	for(int i=1;i<11;i++){
		out.print(i+"<br>");
	}
	String msg = show();
	out.print(msg);
	out.print(show());
%>
<%! 
	public String show(){
	return "hi";
}
%>
</body>
</html>