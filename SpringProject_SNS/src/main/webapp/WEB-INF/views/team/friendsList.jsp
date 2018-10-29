<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table {
	border: 1px solid black;
}

td {

	padding: 20px;
	text-align: center;

}
</style>
</head>
<h1>친구 목록</h1>
<h3><a href="friendsAdmin">친구 목록 관리</a></h3>
${friendsList}

<c:if test="${friendsList.isEmpty()}">
		등록된 친구가 없습니다.
	</c:if>

<c:if test="${!friendsList.isEmpty()}">
	<table>
		<tr>
			<td>FriendNo</td>
			<td>FriendID</td>
			<td>FriendName</td>
		</tr>
		<c:forEach var="friends" items="${friendsList}">
			<tr>
				<td><a href="friendsPage/${friends.userNo}">${friends.userNo}</a></td>
				<td><a href="friendsPage">${friends.userId}</a></td>
				<td><a href="friendsPage">${friends.userName}</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<body>
</body>
</html>