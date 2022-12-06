<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eat cookie with JS</title>
</head>
<body>
	
	<button onclick="getCookie()">Use a Cookie</button>
	<div id="putThatCookieDown"><div>
	
</body>
<!-- The below script is for reading the cookie with JS -->
<script type="text/javascript">
	function getCookie() {
		// this is how you can get a cookie
		let cookie = document.cookie;
		// print it
		console.log(cookie);
		// get the value of the cookie out
		console.log(cookie.split("=")[1]);
		// split it on the "=" and use the second part
		// put it somewhere on a page
		document.getElementById("putThatCookieDown").innerHTML = "Your cookie via Cookie is: " + cookie
				.split("=")[1];
	}
</script>

</html>