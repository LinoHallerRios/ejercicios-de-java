<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tablas de multiplicar</title>
    <style>
      table, th, td {
        border: 1px solid black;
      }
    </style>
  </head>
  <body>
    <h1>Tablas de multiplicar</h1>
    <div id="wrapper">
      <h3>Tabla del <%= request.getParameter("tabla")%></h3>
      <table style="width:50%; text-align: center;">
        <tr>
          <td>0</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 0)%></td>
        </tr>
        <tr>
          <td>1</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 1)%></td>
        </tr>
        <tr>
          <td>2</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 2)%></td>
        </tr>
        <tr>
          <td>3</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 3)%></td>
        </tr>
        <tr>
          <td>4</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 4)%></td>
        </tr>
        <tr>
          <td>5</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 5)%></td>
        </tr>
        <tr>
          <td>6</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 6)%></td>
        </tr>
        <tr>
          <td>7</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 7)%></td>
        </tr>
        <tr>
          <td>8</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 8)%></td>
        </tr>
        <tr>
          <td>9</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 9)%></td>
        </tr>
        <tr>
          <td>10</td>
          <td>X</td>
          <td><%= request.getParameter("tabla")%></td>
          <td>=</td>
          <td><%= (Integer.parseInt(request.getParameter("tabla")) * 10)%></td>
        </tr>
      </table>
        <br>
        <a href="index.html"><button type="button">Volver</button></a>
    </div>    
  </body>
</html>
