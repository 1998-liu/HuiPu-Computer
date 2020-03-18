<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<style type="text/css">

	body{
		margin: 0;
		padding: 0;
		font-family: sans-serif;
		background: url(images/a.jpg) no-repeat;
		background-size: cover;
	}
	.box{
		padding: 10px;
		position: absolute;
		top: 50%;
		left: 50%;
		transform: translate(-50%,-50%);
		width:350px;
		height: 250px;
		background: rgba(0,0,0,0.5);
		box-sizing: border-box;
		box-shadow: 0 15px 25px rgba(0,0,0,0.5);
		border-left: 10px;
		border-radius: 10px;
	}
	.box h2{
		padding: 0;
		color: #ffffff;
		font-size: 24px;
		text-align: center;
	}
	.inputBox{
		position: relative;
	}
	.box  .inputBox input{
		width: 100%;
		font-size: 16px;
		color: white;
		margin: 20px 0 15px 0;
		border: none;
		border-bottom: 1px solid #ffffff;
		outline: none;
		background: transparent;
	}
	.box .inputBox label{
		position: absolute;
		top: 20px;
		left: 0;
		padding: 1px 0;
		font-size: 16px;
		color: white;
		pointer-events: none;
		transition: 0.5s;
	}
	.box .inputBox input:focus~ label,
	.box .inputBox input:valid~ label{
		top: -10px;
		left: 0;
		color: rgba(255, 253, 253, 0.5);
		font-size: 16px;
	}
	#sb{
		position: absolute;
		font-size: 15px;
		left: 43%;
		margin-top: 10px;
		border: none;
		outline: none;
		color: white;
		background:rgba(255,37,33,0.5);
		padding: 2px 10px;
		cursor: pointer;
		border-radius: 5px;
	}
	</style>
</head>
<body>
	<div class="box">
		<h2>GDUFE</h2>
		<form id="f1" role="form" action="/login" method="post">
				  <div class="inputBox">
						<input type="text" id="text1" name="username"  required="true">
						<label>用户id</label>
				  </div>
				  <div class="inputBox">
						<input type="password" id="pass1" name="password" required="true">
						<label >密码</label>
				  </div>
					<input type="submit" id="sb" value="登  录"></input>
				</form>
	</div>




</body>

<script>

	$(function (){
		var name = '${error}';
		console.log(111,name)
        if (name==="") {
        }else{
			alert(name);
		}
	})

</script>


</html>