<%-- 
    Document   : editnote
    Created on : Feb 5, 2023, 4:47:57 PM
    Author     : migue
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
    </head>
    
    <body>
        
        <%--Title--%>
        <h1>Sample Note Keeper</h1>
        
        <%--CurrentState--%>
        <h2>Edit Note</h2>

        <%--NoteTitle--%>
        <form name="nForm" method="post" action="note">
        
            <%--NoteTitle--%>        
            <h3>Title: </h3>
            <input type="text" id="title" name="title" value="${title}">

            <%--NoteContent--%> 
            <h3>Contents: </h3>
            <input type="text" id="content" name="content" value="${content}">

            <%--Button--%> 
            <input type='text' value='Save'>
        
        </form>
        
    </body>
    
</html>
