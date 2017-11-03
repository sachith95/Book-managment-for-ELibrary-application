<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
    <%@ page import="java.util.List"%>
     
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="bgimg w3-display-container ">
<div class="w3-container w3-grey">
 <table id="books" border="2" cellpadding="10" width="50%"  align="center" cellspacing="5" >
<tr>
 <th>Id</th>
 <th>Name</th>
 <th>Author</th>
 <th>Category</th>
  </tr>
<s:iterator value="books" var="books">
<tr>
		<td><s:property value="id"/></td>
		<td><s:property value="Name"/></td>
		<td><s:property value="Author"/></td>
		<td><s:property value="Category"/></td>
	</tr>	
</s:iterator>
  <tr>
  </tr>
 </table>
</div>
</div>




  

</body>
</html>