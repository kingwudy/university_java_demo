/**
 * 
 */
function validInput() {
	if($("input[name='username']").val().trim()==""){
		alert("用户名不能为空！");
		return false;
	}else if($("input[name='password']").val().trim()==""){
		alert("密码不能为空！");
		return false;
	}else if($("input[name='password']").val()!==$("input[name='repassword']").val()){
		alert("两次密码不一致！");
		return false;
	}
	
	return true;
}
