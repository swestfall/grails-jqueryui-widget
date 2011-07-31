package grails.jqueryui.widget

class AutoCompleteTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiAutoComplete = {attrs, body ->

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def renderMarkup = attrs.remove('renderMarkup') ?: true
        def namespace = attrs.remove('namespace') ?: 'grails.jqueryui.components'
        def config = attrs.remove('config') ?: [:]

        //set ids
        def autoCompleteID = "${namespace}.grailsJQUIAutoComplete_${id}"

        //build the markup
        def markup = ""
        if (renderMarkup == true){
            markup = "<input id='${id}' type='text' autocomplete='off' />"
        }

        out << """

${markup}
<script type="text/javascript">
    \$(function() {
        ${autoCompleteID} = \$("#${id}").autocomplete(${util.toJSON(config)});
    });

</script>
        """

    }

}
