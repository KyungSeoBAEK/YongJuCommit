<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css"
   href="${pageContext.request.contextPath}/resources/css/product.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="./WEB-INF/views/include/header.jsp"%>
<div style="width: 100%; height: 100%;">
<div style="width:100%; padding: 10px; margin-bottom: 10px;">
   <div style="width: 100%; margin-left: 2%;">
      <div  style="width:4%; float: left;">
         <a class="p_a" href="">home</a>
      </div>
      <div style="width:2%; float: left;">
         >
      </div>      
      <div style="width:4%; float: left;">
         <a class="p_a" href="">Pots</a>
      </div>
      <div style="width:2%; float: left;">
      </div>      
      <div style="width:4%; float: left;">
         <a class="p_a" href="">All Pots</a>
      </div>
   </div>
</div>

<div style="width:100%; height:auto; padding-top: 14px; margin-bottom: 10px">
   <div style="margin-left: 2%; float: left;">
      <div><img style="width: 540px; height: 780px;" alt="" src="${pageContext.request.contextPath}/resources/img/i1.png"></div>
   </div>
   <div style="padding-left: 10%; float: left;">
      <div class="p_prod">
         <div class="p_name" style="float: left;">Bouquet Optic Vase - Clear</div>
         <div class="p_icon.sold_out" style="float: left;">SOLD OUT</div>   
      </div>
   </div>
</div>
</div>

<div>
<%@ include file="./WEB-INF/views/include/footer.jsp"%>
</div>


<%-- <div style="padding: 5px; margin-left: 40px">
   <table width="100%">
      <tr>
         <td width="5%"><a href="">home</a></td>
         <td width="2%">></td>
         <td width="5%"><a href="">Pots</a></td>
         <td width="2%">></td>
         <td width="5%"><a href="all-pots/?idx=1">All Pots</a></td>
         <td width="75%">&nbsp;</td>
      </tr>
      <tr>
         <td><img style="width: 540px; height: 780px;" alt="" src="${pageContext.request.contextPath}/resources/img/i1.png">
      </tr>
   </table>
</div> --%>
</body>
</html>