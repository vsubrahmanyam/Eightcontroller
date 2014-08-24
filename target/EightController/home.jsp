<fmt:setBundle basename="ApplicationResources"/>
<html>
<head>
<title>

</title>
</head>
<body>
<%=request.getParameter("submit") %>
Result of previous request (<%=request.getParameter("submit") %>) :
<b><%=request.getParameter("operand1") %>,<%=request.getParameter("operand2") %> is <%=request.getParameter("result") %></b>
<form action="multiaction.spring" method="POST">
    Operand1 : <input type="text" name="operand1"/><br/>
    Operand2 : <input type="text" name="operand2"/><br/>
    <input type="submit" name="submit" value="byNumber" />
    <input type="submit" name="submit" value="byName" />
</form>
</body>
</html>
