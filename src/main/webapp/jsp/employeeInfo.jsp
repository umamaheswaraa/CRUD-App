<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee information</title>
<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.com/easyui/demo/demo.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.min.js"></script>
	<script type="text/javascript" src="http://www.jeasyui.com/easyui/jquery.easyui.min.js"></script>
	<style type="text/css">
		#fm{
			margin:0;
			padding:10px 30px;
		}
		.ftitle{
			font-size:14px;
			font-weight:bold;
			color:#666;
			padding:5px 0;
			margin-bottom:10px;
			border-bottom:1px solid #ccc;
		}
		.fitem{
			margin-bottom:5px;
		}
		.fitem label{
			display:inline-block;
			width:80px;
		}
	</style>
<script type="text/javascript">

	$(document).ready(function(){
		
	})



</script>


</head>
<body>
	<div class="demo-info" style="margin-bottom:10px">
		<div>EMPLOYEE CRUD Application</div>
	</div>
	<table id="dg" title="My Users" class="easyui-datagrid" style="width:700px;height:250px"
			toolbar="#toolbar" pagination="true"
			rownumbers="true" fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th field="firstname" width="50">First Name</th>
				<th field="lastname" width="50">Last Name</th>
				<th field="phone" width="50">Phone</th>
				<th field="email" width="50">Email</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<a href="#" id="addEmp" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
		<a href="#" id="" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removeUser()">Remove User</a>
	</div>
	<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
			closed="true" buttons="#dlg-buttons">
		<div class="ftitle">User Information</div>
		<form id="fm" method="post" novalidate>
			<div class="fitem">
				<label>First Name:</label>
				<input name="firstname" class="easyui-validatebox" required="true">
			</div>
			<div class="fitem">
				<label>Last Name:</label>
				<input name="lastname" class="easyui-validatebox" required="true">
			</div>
			<div class="fitem">
				<label>Phone:</label>
				<input name="phone">
			</div>
			<div class="fitem">
				<label>Email:</label>
				<input name="email" class="easyui-validatebox" validType="email">
			</div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">Save</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
	</div>
	<div class="main-cont">
		<div class="wrapper">
			<div class="mc-rounded">
			<div class="mc-header">
				<div>
					<img id="addEmployee" title="Add Employee" src="<%=request.getContextPath()%>/images/plus-green.png">				
				</div>
			</div>
			<c:choose>
				<c:when test="${data!=null}">
					<table>
						<tr>
							<td>Employee Id</td>
							<td>First name</td>
							<td>Last Name</td>
							<td>Contact</td>
							<td>Email</td>
							<td colspan="2"> </td>
						</tr>
						
						<c:forEach items="${data}" var="emp">
							<tr>
								<td><c:out value="${emp.id}" /></td>
								<td><c:out value="${emp.firstName}" /></td>
								<td><c:out value="${emp.lastName}" /></td>
								<td><c:out value="${emp.phone}" /></td>
								<td><c:out value="${emp.email}" /></td>
								<td><img title="Edit Employee"  id="editEmployee" src="<%= request.getContextPath()%>/images/pencil.png"></td>
								<td><img title="Delete Employee" id="deleteEmployee" src="<%= request.getContextPath()%>/images/bin-img.png"></td>
							</tr>
						</c:forEach>
					</table>
				</c:when>
				<c:otherwise>
					<h3>No Data Found</h3>
				</c:otherwise>
			</c:choose>
			
			</div>
		</div>
	</div>
</body>
</html>