
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Login Form</title>
<link rel="stylesheet" href="css/test.css">
<!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<script src="js/validations.js"></script>
</head>
<body>

	<div class="login">
		<h1>Login to Web App</h1>
		<s:if test="hasActionErrors()">
			<div class="errors">
				<s:actionerror />
			</div>
		</s:if>
		<s:form method="post" action="login" name="loginForm"
			onsubmit="return validateLogin()">


			<s:textfield value="" placeholder="Username or Email"
				required="required" name="emp.email">
			</s:textfield>
			<s:password value="" placeholder="Password" required="required"
				name="emp.password">
			</s:password>


			<s:checkbox name="remember_me_name" id="remember_me" label="Remember me."
				class="remember_me" value="isRemember"></s:checkbox>
				<s:label>Forgot Password? <a href="index.html"> Reset it</a>.</s:label>

			<s:submit name="commit" value="Login">
			</s:submit>
		</s:form>

		<div class="login-help">
			<p>
				Not a member, Register? <a href="register.jsp"><b>Click Here</b></a>.
			</p>
		</div>
	</div>





</body>
</html>