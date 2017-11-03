<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="CSS.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Books</title>
<style>
.bgimg{
       background-image:url("/HSApp/WebContent/Books.jpg);
       min-height:100%;
       background-poshition:center;
       bacground-size:cover;
}

</style>
</head>
<body>
<s:form action="addx" method="post">
<div class="bgimg w3-display-container ">
<div class="w3-bar w3-grey w3-card-2" id="myNavbar">
<div class="w3-center">
<h1><b>ADD BOOKS</b></h1>   
</div> 
</div>
<br/>
<br/>
<br/>
<br/>

<div class="w3-container ">
<table cellpadding="10" width="30%"  align="center" cellspacing="5" >
<tr>
    <td>
    <s:textfield name ="Name" label="Book Title" disabled="#flag"></s:textfield>
   </td>
</tr>
 <tr>
     <td>
    <s:textfield name = "Author" label="Author"></s:textfield>
    </td>
</tr>    
<tr>
   <td>    
    <s:textfield name = "BookLocation" label="Book Location"></s:textfield>
    </td>
</tr>    
<tr>
   <td>  
     <s:textfield name = "Category" label=" Category"></s:textfield>
  </td>
</tr>
<tr>
   <td>  
	<s:submit class="w3-button w3-light-grey" value = "Submit"></s:submit>
    </td>
</tr>     
    
</table>
</div>    
</div>
</s:form>

</body>
</html>