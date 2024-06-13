<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	<form action="student" method="get"> -->
	<form action="student" method="post">
<!-- 	post 방식인데 get 방식으로 받을 때 오류 출력 => HTTP 상태 405 - 허용되지 않는 메소드 -->
		student id : <input type="text" name="id"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>