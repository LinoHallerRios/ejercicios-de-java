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
      int puntos = 0;
      if ((request.getParameter("1")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("2")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("3")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("4")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("5")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("6")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("7")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("8")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("9")).equals("a")) {
        puntos+=3;
      }
      if ((request.getParameter("10")).equals("a")) {
        puntos+=3;
      }

      if (puntos <= 10) {
        out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      }

      if (puntos <= 22 && puntos >= 11) {
        out.println(" Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
      }

      if (puntos > 22) {
        out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
      }
    %>
  </body>
</html>
