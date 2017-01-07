
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/test.css">
<title>Insert title here</title>
<script type="text/javascript">
	function confirmBox() {
		var location = confirm("Do you want to go to this page?");
		debugger;
		if (location == true) {
			window.location = "${pageContext.request.contextPath}/index";
		} else {
			window.location = "login.jsp";
		}
	}
</script>
</head>
<body>

	<div class="login">
		<h1>Register:</h1>
		<s:form action="/register" method="post"  >
		<s:textfield name="emp.contact" label="Contact" placeholder="Contact">
		
				
			
			
				
		
			<s:textfield  name="emp.email" label="Email" placeholder="Email"
				required="required">
			
			<s:password name="emp.password" label="Password"
				placeholder="Password" required="required">
				
			<s:textfield name="emp.lastName" label="Lastname"
				placeholder="Last Name" required="required">

				<s:textfield name="emp.firstName" label="Firstname"
				placeholder="First Name " required="required">
			
			<s:select label="Select dept" headerKey="-1"
				headerValue="Select Dept"
				list="#{'1':'Sales', '2':'Marketing', '3':'Testing', '4':'Developement'}"
				name="emp.department" >


			
			</s:select> </s:textfield> </s:textfield> </s:password> </s:textfield> 	 </s:textfield>
				<div class="login-help">
		<p>
			Already member? <a href="login.jsp">Login</a>.
		</p>
		</div>
			<p class="submit">
				<s:submit name="commit" value="Register" ></s:submit>
			</p>
		
		</s:form>
	</div>


</body>
</html>