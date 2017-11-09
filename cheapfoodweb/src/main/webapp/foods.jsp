<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html ng-app>
	<head>
		<link href=".//resources//css//CFcss.css" rel="stylesheet" type="text/css" charset="utf-8"/>
		<meta charset="utf-8">
		<title>CheapFood</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
		<script>
		function myFunction($scope, $http) {
			$http.get('http://172.22.223.195:8080/CheapFood/foodslist.json').success(function (data) {
				$scope.foodslist=data;
			});
			//alert("Your book is overdue");
		}
		function myFunction2() {
			var x = document.getElementById("asd").tagName;
			alert("dfasdfasfafdasfa "+x);
			//document.getElementById("demo").innerHTML = x;
		}
		</script>
	</head>
	<body style="margin:0; background-image: url(resources/images/hatter.jpg);">
	<div >
		<center>
			<table class="headertable">
				<tr>
					<td>
						<a href="index.jsp"><img src="resources/images/CheapFoodsLogo.png" style="width:50px;margin-right:195px;padding-top: 10px"></a>
					</td>
					<td>
						<p class="cim">Welcome to Cheap Foods!</p>
					</td>
					<td>
						<a href="index.jsp"> <img src="resources/images/CheapFoodsLogo.png" style="width:50px;margin-left:195px;padding-top: 10px"></a>
					</td>
				</tr>
			</table>
		</center>

		<center>
			<hr width="900px">
			<div class="menu">
				<table style="text-align: center;height: 40px">
					<tr>
						<td class="menutd">
							<a href="index.jsp" class="headerlink">Főoldal</a>
						</td>
						<td class="menutd">
							<a href="keszitok.jsp" class="headerlink">Készítők</a>
						</td>
						<td class="menutd">
							<a href="foods.jsp" class="headerlink">Ételek</a>
						</td>
					</tr>
				</table>
			</div>
		</center>
	</div>
	<hr width="900px">
	<center>
		<div id="etelek-feliras" align="center">
			<table style="text-align: center;">
				<tr>
					<td>
						<p>
							<strong>Válassz, mennyi pénzt szánsz az étel elkészítésére:</strong>
						</p>
					</td>
				</tr>
			</table>
		</div>
	</center>
	<center>
		<div id="etelek-gombok" align="center" >
			<table width="600px">
				<tr>
					<td >
						<button id="food-button" type="button">200 - 400 FT</button>
					</td>
					<td>
						<button id="food-button1" type="button">400 - 600 FT</button>
					</td>
					<td>
						<button id="food-button2" type="button">600 - 800 FT</button>
					</td>
					<td>
						<button onclick="myFunction2()" onload="myFunction()" >Try it</button>
					</td>
				</tr>
			</table>
		</div>
	</center>

	<center>
		<div id="etelek-lista" align="center" >
			<button id="asd" onclick="myFunction2()">fasdfasdfasdf</button>
			<div ng-controller="myFunction">
				{{foodslist.length}}
				<ul class="foodslist-container">
					<li ng-repeat="food in foodslist">
						{{food.id}} {{food.name}} {{food.mennyiseg}}
					</li>
				</ul>
			</div>
		</div>
	</center>
<!--
		<div ng-controller="myFunction">
			{{foodslist.length}}
			<ul class="foodslist-container">
				<li ng-repeat="food in foodslist">
					{{food.name}}
				</li>
			</ul>
		</div>
		-->
	</body>

</html>