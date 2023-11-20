<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
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
</body>
	<h2>Fill below form to Check Your Account Balance</h2>
<form:form  modelAttribute="bank" action="/Showbalance">
		<table align="center" >
		<tr>
				<td>Enter your Account Number:</td>
				<td><form:input path="accountnumber"/></td>
			</tr>
			<tr>
				<td>Enter your name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Enter a password:</td>
				<td><form:password path="password"  showPassword="true"/></td>
			<tr>
				<td><input type="submit" name="submit" value="CHECK"></td>
				<td><input type="reset" value="clear" ></td>
			</tr>
		</table>
	</form:form>	
