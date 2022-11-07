<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>로그인 화면</title>

    <script type="text/javascript">

        //로그인을 위한 입력정보의 유효성 체크하기
        function doLoginUserCheck(f) {

            if (f.user_id.value === "") {
                alert("아이디를 입력하세요.");
                f.user_id.focus();
                return false;
            }

            if (f.password.value === "") {
                alert("비밀번호를 입력하세요.");
                f.password.focus();
                return false;
            }

        }
    </script>
</head>
<body>
<h1>로그인 화면</h1>
<br/>
<form name="f" method="post" action="/user/getUserLoginCheck" onsubmit="return doLoginUserCheck(this);">

    <label>아이디 :
        <input type="text" name="user_id" />
    <span id="olmessage"></span><br/>

    <label>비밀번호 :
        <input type="password" name="password" />
    </label>
    <br/>
    <input type="submit" value="로그인"/>
    <button type="submit" value="아이디찾기"><a href="findId" targer="_self"></a>아이디찾기</button>
    <button type="submit" value="비밀번호찾기">비밀번호찾기</button>
    <br>
    <button type ="submit" value="회원가입"><a href="userRegForm" target="_self">회원가입</a></button>

</form>
</body>
</html>