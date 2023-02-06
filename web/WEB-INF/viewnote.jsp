<%-- 
    Document   : viewnote
    Created on : Feb 5, 2023, 4:47:32 PM
    Author     : migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View</title>
    </head>
    
    <body>
        
        <%--Title--%>
        <h1>Sample Note Keeper</h1>
        
        <%--CurrentState--%>
        <h2>View Note</h2>

        <%--NoteTitle--%>        
        <h3>Title: </h3>
        <p>${nData.title}</p>
        
        <%--NoteContent--%> 
        <h3>Contents: </h3>
        <p>${nData.content}</p>
        
        <%--Link--%> 
        <a href="noteservlet?edit" name='edit'>Edit</a>
        
    </body>
    
</html>
