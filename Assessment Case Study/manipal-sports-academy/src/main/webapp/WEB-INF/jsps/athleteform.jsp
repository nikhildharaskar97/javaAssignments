<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addAthlete" method="post" name="atheleteForm"  onsubmit="return validateForm()">

    <table border="1">
    <tr>
    	<td>Athlete Name</td> <td><input type="text" name="name" id="userName" pattern="[A-Z][a-z]*" title="Enter Username"/> </td>
    	
    	
    	
    	
    </tr>
    
    <tr>
    <td>Gender</td><td>	 <label for="male">Male</label> <input type="radio" id="male" name="gender" value="male" /><label for="female">Female</label> <input type="radio" name="gender" id="female" value="female"/> <br/>
    	</td>
    </tr>
    <tr>
    <td>Category</td>  <td><select id="categories" name="category" class="required">
				<option value="" disabled="disabled">Select</option>
				  <option value="Running">Running</option>
				  <option value="High Jump">High Jump</option>
				  <option value="Hurdles">Hurdles</option>
				  <option value="Relay">Relay</option>
				  <option value="Javelin Throw">Javelin Throw</option>
				  <option value="Shot put">Shot put</option>
			</select></td>
    </tr>
    
    
    <tr>
    <td>Email</td>  <td><input type="text" name="email" id="email"/> <br/></td>
    </tr>
    
    <tr>
    <td>Mobile</td>  <td><input type="text" name="mobile" id="mobile"/></td>
    </tr>
    
    <tr>
    <td><input id="submit" type="submit" value="Add" /> <input type="button" value="Cancel" onClick="location.reload()" /></td>  <td><a href="index.jsp">Home</a></td>
    </tr>
    </table>
	
    
	
	
	
	
</form>

<script type="text/javascript">
	var submit = document.getElementById("submit");
	
	function validateForm() {
		  var x = document.forms["atheleteForm"]["userName"].value;
		  if (x == "" || x == null) {
		    alert("Name must be filled out");
		    return false;
		  }
		  
		  var y = document.forms["atheleteForm"]["gender"].value;
		  if (!document.getElementById("male").checked && !document.getElementById("female").checked) {
		    alert("Gender must be selected");
		    return false;
		  }
		  
		  
		  
		  var e = document.getElementById("email").value; 
		  var pattern = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
		    if (!pattern.test(e)) {
		    	alert('Bad email address: ' + e);
		        return false;
		    } 
		  
		    
		    
		    var m = document.getElementById("mobile").value;
		    if(isNaN(parseInt(m)) || m.length!=10){
		    	alert("Please enter the proper mobile number");
		        return false;
		    }
		  
		 
		  
		  
		  
		  
		  
		}
</script>

</body>
</html>