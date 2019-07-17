<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    <c:set var="rootPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${rootPath}/css/header.css?ver=20190717">
<link rel="stylesheet" type="text/css" href="${rootPath}/css/footer.css?ver=20190717">
<link rel="stylesheet" type="text/css" href="${rootPath}/css/main.css?ver=20190717">
</head>

<body>
<%@ include file="/WEB-INF/views/include/include-header.jspf" %>

<%@ include file="/WEB-INF/views/body/main.jspf" %>

<%@ include file="/WEB-INF/views/include/include-footer.jspf" %>
</body>
</html>