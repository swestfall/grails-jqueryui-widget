package grails.jqueryui.widget

class DatePickerTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiDatePicker = { attrs, body ->

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def renderMarkup = attrs.remove('renderMarkup') ?: true
        def namespace = attrs.remove('namespace') ?: 'grails.jqueryui.components'
        def config = attrs.remove('config') ?: [:]

        //set ids
        def datePickerID = "${namespace}.grailsJQUIDatePicker_${id}"

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

