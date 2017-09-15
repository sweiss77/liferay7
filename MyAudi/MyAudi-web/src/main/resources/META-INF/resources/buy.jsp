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

  <h3>Congratulations on Your New Audi!</h3>
  <a
    href='<liferay-portlet:renderURL portletConfiguration="true"><liferay-portlet:param name="audiAction" value="showMethods"/></liferay-portlet:renderURL>'>Back</a>
  <br></br>
  <br></br>

    <table>
      <tr>
        <td colspan="1" align="LEFT">Model:</td>
        <td align="left">${requestScope.audi.modelName}</td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Exterior color:</td>
        <td align="left">${requestScope.audi.exteriorColor}</td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Interior color:</td>
        <td align="left">${requestScope.audi.interiorColor}</td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">All wheel drive:</td>
        <td>
            <c:if test='${requestScope.audi.allWheelDrive == "true"}'>
              Yes
            </c:if>
            <c:if test='${requestScope.audi.allWheelDrive == "false"}'>
              No
            </c:if>
        </td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Technology package:</td>
        <td>
            <c:if test='${requestScope.audi.technologyPackage == "true"}'>Yes
            </c:if>
            <c:if test='${requestScope.audi.technologyPackage == "false"}'>No
            </c:if>
        </td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Cold weather package:</td>
        <td>
            <c:if test='${requestScope.audi.coldWeatherPackage == "true"}'>Yes
            </c:if>
            <c:if test='${requestScope.audi.coldWeatherPackage == "false"}'>No
            </c:if>
        </td>
      </tr>
    </table>

</body>
</html>
