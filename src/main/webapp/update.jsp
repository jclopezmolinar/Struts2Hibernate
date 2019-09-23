<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<title>Update Employee Information</title>
	</head>
	<body>
		<h2>Update Information</h2>
		<form action="updateInfo" method="post">
			<pre>
				<b>Id:           </b><input type="text" name="empId" value='<s:property value="empId"/>'>
				<b>Name:         </b><input type="text" name="empName" value='<s:property value="empName"/>'>
				<b>Email:        </b><input type="text" name="empEmail" value='<s:property value="empEmail"/>'>
				<b>Department:   </b><input type="text" name="empDept" value='<s:property value="empDept"/>'>
				<b>Salary:       </b><input type="text" name="empSalary" value='<s:property value="empSalary"/>'>
					<button name="submitType" value="update" type="submit">Update</button>
			</pre>
		</form>
		<p><a href="<s:url action='listEmployee'/>">Return to employee page</a></p>
	</body>
</html>