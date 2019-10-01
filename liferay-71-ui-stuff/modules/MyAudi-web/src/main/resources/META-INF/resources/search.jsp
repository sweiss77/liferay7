<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<portlet:defineObjects />
<fmt:setBundle basename="content.Language-ext" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Build Your Own Audi</title>
</head>
<body>

  <h3>Search Cars</h3>
  <a
    href='<liferay-portlet:renderURL portletConfiguration="true"><liferay-portlet:param name="audiAction" value="showMethods"/></liferay-portlet:renderURL>'>Back</a>
  <br></br>

<!-- Blogs results -->
<h5>Blogs</h5>
    <table border="1">
        <tr><td>Model</td><td>Exterior Color</td><td>Interior Color</td><td>All Wheel Drive</td><td>Cold Weather Package</td><td>Technology Package</td></tr>
        <c:forEach items="${requestScope.carSearchResults}" var="blogsEntry">
            <tr>
                <td><a href="<c:out value="${blogsEntry.urlView}" />"><c:out value="${blogsEntry.title}" /></a></td>
                <td><a href="<c:out value="${blogsEntry.urlView}" />"><c:out value="${blogsEntry.urlView}" /></a></td>
                <td><a href="<c:out value="${blogsEntry.urlViewInContext}" />">View</a></td>
                <td><c:out value="${blogsEntry.userName}" /></td>
                <td><c:out value="${blogsEntry.createDate}" /></td>
                <td><c:out value="${blogsEntry.statusByUserName}" /></td>
                <td><c:out value="${blogsEntry.modifiedDate}" /></td>
                <td><c:out value="${blogsEntry.groupName}" /></td>
                
            </tr>
        </c:forEach>
    </table>
<br/>

</body>
</html>
