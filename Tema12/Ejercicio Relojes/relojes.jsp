<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relojes a medida</title>
  </head>
  <body>
    <h1>Aquí tiene su reloj a medida</h1>
    <br>
    <img src="img/relojes/reloj_<%= request.getParameter("material")%>_<%= request.getParameter("color")%>.png">
  </body>
</html>
