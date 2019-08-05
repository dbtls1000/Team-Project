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
	href="${rootPath}/css/header.css?ver=20190729">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/footer.css?ver=20190729">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/main1.css?ver=20190729">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/join.css?ver=20190729">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/login.css?ver=20190729">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/list.css?ver=20190729">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/grid.css?ver=20190805">		
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="${rootPath}/resources/js/teamlist.js?ver=2019080501"></script>
<!--  -->
</head>

<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf"%>
	<c:choose>
		<c:when test="${BODY == 'SKT_T1'}">
			<%@ include file="/WEB-INF/views/body/team/sktt1.jspf"%>
		</c:when>
		<c:when test="${BODY == 'GRIFFIN'}">
			<%@ include file="/WEB-INF/views/body/team/griffin.jspf"%>
		</c:when>
		<c:when test="${BODY == 'KZ'}">
			<%@ include file="/WEB-INF/views/body/team/kz.jspf"%>
		</c:when>
		<c:when test="${BODY == 'DAMWON'}">
			<%@ include file="/WEB-INF/views/body/team/damwon.jspf"%>
		</c:when>
		<c:when test="${BODY == 'SANDBOX'}">
			<%@ include file="/WEB-INF/views/body/team/sandbox.jspf"%>
		</c:when>
		<c:when test="${BODY == 'HANHWA'}">
			<%@ include file="/WEB-INF/views/body/team/hanhwa.jspf"%>
		</c:when>
		<c:when test="${BODY == 'GENG'}">
			<%@ include file="/WEB-INF/views/body/team/geng.jspf"%>
		</c:when>
		<c:when test="${BODY == 'AFREECA'}">
			<%@ include file="/WEB-INF/views/body/team/afreeca.jspf"%>
		</c:when>
		<c:when test="${BODY == 'KT'}">
			<%@ include file="/WEB-INF/views/body/team/kt.jspf"%>
		</c:when>
		<c:when test="${BODY == 'JINAIR'}">
			<%@ include file="/WEB-INF/views/body/team/jinair.jspf"%>
		</c:when>
		<c:when test="${BODY == 'GAMER_LIST'}">
			<%@ include file="/WEB-INF/views/body/gamer/list.jspf"%>
		</c:when>
		<c:when test="${BODY == 'BOARD_LIST'}">
			<%@ include file="/WEB-INF/views/body/board/list.jspf"%>
		</c:when>
		<c:when test="${BODY == 'BOARD_WRITE'}">
			<%@ include file="/WEB-INF/views/body/board/write.jspf"%>
		</c:when>
		<c:when test="${BODY == 'PROFILE'}">
			<%@ include file="/WEB-INF/views/body/gamer/view.jspf"%>
		</c:when>
		
		<c:otherwise>
			<%@ include file="/WEB-INF/views/body/main.jspf"%>
		</c:otherwise>
	</c:choose>
	<%@ include file="/WEB-INF/views/include/include-modal.jspf" %>
	<%@ include file="/WEB-INF/views/include/include-footer.jspf"%>
</body>
</html>