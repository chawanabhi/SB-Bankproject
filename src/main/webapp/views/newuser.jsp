<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<body bgcolor="aqua" style="color:yello;text-align: center; " >
<h1 style="text-align: center;color: black;" >SBFC BANK</h1>
<h3 style="text-align: center;color: black;">EXTRAORDINARY SERVICES</h3>
<a href="/">Home</a>
<a href="/newaccount">New Account</a>
<a href="/balance">Balance</a>
<a href="/deposite">Deposite</a>
<a href="/withdraw">Withdraw</a>
<a href="/transfer">Transfer</a>
<a href="/closeac">Close a/c</a>
<a href="/aboutus">AboutUs</a>

<html>
<head>
<title>Spring MVC form tags</title>
</head>
	<h2>Fill below form to New Account</h2>

	<form:form  modelAttribute="bank" action="/register">
		<table align="center" >
		<tr>
				<td>Enter your Account Number:</td>
				<td><form:input  path="accountnumber"/></td>
			</tr>
			<tr>
				<td>Enter your name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Enter a password:</td>
				<td><form:password path="password"  showPassword="true"/></td>
			<tr>
				<td>Confirm your password:</td>
				<td><form:password path="conformpassword" showPassword="true"/></td>
			</tr>	
			<tr>
				<td>Enter your Balance:</td>
				<td><form:input path="balance" /></td>
			</tr>
			<tr>
				<td>Enter your Address:</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td>Enter your Mobileno:</td>
				<td><form:input path="mobileno" /></td>
			</tr>	
			<tr>
				<td><input type="submit" name="submit" value="Register"></td>
				<td><input type="reset" value="clear" ></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
