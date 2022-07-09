<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
		
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
<title>create location</title>
</head>
<body>
<form action="saveLoc" method="post">
<pre>
Id: <input type="text" name="id"/>
code: <input type="text" name="code"/>
name: <input type="text" name="name"/>
Type: URBAN <input type="radio" name="type" value="URBAN"/>
	RURAL <input type="radio" name="type" value="RURAL"/>
<input type="submit" value="Save">
</pre>
</form>
${msg}
</body>
</html>