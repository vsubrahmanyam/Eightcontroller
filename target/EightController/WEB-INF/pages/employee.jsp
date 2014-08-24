<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="/WEB-INF/templates/TagLibrary.jsp"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.ico">

    <title>Sticky Footer Navbar Template for Bootstrap</title>
    <%@ include file="/WEB-INF/templates/Scripts.jsp"%>
    
    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <%@ include file="/WEB-INF/templates/Header.jsp" %> 
    <body>
    <div class="container">
      <div class="page-header">
        <h1>${message}</h1>
        <fmt:message key="header" />
	 
      </div>
    </div>
   <%@ include file="/WEB-INF/templates/Footer.jsp" %> 
   </body>
</html>