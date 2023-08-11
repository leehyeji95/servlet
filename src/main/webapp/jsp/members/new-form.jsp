<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    username: <input type="text" name="username"/>
    age:      <input type="text" name="age"/>
    <button type="submit">전송</button>
</form>
</body>
</html>
<%--호출 시 디렉토리명으로 /jsp/members/new-form.jsp--%>
