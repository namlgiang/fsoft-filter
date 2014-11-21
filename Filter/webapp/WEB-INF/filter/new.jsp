<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/favicon.ico" />

<!-- 	CSS define -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/jquery-ui.css">
	
<!-- 	Javascript define -->
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/filter-builder.js"></script>
	
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Define a new Filter(new)</title>
</head>
<body>
<div align="center">
	<table >
		<tbody>
			<tr>
				<td colspan="2">Filter information</td>
			<tr>
				<td>Name:</td>
				<td><input type="text" id="fName"/></td>
			</tr>
			<tr>
				<td>Display name:</td>
				<td><input type="text" id="fDisplayName"/></td>
			</tr>
			<tr>
				<td>Filter Type:</td>
				<td>
					<input type="checkbox" name="all" value="all" class="filter-type"/> All
					<input type="checkbox" name="generic" value="generic" class="filter-type"/> generic
					<input type="checkbox" name="listbuilder" value="listbuilder" class="filter-type"/> listbuilder
				</td>
			</tr>
			<tr>
				<td>Input Type:</td>
				<td>
					<select>
						<c:forEach items="${ lInputTypeDtos}" var="inputTypeDto">
							<option value="${ inputTypeDto.id}">
								<c:out value="${inputTypeDto.name}"></c:out>
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>Operation Type:</td>
				<td>
				<select>
					<c:forEach items="${ lOperationTypeDTOs}" var="lOperationTypeDTO">
							<option value="${ lOperationTypeDTO.id}">
								<c:out value="${lOperationTypeDTO.name}"></c:out>
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Save" id="btnSave"/>
				</td>
			</tr>
		</tbody>
	</table>
	</div>
</body>
</html>