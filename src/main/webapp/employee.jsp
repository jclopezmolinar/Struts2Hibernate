<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE>
<html>
	<head>
		<title>Struts 2 and Hibernate Integration Example</title>
		<style>
			.button-update {background-color: #008CBA;color: white;}
		</style>
	</head>
	<body>
		<h1>Struts 2 and Hibernate Integration Example</h1>
		<s:form action="registerEmployee" method="POST">
			<s:textfield label="Emp Name" name="empName"></s:textfield>
			<s:textfield label="Emp Email" name="empEmail"></s:textfield>
			<s:textfield label="Emp Dept" name="empDept"></s:textfield>
			<s:textfield label="Emp Salary" name="empSalary"></s:textfield>
			<s:submit value="Submit"></s:submit>
		</s:form>
		<s:if test="empList.size() > 0">
			<h2>List of All Employees</h2>
			<table border="1px" cellpadding="8px">
				<tr>
					<th>Emp Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Department</th>
					<th>Salary</th>
					<th>Action</th>
				</tr>
				<s:iterator value="empList">
					<tr>
						<td><s:property value="empId"/>
							<s:form action="deleteEmployee" method="POST">
								<a onclick="return confirm('Are you sure you want to delete this entry?')" href="removeEmployee.action?empId=<s:property value="empId"/>">Delete</a>
							</s:form>
							</td>
						<td><s:property value="empName"/></td>
						<td><s:property value="empEmail"/></td>
						<td><s:property value="empDept"/></td>
						<td><s:property value="empSalary"/></td>
						<td>
							<a href="updateInfo.action?submitType=updatedata&empId=<s:property value="empId"/>&empName=<s:property value="empName"/>&empEmail=<s:property value="empEmail"/>&empDept=<s:property value="empDept"/>&empSalary=<s:property value="empSalary"/>">								
							<button class="button-update">Edit</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
	</body>
</html>