<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="ua.com.goit.gojava.andriidnikitin.domain.model.*,ua.com.goit.gojava.andriidnikitin.domain.model.util.*,ua.com.goit.gojava.andriidnikitin.domain.service.*,
			java.util.Enumeration,ua.com.goit.gojava.andriidnikitin.ui.*,
			java.util.List"
				
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/stylesheet1.css" rel="stylesheet" type="text/css" />

<title>Retrieve</title>
</head>
<body>	
		
			<form action="act-type" method="post">
				<span>Type ID of category you want to retrieve :</span>
				<br/>
				ID<input type="text" name="id">
				<br/>
				<input type="submit" name="action" value="retrieve">
				<br/> 
			</form>	

	<a href="edit_type.html">Back</a>
</body>
</html>