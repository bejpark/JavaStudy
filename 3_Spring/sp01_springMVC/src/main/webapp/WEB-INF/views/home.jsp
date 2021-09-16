<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<img alt="dog" src="resources/dog.jpg">
<hr>


<h3>EL 이용한 경로 지정</h3>
<img alt="dog" src= "${path}/dog.jpg" width="300" height="500">
<img alt="dog" src= "<c:url value = '${path}/dog.jpg'/>" width="300" height="500">

</body>
</html>
