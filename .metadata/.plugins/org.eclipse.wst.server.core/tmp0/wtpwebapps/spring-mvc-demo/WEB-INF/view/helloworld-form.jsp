<!DOCTYPE html>
<html>
<head>
	<title>
		input form
	</title>
</head>
<body>
	// if write "/process/a" here, the path will not be handled correctly 
	because it will be considered the root path without the /spring-mvc-demo prefix
	<form action="processFormV2" method="GET">
	
		<input type="text" name="studentName"
			placeholder="what's your name" />
			
		<input type="submit" />
	</form>
	
	${student.firstName} ${student.lastName}
</body>
</html>