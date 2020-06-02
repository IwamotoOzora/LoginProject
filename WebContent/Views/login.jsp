<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">

       <head>
              <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
              <title>ログイン画面</title>
       </head>

       <body>

         <div class="login-form">

            <h1>ログイン</h1>

             <form action="./LoginServlet" method="post">

                <div class="text-input">
                    <label for="username">username:</label>
                    <input type="text" name="username" id="username">
                    <span class="separate"> </span>
                </div>

                <div class="text-input">
                    <label for="password">password:</label>
                    <input type="password" name="password">
                    <span class="separate"> </span>
                </div>

                <div class="button">
                    <input type="submit" value="送信" class="form-button">
                </div>

                <div class="emsg">${requestScope.loginBean.emsg}</div>

             </form>

         </div>

       </body>

</html>