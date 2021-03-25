<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고속버스통합예매</title>
<!-- user common file setting -->
<c:import url="../common/userSettings.jsp"></c:import>
<!-- css -->
<link rel="stylesheet" type="text/css" href="resources/user/css/join/join.css">
</head>
<body>
	<!-- side-manu -->
	<c:import url="../common/sideMenu.jsp"></c:import>
	<!-- // side-manu -->
	<!-- main -->
	<div id="main">
		<!-- top-menu -->
		<c:import url="../common/topMenu.jsp"></c:import>
		<!-- // top-menu -->
		<!-- header -->
		<header id="header">
			<h2>회원가입</h2>
		</header>
		<!-- // header -->
		<!-- content -->
		<section id="content">
			<h3>회원정보를 입력해주세요.</h3>
			<!-- content-box -->
			<div class="content-box">
				<!-- join-box -->
				<div class="join-box">
					<!-- input-box -->
					<div class="input-box">
						<label for="user-ID">아이디</label>
						<input type="text" id="user-ID" placeholder="이메일을 입력해 주세요."/>
					</div>
					<!-- // input-box -->
					<!-- input-box -->
					<div class="input-box">
						<label for="user-PW">비밀번호</label>
						<input type="password" id="user-PW" placeholder="영문 숫자 8자리 이상"/>
					</div>
					<!-- // input-box -->
					<!-- input-box -->
					<div class="input-box">
						<label for="check-PW">비밀번호 확인</label>
						<input type="password" id="check-PW" placeholder="비밀번호를 재입력 하세요."/>
					</div>
					<!-- // input-box -->
					<!-- select-box -->
					<div class="select-box">
						<label for="birthd">출생년도</label>
						<select id="birthd">
							<option>a</option>
							<option>a</option>
							<option>a</option>
						</select>
					</div>
					<!-- // select-box -->
					<!-- input-box -->
					<div class="input-box">
						<label for="phone">휴대폰번호</label>
						<input type="text" id="phone" placeholder="비밀번호를 재입력 하세요."/>
					</div>
					<!-- // input-box -->
				</div>
				<!-- // join-box -->
			</div>
			<!-- // content-box -->
			<ul class="btn-box">
				<li><input type="button" class="join-btn" value="회원가입"/></li>
			</ul>
			<ul class="text-box">
				<li>고객님의 이메일과 출생, 성별은 아이디와 비밀번호 분실 시 필요한 정보입니다.</li>
				<li>고객님의 출생과 성별은 더 나은 서비스를 위해 마케팅 정보로 활용됩니다.</li>
			</ul>
			
			
		</section>
		<!-- // content -->
		<!-- footer -->
		<c:import url="../common/footer.jsp"></c:import>
		<!-- // footer -->		
	</div>
	<!-- // main -->
</body>
</html>