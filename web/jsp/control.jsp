<%-- 
    Document   : control.jsp
    Created on : Apr 3, 2012, 10:46:08 AM
    Author     : steve
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

    <head>
        <title>DigiTrain Controller - Web Interface</title>
        <link rel="stylesheet" type="text/css" href="/Marklin_Trains/css/general.css" />
    </head>
    <body>
        <div id="container">
            <h1 id="title">DigiTrain Controller</h1>
            <div id="controller">
                <form>
                    <p>Select Train:</p>
                    <p>
                        <s:select name="selectedTrain" list="availableTrains" value="selectedTrain" />
                    </p>
                    <p>
                        <s:submit align="left" value="Go!" action="go"/> <s:submit align="left" value="Stop!" action="stop"/>
                    </p>
               </form>
            </div>
        </div>

    </body>
</html>