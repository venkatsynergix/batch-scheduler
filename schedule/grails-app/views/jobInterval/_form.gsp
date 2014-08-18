



<div class="fieldcontain ${hasErrors(bean: jobIntervalInstance, field: 'batchName', 'error')} required">
	<label for="batchName">
		<g:message code="jobInterval.batchName.label" default="Batch Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="batchName" required="" value="${jobIntervalInstance?.batchName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: jobIntervalInstance, field: 'intervalTime', 'error')} required">
	<label for="intervalTime">
		<g:message code="jobInterval.intervalTime.label" default="Interval Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="intervalTime" type="number" min="0" max="23" value="${jobIntervalInstance.intervalTime}" required=""/>

</div>

