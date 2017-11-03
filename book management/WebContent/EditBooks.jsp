<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="CSS.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Books</title>
<style>
.bgimg{
       background-image:url("assingment3/WebContent/Images/Books.jpg");
       min-height:100%;
       background-poshition:center;
       bacground-size:cover;
}

</style>
</head>
<body>
<s:form action="edit">

<div class="w3-bar w3-grey w3-card-2" id="myNavbar">
<div class="w3-center">
<h1><b>Update Book Category</b></h1>   
</div> 
</div>
<br/>
<br/>
<br/>
<br/>

<table cellpadding="20" width="50%"  align="center" cellspacing="5" >
<tr>
    <td>
    <s:textfield name ="editName" label = "Name:"></s:textfield>
    <s:textfield name ="editCategory" label = " New category:"></s:textfield>
    </td>
    <td>
    <s:submit value="search" id="iterator"></s:submit>
</tr>
</table>


</s:form>

<s:form action="editxsearch" method="post">	
<s:iterator value="book">

    <s:textfield name ="editName" label="Book Title" value="Name"></s:textfield>

    <s:textfield name = "editAuthor" label="Author" value="Author"></s:textfield>
  
    <s:textfield name = "editBookLocation" label="Book Location" value="BookLocation"></s:textfield>
 
     <s:textfield name = "editCategory" label=" Category" value="Category"></s:textfield>
  
	<s:submit class="w3-button w3-light-grey" value = "Submit"></s:submit>

</s:iterator>




</s:form>

</body>
</html>