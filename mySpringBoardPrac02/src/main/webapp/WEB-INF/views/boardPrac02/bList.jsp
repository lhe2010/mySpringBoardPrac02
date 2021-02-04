<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bList</title>
</head>
<body>
	<div align="center">
		<h1>리스트를 보여주는 bList페이징입니다.</h1>
		<table border="1">
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			
			<c:forEach var="board" items="${boardList }">
				<c:set var="idx" value="${idx+1 }"></c:set>
				<tr>
					<td>${idx }</td>
					<td><a href="boardInfo?num=${board.num }">${board.subject }</a></td>
					<td>${board.writer }</td>
					<td><fmt:formatDate value="${board.regDate }" pattern="yyyy-MM-dd"/></td>
					<td>${board.readCount }</td>
				</tr>
			</c:forEach>
			
			<tr>
				<td colspan="5"><button onclick="location.href='boardWrite'">글쓰기</button></td>
			</tr>
		</table>
	</div>

</body>
</html>