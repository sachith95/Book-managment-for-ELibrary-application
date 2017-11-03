<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="CSS.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
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
<form action="">
<div class="bgimg w3-display-container ">
<div class="w3-bar w3-grey w3-card-2 w3-text-grey" id="myNavbar">
<div class="w3-center ">
<h1><b> Home      </b></h1>   
</div> 
</div>
<br/>
<br/>
<br/>
<br/>
<div class="w3-container ">
<table cellpadding="20" width="50%"  align="center" cellspacing="5" >
<tr>
    <td>

       <button type="button" class="w3-button w3-light-grey w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off" onclick="window.location.href='../HSApp/viewall.jsp'">View All</button>
   

    </td>
</tr>
<tr>
    <td>
    <button type="button" class="w3-button w3-light-grey w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off"onclick="window.location.href='../HSApp/Search.jsp'">Search a Books</button>
    </td>
</tr> 
<tr>
   <td>
    <button type="button" class="w3-button w3-light-grey w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off" onclick="window.location.href='../HSApp/AddBook.jsp'">Add Books</button>
    </td>
</tr>     
<tr>
    <td>
    <button type="button" class="w3-button w3-light-grey w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off" onclick="window.location.href='../HSApp/EditBooks.jsp'">Edit Books</button>
    </td>
</tr> 
<tr>
   <td>
    <button type="button" class="w3-button w3-light-grey w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off" onclick="window.location.href='../HSApp/delete.jsp'">Delete Books</button>
    </td> 
</tr>      
</table>
</div>

</div>
</form>
</body>
</html>