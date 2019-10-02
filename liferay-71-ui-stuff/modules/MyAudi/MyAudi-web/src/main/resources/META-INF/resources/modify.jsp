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

  <h3>Build Your Own Audi</h3>
  <a
    href='<liferay-portlet:renderURL portletConfiguration="true"><liferay-portlet:param name="audiAction" value="showMethods"/></liferay-portlet:renderURL>'>Back</a>
  <br></br>
  <br></br>

  <form action="<liferay-portlet:actionURL />" method="post" name="<portlet:namespace/>searchBlogs"
    id="searchBlogsForm">
    <input type="hidden" name="<portlet:namespace/>action" value="searchBlogs" /> <input
      type="hidden" name="<portlet:namespace/>audiAction" value="showResult" />

    <table>
      <tr>
        <td colspan="1" align="LEFT">title:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>title" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">description:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>description" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">content:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>content" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">urlTitle:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>urlTitle" size="20"
          maxlength="100"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">userName:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>userName" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">createDate:</td>
        <td><select name="<portlet:namespace/>createCompare">
            <option value="=">on</option>
            <option value="&gt;">after</option>
            <option value="&gt;=">on or after</option>
            <option value="&lt;">before</option>
            <option value="&lt;=">on or before</option>
            <option value="!=">not on</option>
        </select></td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>createDate" size="20"></td>
        <td align="center"><i>(yyyy-mm-dd)</i></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">modifiedDate:</td>
        <td><select name="<portlet:namespace/>modifiedCompare">
            <option value="=">on</option>
            <option value="&gt;">after</option>
            <option value="&gt;=">on or after</option>
            <option value="&lt;">before</option>
            <option value="&lt;=">on or before</option>
            <option value="!=">not on</option>
        </select></td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>modifiedDate" size="20"></td>
        <td align="center"><i>(yyyy-mm-dd)</i></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">displayDate:</td>
        <td><select name="<portlet:namespace/>displayCompare">
            <option value="=">on</option>
            <option value="&gt;">after</option>
            <option value="&gt;=">on or after</option>
            <option value="&lt;">before</option>
            <option value="&lt;=">on or before</option>
            <option value="!=">not on</option>
        </select></td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>displayDate" size="20"></td>
        <td align="center"><i>(yyyy-mm-dd)</i></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">groupId:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>groupId" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Group name:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>groupName" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">UUID:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>uuid" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">statusByUserName:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>statusByUserName"
          size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">status:</td>
        <td align="left"><select name="<portlet:namespace/>status">
            <option>select</option>
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
        </select></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">Tag:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>tag" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">webId:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>webId" size="20"></td>
      </tr>
    </table>
    <table>
      <tr>
        <td colspan="1" align="LEFT">maxResults:</td>
        <td align="left"><input type="TEXT" name="<portlet:namespace/>maxResults" size="10"></td>
      </tr>
    </table>

    <br> <input type="SUBMIT" value="Submit"> <input type="RESET" value="Clear">
  </form>

</body>
</html>
