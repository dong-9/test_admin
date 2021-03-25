<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet" type="text/css" href="resources/user/css/topMenu.css">

<ul id="top-menu">
	<!-- login -->
<c:if test="">
	<li class="user-id">test@test.com</li>
	<li><a href="#e" class="top-menu-btn">로그아웃</a></li>
	<li><a href="#e">마이페이지</a></li>
</c:if>
	<!-- //login -->
	<!-- logout -->
	<li><a href="login" class="top-menu-btn">로그인</a></li>
	<li><a href="join">회원가입</a></li>
	<!-- //logout -->
</ul>
