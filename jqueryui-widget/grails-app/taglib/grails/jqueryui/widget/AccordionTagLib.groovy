package grails.jqueryui.widget

import org.codehaus.groovy.grails.commons.ConfigurationHolder

class AccordionTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiAccordion = {attrs, body ->

        String prefix = ConfigurationHolder.config.grails.jqueryui.prefixes.accordion
        String jsNameSpace = ConfigurationHolder.config.grails.jqueryui.namespace

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def config = attrs.remove('config') ?: [:]

        //set ids
        def accordionID = "${jsNameSpace}.${prefix}${id}"

        out << """
<script type="text/javascript">
    \$(function() {
        ${accordionID} = \$("#${id}").accordion(${util.toJSON(config)});
    });
</script>
        """

    }
}



