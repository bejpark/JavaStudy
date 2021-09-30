<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login OK</title>
</head>
<body>
<%
	String id =request.getParameter("id");
	out.print("your "+id);
%>
<br>
<%="my id : "+id %>

클라 ip 정보 : <%=request.getRemoteAddr() %><br>
요청 방식(인코딩) : <%=request.getCharacterEncoding() %><br>
전송 방식 : <%=request.getMethod() %><br>
서버 이름 : <%=request.getServerName() %><br>
컨텍스트 정보 : <%=request.getContextPath() %><br>
전송된 데이터 : <%= request.getParameter("id") %><br>

<h3></h3>
</body>
</html>