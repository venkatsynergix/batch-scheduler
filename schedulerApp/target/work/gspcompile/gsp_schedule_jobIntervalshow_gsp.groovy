import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='schedule', version='0.1')
class gsp_schedule_jobIntervalshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/schedule-0.1/grails-app/views/jobInterval/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'jobInterval.label', default: 'JobInterval'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (jobIntervalInstance?.batchName)) {
printHtmlPart(13)
invokeTag('message','g',28,['code':("jobInterval.batchName.label"),'default':("Batch Name")],-1)
printHtmlPart(14)
invokeTag('fieldValue','g',30,['bean':(jobIntervalInstance),'field':("batchName")],-1)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (jobIntervalInstance?.intervalTime)) {
printHtmlPart(17)
invokeTag('message','g',37,['code':("jobInterval.intervalTime.label"),'default':("Interval Time")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',39,['bean':(jobIntervalInstance),'field':("intervalTime")],-1)
printHtmlPart(15)
}
printHtmlPart(19)
createTagBody(2, {->
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',47,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',47,['class':("edit"),'action':("edit"),'resource':(jobIntervalInstance)],3)
printHtmlPart(21)
invokeTag('actionSubmit','g',48,['class':("delete"),'action':("delete"),'value':("{message(code: 'default.button.delete.label', default: 'Delete')}"),'onclick':("return confirm('{message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(22)
})
invokeTag('form','g',50,['url':([resource:jobIntervalInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',52,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1408242600384L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
