<%@ page language="java" contentType="text/html; charset=utf-8"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="css/view.css" media="all" />
</head>
<body>
  <div class="users_container">
      <div class="single_user_container">
        <h3>
            <c:out value="${requestScope.details.getName()}"/>
        </h3>
        <div class="skills_container">

        </div>
        <div class="attributes_container">
        </div>
      </div>
  </div>

</body>
</html>