<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<body>
<h2>表单提交</h2>


<form action="/xin/user/info" id= "form"  method="POST">
username: <input id="username" name="username" type = "text" >
password :<input id="password" name="password" type = "password">


<input type="submit" name="submit" value="提交"/>
</form>
</body>
</html>
