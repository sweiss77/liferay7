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

  <!-- List cars -->
  <h5>Available Cars</h5>
  <table border="1">
    <tr>
      <td>Model</td>
      <td>Exterior Color</td>
      <td>Interior Color</td>
      <td>All Wheel Drive</td>
      <td>Cold Weather Package</td>
      <td>Technology Package</td>
      <td/>
    </tr>
    <c:forEach items="${requestScope.carSearchResults}" var="audi">
      <tr>
        <td><a
          href='<liferay-portlet:renderURL portletConfiguration="true">
          <liferay-portlet:param name="audiAction" value="getAudi"/>
          <liferay-portlet:param name="audiId" value="${audi.audiId}"/>
          </liferay-portlet:renderURL>'>
            <c:out value="${audi.modelName}" />
        </a></td>
        <td><c:out value="${audi.exteriorColor}" /></td>
        <td><c:out value="${audi.interiorColor}" /></td>
        <td><c:out value="${audi.technologyPackage}" /></td>
        <td><c:out value="${audi.coldWeatherPackage}" /></td>
        <td><c:out value="${audi.allWheelDrive}" /></td>
        <td>
        <a
          href='<liferay-portlet:renderURL portletConfiguration="true">
          <liferay-portlet:param name="audiAction" value="buyAudi"/>
          <liferay-portlet:param name="audiId" value="${audi.audiId}"/>
          </liferay-portlet:renderURL>'>
        Buy this car</a></td>

      </tr>
    </c:forEach>
  </table>
  <br />

</body>
</html>
