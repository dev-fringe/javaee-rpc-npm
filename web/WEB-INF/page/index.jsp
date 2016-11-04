<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>javaee-rpc</title>
	<script type="text/javascript" src="${ctx}/dwr/engine.js"></script>
	<script type="text/javascript" src="${ctx}/dwr/util.js"></script>
	<script type="text/javascript" src="${ctx}/dwr/interface/UserService.js"></script>
    <script src="${ctx}/lib/system.js"></script>
    <script src="${ctx}/js/config.js"></script>
	<script> 
		System.import('js/main') 
	</script> 
    
</head>
<body>
	<div>
		<input type="button" value="Hello" id="hello" /> 
		<input type="button" value="User" id="user" /> 
		<input type="button" value="List" id="list" />
	</div>
	${message}
</body>
</html>