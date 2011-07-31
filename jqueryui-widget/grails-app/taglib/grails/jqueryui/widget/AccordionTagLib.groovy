package grails.jqueryui.widget

class AccordionTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiAccordion = {attrs, body ->

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def namespace = attrs.remove('namespace') ?: 'grails.jqueryui.components'
        def config = attrs.remove('config') ?: [:]

        //set ids
        def accordionID = "${namespace}.grailsJQUIAccordion_${id}"

        out << """

<script type="text/javascript">
    \$(function() {
        ${accordionID} = \$("#${id}").accordion(${util.toJSON(config)});
    });

</script>
        """

    }
}



