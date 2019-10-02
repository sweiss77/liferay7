<%@ include file="/init.jsp"%>

<p>
	<b><liferay-ui:message key="myaudi.caption" /></b>
</p>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ page contentType="text/html" isELIgnored="false"%>

<portlet:defineObjects />
<fmt:setBundle basename="content.Language-ext" />

<!-- 
<br>
  <a href="<liferay-portlet:renderURL portletConfiguration="true"><liferay-portlet:param name="audiAction" value="properties"/></liferay-portlet:renderURL>">Properties</a>
<br>
 -->
<c:if test="${requestScope.audiAction=='showResult' }">
	<h4>
		Results of
		<c:out value='${requestScope.searchType}' />
		Search
	</h4>
	<a
		href='<liferay-portlet:renderURL portletConfiguration="true"><liferay-portlet:param name="audiAction" value="showMethods"/></liferay-portlet:renderURL>'>Home</a>
	<br></br>
	<br></br>
	<b>Number of records:</b>
	<c:out value='${requestScope.count}' />
	<br></br>
	<b>Elapsed time: </b>
	<c:out value='${requestScope.searchTime}' /> ms<br></br>
	<br></br>
	<pre>
    <c:out value='${requestScope.result}' />
  </pre>
</c:if>

<c:if test="${requestScope.audiAction=='showMethods'}">
	<h5>What would you like to do?</h5>
	<table width="80%" border="0">
		<c:forEach var="method" items="${methods}">
			<tr>
				<td valign="top"><a
					href='<liferay-portlet:renderURL portletConfiguration="true"><liferay-portlet:param name="audiAction" value="showForm"/><liferay-portlet:param name="method" value="${method}"/></liferay-portlet:renderURL>'><c:out
							value='${method}' /></a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>