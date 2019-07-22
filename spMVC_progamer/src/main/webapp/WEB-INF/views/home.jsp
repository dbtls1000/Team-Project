<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css파일 모아놓는곳 -->
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/header.css?ver=20190722">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/footer.css?ver=20190719">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/main.css?ver=20190719">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/join.css">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/login.css">	
<!--  -->
</head>

<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf"%>
	<c:choose>
		<c:when test="${BODY == 'LOGIN'}">
			<%@ include file="/WEB-INF/views/body/login.jspf"%>
		</c:when>
		<c:when test="${BODY == 'JOIN'}">
			<%@ include file="/WEB-INF/views/body/join.jspf"%>
		</c:when>
		<c:when test="${BODY == 'MEMBER-VIEW'}">
			<p>ID : ${MEMBER.m_userid }</p>
			<p>PASSWORD : ${MEMBER.m_password }</p>
			<p>NAME : ${MEMBER.m_name }</p>
			<p>EMAIL : ${MEMBER.m_email }</p>
			<p>TEL : ${MEMBER.m_tel }</p>
		</c:when>
		<c:when test="${BODY == 'SKT_T1'}">
			<%@ include file="/WEB-INF/views/body/SKT_T1.jspf"%>
		</c:when>
		<c:otherwise>
			<%@ include file="/WEB-INF/views/body/main.jspf"%>
		</c:otherwise>
	</c:choose>

	<%@ include file="/WEB-INF/views/include/include-footer.jspf"%>
</body>
</html>