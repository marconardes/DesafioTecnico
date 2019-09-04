<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="Authorization" content="OAuth"> 
<title>MainPage</title>
</head>
<body>
	
	<form action="/v1/converter" method="post" enctype="multipart/form-data">
            <input name="Authorization" value="1af4797c-d23c-4f6f-9d63-9d8496a13e14" />
             <input type="file" name="upload" id="upload">
            <input type="submit" />
	</form>
</body>
</html>