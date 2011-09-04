package grails.jqueryui.widget

import org.codehaus.groovy.grails.commons.ConfigurationHolder

class DatePickerTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiDatePicker = { attrs, body ->

        String prefix = ConfigurationHolder.config.grails.jqueryui.prefixes.datePicker
        String jsNameSpace = ConfigurationHolder.config.grails.jqueryui.namespace

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def renderMarkup = (attrs.get('renderMarkup') != null) ? attrs.remove('renderMarkup') : true
        def config = attrs.remove('config') ?: [:]

        //set ids
        def datePickerID = "${jsNameSpace}.${prefix}${id}"

        //build the markup
        def markup = ""
        if (renderMarkup == true) {
            markup = "<input id='${id}' type='text' autocomplete='off' />"
        }

        out << """
${markup}
<script type="text/javascript">
    \$(function() {
        ${datePickerID} = \$("#${id}").datepicker(${util.toJSON(config)});
    });
</script>
        """

    }
}

