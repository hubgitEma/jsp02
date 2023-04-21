
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Registro de datos</h1>
        <form action ="procesa" method="POST">
            <label>Nombre</label>
            <input type="text" name="nombre" value=""/>
            <br>
            <label>Telefono</label>
            <input type="text" name="telefono" value=""/>
            <br>
            <label>Email</label>
            <input type="email" name="email" value=""/>
          <br>
          <input type="submit" value="Enviar"/>
    </body>
</html>
