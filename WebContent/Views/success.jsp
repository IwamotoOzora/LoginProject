<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/success.css">

<head>
<meta charset="UTF-8">
<title>ログイン成功|ユーザ一覧</title>
</head>

<body>

	<div class="msg">
		<p>
		   ようこそ<span class="name">${requestScope.loginBean.username}</span>さん!
		</p>
		<p>ログインに成功しました!</p>
	</div>

	<!-- ユーザデータ一覧のテーブル -->
	<hr />
	<table>
		<tr>
			<th colspan="4" class="userdata">ユーザデータ一覧</th>
		</tr>

		<tr>
			<th>username</th>
			<th>password</th>
			<th>age</th>
			<th>no</th>
		</tr>

		<c:forEach var="data" items="${users}">
			<tr>
				<td><c:out value="${data.username}"></c:out></td>
				<td><c:out value="${data.password}"></c:out></td>
				<td><c:out value="${data.age}"></c:out></td>
				<td><c:out value="${data.no}"></c:out></td>
			</tr>
		</c:forEach>

	</table>

</body>

</html>