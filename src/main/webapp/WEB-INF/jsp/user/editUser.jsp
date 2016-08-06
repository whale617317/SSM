<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>

</head>
<body> 

<form id="userForm" action="${pageContext.request.contextPath }/user/editUserSubmit.action" method="post" >
<input type="hidden" name="id" value="${userCustom.id }"/>
修改用户信息：
<table width="100%" border=1>
<tr>
	<td>用户名</td>
	<td><input type="text" name="username" value="${userCustom.username }"/></td>
</tr>
<tr>
	<td>密码</td>
	<td><input type="text" name="password" value="${userCustom.password }"/></td>
</tr>
<tr>
	<td>姓名</td>
	<td><input type="text" name="name" value="${userCustom.name }"/></td>
</tr>
<tr>
	<td>性别</td>
	<td><input type="text" name="sex" value="${userCustom.sex }"/></td>
</tr>
<tr>
	<td>手机</td>
	<td><input type="text" name="mobile" value="${userCustom.mobile }"/></td>
</tr>
<tr>
	<td>邮箱</td>
	<td><input type="text" name="email" value="${userCustom.email }"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</td>
</tr>
</table>

</form>
</body>

</html>