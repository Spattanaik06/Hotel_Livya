<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String msg=(String)request.getAttribute("msg");
out.println(msg);
HotelBean hbBean=(HotelBean)session.getAttribute("hbean");
out.println("Welcome ,"+hbBean.getCname()+"<br>");

%>

<a href="food.jsp"> Food</a>
<a href="hotelroom.jsp">Hotel Rooms</a>

</body>
</html>