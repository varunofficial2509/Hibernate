<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    <style>
    body {
    text-align: center;
}
form {
    display: inline-block;
}
    </style>
</head>
<body>

<h1>Registration Form</h1>


<form action="register">

<label><b>Full Name:
       </b>
       </label>
       <input type="text" name="name" placeholder="Enter your Name"><br><br>
<label><b>Department:
       </b>
       </label>
       <input type="text" name="dept" placeholder="Enter your Department"><br><br>
<label><b>Contact:
       </b>
       </label>
       <input type="text" name="contact" placeholder="Enter your Contact"><br><br>
<label><b>Email:
       </b>
       </label>
       <input type="text" name="email" placeholder="Enter your Email"><br><br>
<label><b>User Name:
       </b>
       </label>
       <input type="text" name="userName" placeholder="Enter your userName"><br><br>
<label><b>Password:
       </b>
       </label>
       <input type="text" name="passWord" placeholder="Enter your Password"><br><br>
<input type="submit" value="Register">
</form>
</body>
</html>