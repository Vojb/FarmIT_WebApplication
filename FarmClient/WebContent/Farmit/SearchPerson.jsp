<%@ page contentType="text/html;charset=ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en"><head>
<meta charset="ISO-8859-1">
<title>Search Person</title>
</head>
<body>
<form action="/FarmClient/MainServlet" method="post">
<table cellspacing="0" cellpadding="0" border="0" align="left">
<tr>
 <td><h2>Search person:</h2></td>
</tr>
<tr>
 <td><input type="text" name="txtName" size="25" maxlength="25"></input>
 <input type="submit" name="submit" value="Skicka fråga" /></td>
 <td></td>
</tr>
</table>
<input name="operation" value="showperson" type="hidden">
</form>
</body>
</html>