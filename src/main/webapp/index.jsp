<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<fmt:setBundle basename="ApplicationResources" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Annotation Base MultiAction Controller Example Demo</title>
<%@ include file="/WEB-INF/templates/Scripts.jsp"%>

</head>
<body>
	<%@ include file="/WEB-INF/templates/Header.jsp"%>
	<div class="container">
		<div class="page-header">

			<!-- 
	<form action="scfu.spring" method="POST">
		 <a href="employee/add.htm">Add Employee</a> | <a
			href="employee/update.htm">Update Employee</a> | <a
			href="employee/delete.htm">Delete Employee</a> <input type="radio"
			name="searchBy" value="add" />Add Employee<br /> <input type="radio"
			name="searchBy" value="update" />Update Employee<br /> <input
			type="radio" name="searchBy" value="delete" />Delete Employee<br />
			 <input type="radio" name="searchBy" value="userReg" />User Reg<br />
			<input type="submit" value="submit" />
	</form> -->
			<div class="page-header">
				<h1 id="container">
					<fmt:message key="header" />
				</h1>
			</div>
			<div class="jumbotron">
				<h1>Urls</h1>
				<p>The following Urls directs you as specified.</p>
				<p>
					<a href="scfuserlist" class="btn btn-primary btn-lg">List ScfUsers</a>
					<a href="scfuserreg"  class="btn btn-primary btn-lg">Add ScfUser</a>
					<a href="listInv"  class="btn btn-primary btn-lg">List Investors</a>
					<a href="addInv"  class="btn btn-primary btn-lg">Add Investor</a>
				</p>
			</div>
		</div>
	<%@ include file="/WEB-INF/templates/Footer.jsp"%>
	</div>
</body>
</html>