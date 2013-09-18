<%@page import="cse.maven.sample.Nic"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><u>Information</u></h1>
        <%
            try{
                String date=request.getParameter("number");
                Nic Info=new Nic(date);
                out.println("Birthday: "+Info.getYear()+"."+Info.getMonth()+"."+Info.getDay());
        %>
        <br>
        <%
            boolean isMale=Info.isMale();
            if(isMale)
                out.println("Gender: Male");
            else
                out.println("Gender: Female");
        %>
        <br>
        <%
            boolean isVoter=Info.isVoter();
            if(2013-Info.getYear()>=18)
                out.println("Is voter: Yes");
            else
                out.println("Is voter: No");
            }
            catch(Exception e)
            {
                out.println("Nic number Not valid");
            }
        %></h4>
    </body>
</html>
