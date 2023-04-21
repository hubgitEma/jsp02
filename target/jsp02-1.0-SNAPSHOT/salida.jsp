<%@page import="com.emergentes.jsp02.registro"%>
<%
    registro  reg = (registro) request.getAttribute("registro");
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gracias por Registrarse</h1>
        <p>Los Datos recibidos son</p>
        <ul>
            
            <li>Nombre: <%= reg.getNombre()%> </li>
            <li>Telefono: <%= reg.getTelefono() %></li>
            <li>Correo: <%=reg.getEmail()%> </li>
            
        </ul>
            
            <a href="index.jsp"> volver al inicio</a>
    </body>
</html>
