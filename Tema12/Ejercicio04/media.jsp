<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Media de 3 notas</title>
  </head>
  <body>
    <%
      double media=0;
      media = (Double.parseDouble(request.getParameter("nota1")) + Double.parseDouble(request.getParameter("nota2")) + Double.parseDouble(request.getParameter("nota3"))) / 3;
    %>
    <h1>La media es: <%= media%></h1>
  </body>
</html>
