<%--
  Created by IntelliJ IDEA.
  User: rhrud
  Date: 2021-10-14
  Time: 오후 3:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HotelzzZ - Login</title>
</head>
<body>
    <form action="/login" method="post">
        <sec:csrfInput/>
        <table>
            <tr>
                <td>아이디</td><td><input type="text"></td>
            </tr><tr>
                <td>비밀번호</td><td><input type="password"></td>
            </tr>
        </table>
        <button type="submit">로그인</button>
    </form>
</body>
</html>
