<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><head>
<html>
<head>
<!-- <link href="CFcss.css" rel="stylesheet" type="text/css" charset="utf-8" /> -->
<link href=".//resources//css//CFcss.css" rel="stylesheet" type="text/css" charset="utf-8"/>
<meta charset="utf-8">
<title>CheapFood</title>
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
			<center>
			<div id="etelek-gombok" align="center" >
			<table width="600px">
				<tr>
					<td >
						
							
								<button id="food-button" type="button">200 - 400 FT</button>
							
						
					</td>
					<td>
						
								<button id="food-button" type="button">400 - 600 FT</button>
						
					</td>

					<td>
					
							<button id="food-button" type="button">600 - 800 FT</button>
						
					</td>
					<td>
						<form:form method="GET" name="mainForm" action="/foods"
						commandName="commandName">
							<!--<button id="food-button" type="button">800 - 1000 FT</button> -->
						<!--	<input type="hidden" value="/foods" name="nameOfbutton"> -->
							<input type="submit" value="/foods" name="GOMB"/>
							
							<!--<input type="button"  onclick="location.href='keszitok.jsp'" value="keszitok" > -->
					</td>
				</tr>
				
			</table>
			</div>
			</center>
	 
	  </center>
</body>
<footer>
	<p class="footer-text"> <script>document.write(new Date().getFullYear())</script> © Cheap Foods </p>
</footer>
</html>