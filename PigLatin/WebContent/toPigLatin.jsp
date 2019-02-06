<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To Pig Latin</title>
</head>
<body>
<h1>Pig Latin Translator</h1>
<h3>To Pig Latin to English</h3>

<form action="toPigLatin" method="post">

	<label>
		Enter an English word:
		<input type="text" name="fromWord" id="fromWord">
	</label>
	
	<input type="submit" value="Translate">
	
</form>

<p>That word in Pig Latin is: ${toWord.translateToPigLatin()}</p>

<a href="fromPigLatin.jsp">From Pig Latin</a>

</body>
</html>