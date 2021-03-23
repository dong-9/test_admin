<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<ul>
	<li><a href="adminMemberList">Admin Member List</a></li>
	<li><a href="adminMemberModify">Admin Member Modify</a></li>
	<li><a href="adminTicketingList">Admin ticketing List</a></li>
	<li><a href="adminTicketingModify">Admin ticketing Modify</a></li>
	<li><a href="adminQuestionsList">Admin questions List</a></li>
	<li><a href="adminQuestionsDetail">Admin questions Detail</a></li>
</ul>
<hr>
<ul>
	<li><a href="main">User Main</a></li>
</ul>

</body>
</html>
