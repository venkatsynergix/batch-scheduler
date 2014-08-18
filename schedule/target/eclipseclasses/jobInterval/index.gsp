

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'jobInterval.label', default: 'JobInterval')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-jobInterval" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<!-- <ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>-->
			</ul>
		</div>
		<div id="list-jobInterval" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="batchName" title="${message(code: 'jobInterval.batchName.label', default: 'Batch Name')}" />
					
						<g:sortableColumn property="intervalTime" title="${message(code: 'jobInterval.intervalTime.label', default: 'Interval Time')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${jobIntervalInstanceList}" status="i" var="jobIntervalInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${jobIntervalInstance.id}">${fieldValue(bean: jobIntervalInstance, field: "batchName")}</g:link></td>
					
						<td>${fieldValue(bean: jobIntervalInstance, field: "intervalTime")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${jobIntervalInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
