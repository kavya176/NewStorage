<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is my first project</h1>

<pre>
<f:form action="register" name="user" method="post">
Enter Name:<input type="text" name="name"/>
Enter Pass:<input type="text" name="pass"/>
Enter Mail:<input type="text" name="mail"/>
Enter Mobile:<input type="text" name="mobile"/>
<input type="submit" value="enter"/>
</f:form>


</pre>

</body>
</html>
