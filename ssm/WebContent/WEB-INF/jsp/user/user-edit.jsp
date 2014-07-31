<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑用户</title>
</head>
<body>
<form action="${ctx}/user/update.htm" method="post">
<input type="hidden" name="userIds" value="${model.userIds}">
<input type="hidden" name="createTimes" value='<fmt:formatDate value="${model.createTimes}" pattern="yyyy-MM-dd HH:mm:ss"/>'>
用户名：
<input name="userName" type="text" value="${model.userName}">
用户账户：
<input name="userAccount" type="text" value="${model.userAccount}"><Br/>
公司：
<input name="company" type="text" value="${model.company}">
密码：
<input name="password" type="password" value="${model.password}"><Br/>
手机：
<input name="mobile" type="text" value="${model.mobile}">
电话：
<input name="telephone" type="text" value="${model.telephone}"><Br/>
用户权限：
<select name="admin">
	<option value="admin" <c:if test="${model.admin eq 'admin'}">selected="selected"</c:if> >管理员</option>
	<option value="user" <c:if test="${model.admin eq 'user'}">selected="selected"</c:if> >普通用户</option>	
</select>
用户状态：
<select name="status">
	<option value="1" <c:if test="${model.status == 1}">selected="selected"</c:if>>正常</option>	
	<option value="0" <c:if test="${model.status == 0}">selected="selected"</c:if>>禁用</option>	
</select>
<Br/>

<button type="submit" name="sub">提交</button>
</form>
<a href="${ctx}/user/initial.htm">返回列表页</a>
</body>
</html>