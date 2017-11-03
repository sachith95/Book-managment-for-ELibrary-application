<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="CSS.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loging in </title>
</head>
<body>
<s:form action="login">
 <div class="container w3-display-middle" >
    
    

    
    
    <table cellpadding="20" width="50%"  align="center" cellspacing="5" >
<tr>
    <td> 
    <s:textfield name ="username" label="User name"></s:textfield>
    </td>
</tr>
<tr>
     <td>
     <s:textfield name ="password" label="Pasword"></s:textfield>    
     <br/>
     </td>
</tr>           
</table>
<center>
<button type="button" class="w3-button w3-light-grey w3-margin-top w3-opacity w3-hover-opacity-off">Register</button>
<s:submit class="w3-button w3-light-grey w3-margin-top w3-opacity w3-hover-opacity-off" value = "Login"></s:submit>
  </center>
  </div>


</s:form>
</body>
</html>