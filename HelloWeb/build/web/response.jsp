<%-- 
    Document   : response
    Created on : Sep 25, 2022, 12:54:31 AM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler"
                     />
        <jsp:useBean id="mybean1" scope="session" class="org.mypackage.hello.NameHandler"
                     />
        <jsp:useBean id="mybean2" scope="session" class="org.mypackage.hello.NameHandler"
                     />
        
        <jsp:setProperty name="mybean" property="name" />
        <h1>Hola, <jsp:getProperty name="mybean" property="name" /> !</h1>
         
        <jsp:setProperty name="mybean1" property="fechaNacimiento" />
        <h2>Fecha de nacimiento: <jsp:getProperty name="mybean1" property="fechaNacimiento" /> !</h2>
        
        <jsp:setProperty name="mybean2" property="edad" />
        <h2>Su edad es: <jsp:getProperty name="mybean2" property="edad" /> !</h2>
        
</body>
</html>
