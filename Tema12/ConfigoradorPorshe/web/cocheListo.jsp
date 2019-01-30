<%-- 
    Document   : cocheListo
    Created on : 29-ene-2019, 13:58:31
    Author     : Lino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Configura tu coche</title>
  </head>
  <body>
    <h1>Aquí tiene su coche. Disfrutalo!</h1>
    <img src="img/<%= request.getParameter("color") %><%= request.getParameter("llantas") %>.jpg">
  </body>
</html>
