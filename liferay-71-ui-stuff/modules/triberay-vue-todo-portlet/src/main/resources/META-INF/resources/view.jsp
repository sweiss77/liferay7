<%@ include file="/init.jsp" %>

<div id="<portlet:namespace />-1">
	<nav class="navbar navbar-expand-lg navbar-dark primary-color card">
		<a href="#" class="navbar-brand">To Do App</a>
	</nav>
</div>

<aui:script require="<%= mainRequire %>">
	main.default('<portlet:namespace />', Liferay.ThemeDisplay.getPathThemeImages() + '/clay/icons.svg#');
</aui:script>
