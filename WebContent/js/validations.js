function validateLogin(){
	debugger;
	var userName = document.forms["loginForm"]["login"].value;
	var password= document.forms["loginForm"]["password"].value;
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (userName == null || userName == ""){
		if (!filter.test(userName.value)){
	return false;
		}
		else {
			alert ("email is kadak!!");
		}
	}
	else if(password == null || password == "") {
		return false;
	}
	else{
		return true;
	}
}

function validateSignUp(){
	debugger;
	var userName = document.forms["loginForm"]["login"].value;
	var password= document.forms["loginForm"]["password"].value;
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (userName == null || userName == ""){
		if (!filter.test(userName.value)){
	return false;
		}
		else {
			alert ("email is kadak!!");
		}
	}
	else if(password == null || password == "") {
		return false;
	}
	else{
		return true;
	}
}