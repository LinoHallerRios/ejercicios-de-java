<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cuestionario</title>
  </head>
  <body>
    <h1>Resultados</h1>
    <br>
    <%
      int puntos=0;
      if ((request.getParameter("1")).equals("b")) {
         puntos++;
      }
      if ((request.getParameter("2")).equals("b")) {
         puntos++;
      }
      if ((request.getParameter("3")).equals("b")) {
         puntos++;
      }
      if ((request.getParameter("4")).equals("b")) {
         puntos++;
      }
      if ((request.getParameter("5")).equals("c")) {
         puntos++;
      }
      if ((request.getParameter("6")).equals("a")) {
         puntos++;
      }
      if ((request.getParameter("7")).equals("b")) {
         puntos++;
      }
      if ((request.getParameter("8")).equals("a")) {
         puntos++;
      }
      if ((request.getParameter("9")).equals("c")) {
         puntos++;
      }
      if ((request.getParameter("10")).equals("c")) {
         puntos++;
      }
    %>
    Has acertado <%= puntos %> de 10 preguntas.
  </body>
</html>
