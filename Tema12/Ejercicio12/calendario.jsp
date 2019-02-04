<%@page import="java.util.Locale"%>
<%@page import="java.time.Month"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"  %>
<%@ page import="java.time.LocalDate"  %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calendario</title>
    
  </head>
  <body>
    <h1>Calendario</h1>
    <%
      LocalDate date = LocalDate.of(Integer.parseInt(request.getParameter("ano")), Integer.parseInt(request.getParameter("mes")), 1);
      int days = date.lengthOfMonth();
      for (int i=1; i<days; i++){
        LocalDate date1 = LocalDate.of(Integer.parseInt(request.getParameter("ano")), Integer.parseInt(request.getParameter("mes")), i);
        out.println(date1);
      }
    %>
  </body>
</html>
