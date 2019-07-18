<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css파일 모아놓는곳 -->
<link rel="stylesheet" type="text/css" href="${rootPath}/css/header.css?ver=20190717">
<link rel="stylesheet" type="text/css" href="${rootPath}/css/footer.css?ver=20190717">
<link rel="stylesheet" type="text/css" href="${rootPath}/css/main.css?ver=20190717">
<!--  -->
</head>

<body>
<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
<c:choose>
	<c:when test="${BODY == 'SKT_T1'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'GRIFFIN'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'KZ'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'SANDBOX'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'HANHWA'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'GEN.G'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'JINAIR'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'AFREECA'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'KT'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:when test="${BODY == 'DAMWON'}">
		<%@ include file="/WEB-INF/views/body/SKT_T1.jspf" %>		
	</c:when>
	<c:otherwise>
		<%@ include file="/WEB-INF/views/body/main.jspf" %>
	</c:otherwise>
</c:choose>

<%@ include file="/WEB-INF/views/include/include-footer.jspf" %>
</body>
</html>