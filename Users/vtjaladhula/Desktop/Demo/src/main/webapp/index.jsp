<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
     
    <title>Login Page</title>

    <!-- Custom styles for this template -->
    <link href="/css/auth.css" rel="stylesheet">
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
<div id="tsparticles"></div>
<main class="box">
    <h2>Login</h2>
    <form action = "login" method = "post">
        <div class="inputBox">
            <label >Employee ID</label>
            <input type="number" name="empid"  
                   required/>
        </div><br>
        <div class="inputBox">
            <label >Password</label>
            <input type="text" name="p" 
                   required/>
        </div>
       
        <br>
        <input type = "submit" value = "Login">
        <input type=button onClick="location.href='Registration.jsp'" 
value='Sign In'>

    </form>
</main>
</body>
</html>