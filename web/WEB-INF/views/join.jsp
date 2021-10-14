<%--
  Created by IntelliJ IDEA.
  User: rhrud
  Date: 2021-10-14
  Time: 오후 3:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>HotelzzZ - SignUp</title>
</head>
<body>
    <table>
        <tr>
            <td>아이디</td><td><input type="text" name="user_id"></td>
        </tr><tr>
            <td>비밀번호</td><td><input type="password" name="user_pw"></td>
        </tr><tr>
            <td>비밀번호 확인</td><td><input type="password" name="user_pw2"></td>
        </tr><tr>
            <td>이름</td><td><input type="text" name="user_nn"></td>
        </tr><tr>
            <td>이메일주소</td><td><input type="email" name="user_email"></td>
        </tr>
    </table>
    <button type="submit">회원가입</button>
</body>
</html>
