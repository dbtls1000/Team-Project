<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<article class="grid_container">
	<c:forEach items="${TEAM}" var="CARD">
		<%@ include file="/WEB-INF/views/body/gamer/card.jspf" %>
	</c:forEach>
</article>