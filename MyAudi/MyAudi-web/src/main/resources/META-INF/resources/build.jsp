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
<title>Build New Audi</title>
</head>
<body>

  <h3>Build Your Audi</h3>
  <a
    href='<liferay-portlet:renderURL portletConfiguration="true"><liferay-portlet:param name="audiAction" value="showMethods"/></liferay-portlet:renderURL>'>Back</a>
  <br></br>
  <br></br>

  <form action="<liferay-portlet:actionURL />" method="post" name="<portlet:namespace/>saveCar"
    id="saveCarForm">
    <input type="hidden" name="<portlet:namespace/>action" value="saveCar" /> <input type="hidden"
      name="<portlet:namespace/>audiAction" value="showResult" />

    <table>
      <tr>
        <td colspan="1" align="LEFT">Model:</td>
        <td><select name="<portlet:namespace/>model">
            <option value="a3">A3</option>
            <option value="a4">A4</option>
            <option value="a5">A5</option>
            <option value="a6">A6</option>
            <option value="a7">A7</option>
            <option value="a8">A8</option>
            <option value="r8">R8</option>
            <option value="allroad">Allroad</option>
            <option value="q3">Q3</option>
            <option value="q5">Q5</option>
            <option value="q7">Q7</option>
        </select></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Exterior color:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>exterior" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Interior color:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>interior" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">All wheel drive:</td>
        <td><select name="<portlet:namespace/>allWheelDrive">
            <option value="true">Yes</option>
            <option value="false">No</option>
        </select></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Technology package:</td>
        <td><select name="<portlet:namespace/>techPackage">
            <option value="true">Yes</option>
            <option value="false">No</option>
        </select></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Cold weather package:</td>
        <td><select name="<portlet:namespace/>coldWeather">
            <option value="true">Yes</option>
            <option value="false">No</option>
        </select></td>
      </tr>
    </table>

    <br> <input type="SUBMIT" value="Submit"> <input type="RESET" value="Reset">
  </form>

</body>
</html>
