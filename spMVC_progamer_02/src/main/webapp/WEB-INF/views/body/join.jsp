<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />	

<script>
$(function(){
	
	
	
})

</script>
<form action="${rootPath}/member/join" method="POST">
	<fieldset class="info">
		<legend>회원가입</legend>
		<div class="div1">
			<label for="m_userid">ID</label> <input type="text" name="m_userid"
				id="m_userid" placeholder="사용자ID를 입력하세요">

		</div>
		<div class="div1">
			<label for="m_password">비밀번호 : </label> <input type="password"
				name="m_password" id="m_password" placeholder="비밀번호를 입력하세요">
		</div>
		<div class="div1">
			<label for="m_repassword">비밀번호 확인 : </label> <input type="password"
				name="m_repassword" id="m_repassword" placeholder="비밀번호를 한번더 입력하세요">
		</div>
		<span id="check"></span>
		<div class="div1">
			<label for="m_name">이름 : </label> <input type="text" name="m_name"
				id="m_name" placeholder="이름을 입력해주세요">
		</div>
		<div class="div1">
			<label for="m_nick">닉네임 : </label> <input type="text" name="m_nick"
				id="m_nick" placeholder="닉네임을 입력해주세요">
		</div>
		<div class="div1">
			<label for="m_email">이메일 : </label> <input type="text" name="m_email"
				id="m_email" placeholder="e-mail을 입력해주세요">
		</div>
		<div class="div1">
			<label for="m_tel">전화번호 : </label> <input type="text" name="m_tel"
				id="m_tel" placeholder="전화번호를 입력해주세요">
		</div>
		<div class="button">
			<button>회원가입</button>
		</div>
	</fieldset>
</form>
