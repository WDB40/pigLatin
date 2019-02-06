<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>From Pig Latin</title>
</head>
<body>
<h1>Pig Latin Translator</h1>
<h3>From Pig Latin to English</h3>

<form action="fromPigLatin" method="post">

	<label>
		Enter a Pig Latin word:
		<input type="text" name="fromWord" id="fromWord">
	</label>
	
	<input type="submit" value="Translate">
	
</form>

<p>That word in English is: ${toWord.translateBackToEnglish()}</p>

<a href="toPigLatin.jsp">To Pig Latin</a>

</body>
</html>