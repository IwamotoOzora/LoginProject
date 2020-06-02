<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
       <head>
             <meta charset="UTF-8">
             <title>ログイン成功</title>
       </head>

       <body>

         <div class="msg">
              <p>ようこそ${requestScope.loginBean.username}さん!</p>
              <p>ログインに成功しました!</p>
         </div>

         <c:forEach var="data" items="${users}">
            <hr/>
              <div>username:<c:out value="${data.username}"></c:out></div>
              <div>password:<c:out value="${data.password}"></c:out></div>
         </c:forEach>

       </body>

</html>