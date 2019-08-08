<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />	
<script>
	$(function(){
		$("#login_join").click(function(){
			$("#join-menu").click()
		})
		
	})
</script>
<body>
    <article class="login-body">
        <form class="login-form" action="${rootPath}/member/login" method="POST">
            <div class="main-box">
                <div class="content">
                    <h2>로그인</h2>
                </div>
                <div class="input">
                    <input type="text" name="m_userid" id="m_userid" placeholder="사용자 ID">
                </div>
                <div class="input">
                    <input type="password" name="m_password" id="m_password" placeholder="Password">
                </div>
                <div class="button">
                	<button type="button">ID/비밀번호찾기</button>
                    <button type="button" id="login_join">회원가입</button>
                    <button id="btn-join">로그인</button>
                </div>
            </div>
        </form>
    </article>
</body>