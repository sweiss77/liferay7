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

  <h3>Modify Your Audi</h3>
  <a
    href='<liferay-portlet:renderURL portletConfiguration="true"><liferay-portlet:param name="audiAction" value="showMethods"/></liferay-portlet:renderURL>'>Back</a>
  <br></br>
  <br></br>

  <form action="<liferay-portlet:actionURL />" method="post" name="<portlet:namespace/>saveCar"
    id="saveCarForm">
    <input type="hidden" name="<portlet:namespace/>action" value="updateCar" />
    <!-- <input type="hidden" name="<portlet:namespace/>audiAction" value="updateCar" /> -->
    <input type="hidden" name="<portlet:namespace/>audiId" value="${requestScope.audi.audiId}" />

    <table>
      <tr>
        <td colspan="1" align="LEFT">Model:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>model" value="${requestScope.audi.modelName}" readonly size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Exterior color:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>exterior" size="20"
          value="${requestScope.audi.exteriorColor}"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Interior color:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>interior"
          value="${requestScope.audi.interiorColor}" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">All wheel drive:</td>
        <td><select name="<portlet:namespace/>allWheelDrive">
            <c:if test='${requestScope.audi.allWheelDrive == "true"}'>
              <option value="true" selected>Yes</option>
              <option value="false">No</option>
            </c:if>
            <c:if test='${requestScope.audi.allWheelDrive == "false"}'>
              <option value="true">Yes</option>
              <option value="false" selected>No</option>
            </c:if>
        </select></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Technology package:</td>
        <td><select name="<portlet:namespace/>techPackage">
            <c:if test='${requestScope.audi.technologyPackage == "true"}'>
              <option value="true" selected>Yes</option>
              <option value="false">No</option>
            </c:if>
            <c:if test='${requestScope.audi.technologyPackage == "false"}'>
              <option value="true">Yes</option>
              <option value="false" selected>No</option>
            </c:if>
        </select></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Cold weather package:</td>
        <td><select name="<portlet:namespace/>coldWeather">
            <c:if test='${requestScope.audi.coldWeatherPackage == "true"}'>
              <option value="true" selected>Yes</option>
              <option value="false">No</option>
            </c:if>
            <c:if test='${requestScope.audi.coldWeatherPackage == "false"}'>
              <option value="true">Yes</option>
              <option value="false" selected>No</option>
            </c:if>
        </select></td>
      </tr>
    </table>

    <br> <input type="SUBMIT" value="Submit"> <input type="RESET" value="Reset">
  </form>

</body>
</html>
