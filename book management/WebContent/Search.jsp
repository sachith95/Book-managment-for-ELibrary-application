<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="searchx" method="post">

<table cellpadding="20" width="50%"  align="center" cellspacing="5" >
<tr>
    <td>
    <s:textfield name ="keyword" label = "Name:"></s:textfield>
    </td>
    <td>
    <s:submit value="search" id="iterator"></s:submit>
    </td>
    </tr>
    </table>
    </s:form>
</body>
</html>