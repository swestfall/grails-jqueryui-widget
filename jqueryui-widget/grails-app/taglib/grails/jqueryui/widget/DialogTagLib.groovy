package grails.jqueryui.widget

class DialogTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiDialog = {attrs, body ->

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def namespace = attrs.remove('namespace') ?: 'grails.jqueryui.components'
        def config = attrs.remove('config') ?: [:]

        //set ids
        def dialogID = "${namespace}.grailsJQUIDialog_${id}"

        out << """

<script type="text/javascript">
    \$(function() {
        ${dialogID} = \$("#${id}").dialog(${util.toJSON(config)});
    });

</script>
        """

    }

}
