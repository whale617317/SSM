<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户列表</title>
</head>
<body> 
<form action="${pageContext.request.contextPath }/user/queryUser.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
用户列表：
<table width="100%" border=1>
<tr>
	<td>用户名</td>
	<td>密码</td>
	<td>姓名</td>
	<td>性别</td>
	<td>年龄</td>
	<td>手机</td>
	<td>邮箱</td>
	<td>操作</td>
</tr>
<c:forEach items="${userList }" var="user">
<tr>
	<td>${user.username }</td>
	<td>${user.password }</td>
	<td>${user.name }</td>
	<td>${user.sex }</td>
	<td>${user.age }</td>
	<td>${user.mobile }</td>
	<td>${user.email }</td>
	<td><a href="${pageContext.request.contextPath }/user/editUser.action?id=${user.id}">修改</a></td>
</tr>
</c:forEach>

</table>
</form>
</body>

</html>