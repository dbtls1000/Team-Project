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
	href="${rootPath}/css/header.css?ver=20190806">
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
	href="${rootPath}/css/grid.css?ver=20190806">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/button.css?ver=20190806">
<link rel="stylesheet" type="text/css"
	href="${rootPath}/css/table.css?ver=2019080602">		
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">	
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!--  -->
</head>

<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf"%>
	<c:choose>
		<c:when test="${BODY == 'GAMER_LIST'}">
			<%@ include file="/WEB-INF/views/body/gamer/list.jspf"%>
		</c:when>
		<c:when test="${BODY == 'BOARD_LIST'}">
			<%@ include file="/WEB-INF/views/body/board/list.jspf"%>
		</c:when>
		<c:when test="${BODY == 'BOARD_WRITE'}">
			<%@ include file="/WEB-INF/views/body/board/write.jspf"%>
		</c:when>
		<c:when test="${BODY == 'BOARD_VIEW'}">
			<%@ include file="/WEB-INF/views/body/board/view.jspf"%>
		</c:when>
		<c:when test="${BODY == 'PROFILE'}">
			<%@ include file="/WEB-INF/views/body/gamer/view.jspf"%>
		</c:when>
		<c:when test="${BODY == 'SEARCH'}">
			<%@ include file="/WEB-INF/views/body/gamer/search.jspf"%>
		</c:when>
		<c:otherwise>
			<%@ include file="/WEB-INF/views/body/main.jspf"%>
		</c:otherwise>
	</c:choose>
	<%@ include file="/WEB-INF/views/include/include-modal.jspf" %>
	<%@ include file="/WEB-INF/views/include/include-footer.jspf"%>
</body>
</html>