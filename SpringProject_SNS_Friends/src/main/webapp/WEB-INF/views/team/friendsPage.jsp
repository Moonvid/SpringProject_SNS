<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	div{
		text-align: right;
	}
</style>
</head>
<body>
	<div>
		<h3>나의 ID : ${loginInfo.userId} &nbsp;&nbsp;&nbsp;&nbsp;이름 : ${loginInfo.userName }</h3>
	</div>
	<h1>친구 페이지</h1>
	<h4>아이디 : ${friendInfo.userId}</h4> 
	<h4>이름 : ${friendInfo.userName}</h4>
	
	<br><br>
	<form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/team/friendsPage/${friendInfo.userNo}">
		<input type="hidden" value="${loginInfo.userNo}" name="userNo">
		<input type="hidden" value="${loginInfo.userId}" name="userId">
		<input type="hidden" value="${loginInfo.userName}" name="userName">
		<input type="submit" value="친구 신청">
	</form>
	
</body>
</html>