<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {

		$("#id").change(function() {

			$.ajax({
				url : 'validateEmail',
				data : {
					id : $("#id").val()
				},
				success : function(responseText) {
					$("#errMsg").text(responseText);

					if (responseText != "") {
						$("#id").focus();
					}
				}

			});

		});

	});
</script>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
Id: <input type="text" name="id" id="id" /><span id="errMsg"></span>
Name: <input type="text" name="name" />
Email: <input type="text" name="email" />
<input type="submit" name="register" />
</pre>
	</form>

	<br />
	<h3>${result}</h3>

</body>
</html>