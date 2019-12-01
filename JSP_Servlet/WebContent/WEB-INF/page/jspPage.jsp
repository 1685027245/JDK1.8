<%@page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!-- jstl核心库 -->
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %><!-- jstl格式化标签库  -->
<!-- 
	jsp三种注释：
		1.前端html注释：会被转译，也会被发送，但是不会被浏览器执行
		2.java注释：会被转译，但不会被Servlet执行
		3.jsp注释：不会被转译
	page指令：
		language：jsp被编译的语言
		contentType：给浏览器的响应编码格式
		pageEncoding：当前jsp保存的编码格式
		import:导入的包
 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//声明java代码
	%>
	<!-- 基本标签 -->
	<c:out value="hello" default="haha"></c:out> <!-- 输出  -->
	<c:set var="vs" value="hello world" ></c:set> <!-- 设置key,value;可以通过el表达式获取 -->
	<c:remove var=""/><!-- 移除作用域中的键值对 -->
	<!-- 条件判断 -->
	<c:if test="条件"></c:if><!-- 判断 -->
	<c:choose><!-- 相当于switch -->
		<c:when test=""></c:when> <!-- when -->
		<c:when test=""></c:when> <!-- when -->
		<c:otherwise></c:otherwise><!-- 相当else -->
	</c:choose>
	<!-- foreach循环 -->
	<c:forEach begin="1" end="4" step="2" varStatus="vs"><!-- step:步长 ,varStatus:声明循环的数据  -->
		hello---${ vs.index }<br>
	</c:forEach>
	<c:forEach items="${ vs }" var="str"><!-- items:数据，可以时列表、数组、Map，var:每次循环取得的数值 -->
		hello--${ str }<br>
	</c:forEach>
	
	
</body>
</html>