<!DOCTYPE html>
<html>	
	<head>
	<script>
	    function checkForAlphanumeric(inputtxt){   
	    	var letters = /^[0-9a-zA-Z]+$/;  
	    	if(inputtxt.value.match(letters)){  
				return true;  
	    	}else{  
	    		alert('Please input alphanumeric characters only');  
	    		return false;  
	    	}  
	    }  
	</script>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Welcome to Interview Simulator</title>
	</head>
		<body bgcolor="Azure">
			<center>
			<p><img src ="IMG/welcome.png" width="320" height="240"></p>
			<form name="form" action="Hostes" onsubmit="return checkForAlphanumeric(document.form.fname)" 
				method="post">
				<table border = "0">
				<tr>
					<td> name: </td> <td> <input type="text" name="fname" />
					<input type = "submit" value = "Submit" /> </td>
				</tr>
			</table>
			</form>
		</center>
	</body>
</html>