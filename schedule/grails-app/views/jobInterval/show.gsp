

<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'jobInterval.label', default: 'JobInterval')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-jobInterval" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<!--<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>-->
			</ul>
		</div>
		<div id="show-jobInterval" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list jobInterval">
			
				<g:if test="${jobIntervalInstance?.batchName}">
				<li class="fieldcontain">
					<span id="batchName-label" class="property-label"><g:message code="jobInterval.batchName.label" default="Batch Name" /></span>
					
						<span class="property-value" aria-labelledby="batchName-label"><g:fieldValue bean="${jobIntervalInstance}" field="batchName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${jobIntervalInstance?.intervalTime}">
				<li class="fieldcontain">
					<span id="intervalTime-label" class="property-label"><g:message code="jobInterval.intervalTime.label" default="Interval Time" /></span>
					
						<span class="property-value" aria-labelledby="intervalTime-label"><g:fieldValue bean="${jobIntervalInstance}" field="intervalTime"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:jobIntervalInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${jobIntervalInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<!--<g:actionSubmit class="delete" action="delete" value="{message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('{message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />-->
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
