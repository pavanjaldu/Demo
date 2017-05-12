<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
function validateFun(){
alert("aaa");
var userUri="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&type=restaurant&keyword=restaurant&key=AIzaSyAYk75AiXu0MUilUkroJh2MD-eo6L5pXLU";
var res = encodeURI(userUri);
  $.ajax({
   	url:res,
   	contentType : "application/json", 
  	type: 'GET',
  	dataType: "json",
headers: {
   			'Access-Control-Allow-Origin' : '*',
   		},  
   success: function(data) {
     alert(data);
   },
error: function() {
      alert("An error has occurred");
   }
    

});
}
</script>
</head>
<body>

<div onclick="validateFun()">
<p>Click me away!</p>
<p>Click me too!</p>
</div>

</body>
</html>