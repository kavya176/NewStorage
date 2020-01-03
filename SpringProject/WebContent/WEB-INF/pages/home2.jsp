<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
    <html>  
    <head>  
    <style>  
    .error{color:red}  
    </style>  
    </head>  
    <body> 
     <form:form> 
    <form:form action="helloagain" modelAttribute="emp">  
    	 <table>
            <tr>
                <td>Enter your name:</td>
                <td><form:input path="name" cssClass="error" /></td>
                <td><form:errors path="name" cssStyle="color: #ff0000;"/></td>
            </tr>
            <tr>
                <td>Enter your last name:</td>
                <td><form:input path="pass" cssClass="error" /></td>
                <td><form:errors path="pass" cssStyle="color: #ff0000;"/></td>
            </tr>
            <tr>
                <td><input type="submit" name="submit" value="Submit"></td>
            </tr>
            <tr>
        </table>
    </form:form>  
     </form:form>
    </body>  
    </html>  