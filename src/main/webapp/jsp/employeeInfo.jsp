<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="<%= request.getContextPath() %>/js/jquery-1.7.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/js/jquery-ui-1.8.16.custom.min.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/js/jquery.tablesorter.js"></script>
	<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/blue/style.css" />
	<link type="text/css" rel="stylesheet" href="<%= request.getContextPath() %>/css/jquery-ui-1.8.16.custom.css" />
	
<script type="text/javascript">
	var contextPath="<%=request.getContextPath()%>";
	
	function validateEmail(email){
		var filter =/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if(filter.test(email)){
			return true;
		}else{
			return false;
		}
		
	}
	
	function validatePhone(phone) {
		    var filter = /^[0-9-+]+$/;
		    if (filter.test(phone)) {
		        return true;
		    } else {
		        return false;
		    }
	}
	
	$(document).ready(function(){
		$("#myDummyTable").tablesorter();
		var rowsize_str ='<div id="tableRowSize" style="float: right;"><input type="text" class="row_size" class="small-txt-footer" value="${pageSize}"><input class="tableFooter row_size_submit" type="button" value="Go" style="cursor:pointer;font-size:12px;padding: 3px; margin: 5px;"></div>';
		$(rowsize_str).insertBefore($('.pagebanner'));
		
		$("#newEmployee").live('click', function(){
			$(".mc-title").html("New Employee");
			$("#new-employee").show();
			$("#employees").hide();
			
			 url = contextPath+'/emp/create.htm';
		});
		
		$(".employee-edit").live('click', function(){
			$(".mc-title").html("Edit Employee");
			var id = $(this).attr("pkey");
			
			$("#firstName").val($(this).attr("firstName"));
			$("#lastName").val($(this).attr("lastName"));
			$("#phone").val($(this).attr("phone"));
			$("#email").val($(this).attr("email"));
			$("#new-employee").show();
			$("#employees").hide();
			 url = contextPath+'/emp/update.htm?employeeId='+id;
			 
		});
		
		$(".employee-del").live('click', function(){
	       if(confirm('Do you want to delete Employee??')) {
			var id = $(this).attr("pkey");
			 url = contextPath+'/emp/delete.htm?employeeId='+id;
			 $.ajax({
					url: url,
					type: 'GET',
					async:false,
					success: function( result ) {
						if(result == 'success'){
							$("#saving-img").hide();
							alert('Employee Record marked as deleted');
						}
						
						window.location.reload(true);
					},
					failure: function(data){
					}

				});
	       }
			 
		});
		
		
		$("#emp-save").live('click', function(){
			var firstName = $("#firstName").val();
			var lastName = $("#lastName").val();
			var phone = $("#phone").val();
			var email = $("#email").val();
						
			if(firstName!=null && firstName.length==0)
			{	
				alert("First Name is required field");
				return false;
			}
			if(lastName!=null && lastName.length==0)
			{	
				alert("lastName is required field");
				return false;
			}
			if(phone!=null && phone.length==0)
			{	
				alert("Contact Key is required field");
				return false;
			}
			if(!validatePhone(phone) || phone.length!=10)
			{	
				alert("Contact is in valid");
				return false;
			}
			if(email!=null && email.length==0)
			{	
				alert("Email Key is required field");
				return false;
			}
			if(!validateEmail(email)){
				alert('Email is not valid');
				return false;
			}
			
			$("#saving-img").show();
			var post_data="firstName="+firstName+'&lastName='+lastName+'&phone='+phone+'&email='+email;
			$.ajax({
				url: url,
				type: 'POST',
				data:post_data,
				async:false,
				success: function( result ) {
					if(result=='success'){
						$("#saving-img").hide();
						alert("Employee record Created/Updated Successfully");
					}
					
					window.location.reload(true);
				},
				failure: function(result){
					$("#saving-img").hide();
				}

			}); 
			$("#saving-img").hide();
		});

		
				
		$("#mp-cancel").live('click', function(){
			$("#saving-img").hide();
			$("#new-employee").hide();
			$("#employees").show();
		});
		
	});
	</script>
</head>
<body class="wm-page">
	<div class="main-cont">
		<div class="wrapper">
			<div class="mc-rounded ">
				<div id="employees">
				
				<div class="mc-header hidden">
							<form id="searchSeller" action="<%= request.getContextPath() %>/emp/fetchEmpAll.htm?t=con" method="GET">
								<input type="hidden" name="tab" value="con">
								<input id="search" name="words" class="tgf-textbox tgf-group-title flt-left" type="text" placeholder="Search Keywords">
								<input class="go-btn custom-btn-1" type="submit" value="Go">
							</form>
							<div style="padding:8px;right:5px;top:5px;float:right;position:relative;border:1px solid #ddd;">
								<img id="newEmployee" style="margin-right:5px;" title="Add Employee"  src="<%=request.getContextPath()%>/images/plus-green.png"/>
							</div>
				</div>
				<div style="width:100%;" id="table-results">
					<c:choose>
						<c:when test="${datasize!=0}">
							<table id="myDummyTable" class="tablesorter">
								<thead>	
									<tr>
										<td>Employee Id</td>
										<td>First Name</td>
										<td>Last Name</td>
										<td>Contact</td>
										<td>Email</td>
										<td>Is Active</td>
										<td colspan="2"> Actions</td>
									</tr>
								</thead>
								<tbody>
								<c:forEach items="${data}" var="emp">
									
									<tr>
										<td><c:out value="${emp.id}" /></td>
										<td><c:out value="${emp.firstName}" /></td>
										<td><c:out value="${emp.lastName}" /></td>
										<td><c:out value="${emp.phone}" /></td>
										<td><c:out value="${emp.email}" /></td>
										<td><c:out value="${emp.isDeleted}" /></td>
										<td colspan="2">
											<div class="alloc actions">
					               		 		<img title="Edit" pkey="${emp.id}" firstName="${emp.firstName}" lastName="${emp.lastName}" phone="${emp.phone}" email="${emp.email}" class="employee-edit" src="<%=request.getContextPath()%>/images/pencil.png"/>
					               		 		<img  title="Delete" pkey="${emp.id}" class="employee-del" src="<%=request.getContextPath()%>/images/bin-img.png"/>
				                			</div>								
										</td>	
									</tr>			       			
						         </c:forEach>
					            </tbody>    
							</table>	
						</c:when>
						<c:otherwise>
							<h3 class="label-4">Please click on plus symbol to add new employee</h3>
						</c:otherwise>
					</c:choose>
					<c:if test=""></c:if>
										
				</div>
				</div>
				<div id="new-employee" style="display: none;">
					<div class="mc-header">
						<h1 class="mc-title">Configure New Employee</h1>
					</div>
					<div class="general-form">
						<div class="mc-header">
							<input id="key" value="" type="hidden"/>
							<div class="gf-div" style="display: inline-block;width:45%;padding-top:0px!important;">
								<h3 class="label-2">First Name</h3>
								<input id="firstName" class="tgf-textbox" type="text"
									placeholder="First Name" required="required">
							</div>
							<div class="gf-div" style="display: inline-block;width:45%;;padding-top:0px!important;">
								<h3 class="label-2">Last Name</h3>
								<input id="lastName" class="tgf-textbox" type="text"
									placeholder="Last Name">
							</div>
							<div class="gf-div" style="display: inline-block;width:45%;;padding-top:0px!important;">
								<h3 class="label-2">Contact</h3>
								<input id="phone" class="tgf-textbox" type="text"
									placeholder="Contact">
							</div>
							<div class="gf-div" style="display: inline-block;width:45%;;padding-top:0px!important;">
								<h3 class="label-2">email</h3>
								<input id="email" class="tgf-textbox" type="text"
									placeholder="Email" required="required">
							</div>
						</div>
					</div>
					<div style="margin:10px -5px;padding-top:0px!important;float:left;" class="gf-div">
						<input type="button" id="emp-save" class="custom-btn-2" value="Save"> 
						<input type="button" id="mp-cancel"	class="custom-btn-1" value="Cancel">
					</div>
					<div id="saving-img" style="display: none;float:left;" class="message-label">
						<span class="loading"></span><label>Saving the data...</label>
					</div>
					<div id="access-img" style="display: none;float:left;" class="message-label">
						<span class="loading"></span><label>Requesting Access..</label>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>