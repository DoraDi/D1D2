<%-- 
    Document   : index
    Created on : Sep 14, 2015, 11:24:41 PM
    Author     : Dora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>  
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
        <title>Login App</title>  
    </head>  
	<body>  
		<h1>Welcome Guest</h1>
		<h2>Please, identify yourself in the form below</h2>
	    <form action="Servlet" method="post">  
	        <fieldset style="width: 300px">  
	            <legend> Login </legend>  
	            <table>  
	                <tr>  
	                    <td>Username</td>  
	                    <td><input type="text" name="un" required="required" /></td>  
	                </tr>  
	                <tr>  
	                    <td>Password</td>  
	                    <td><input type="password" name="pw" required="required" /></td>  
	                </tr>  
	                <tr>  
	                    <td><input type="submit" value="Login" /></td>  
	                    <td><input type="reset" value="Cancel" name="cancel" /></td>
	                </tr>  
	            </table>  
	        </fieldset>  
	    </form>  
	</body>  
</html>  
