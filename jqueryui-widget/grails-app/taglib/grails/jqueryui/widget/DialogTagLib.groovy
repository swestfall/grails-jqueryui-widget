package grails.jqueryui.widget

import org.codehaus.groovy.grails.commons.ConfigurationHolder

class DialogTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiDialog = {attrs, body ->

        String prefix = ConfigurationHolder.config.grails.jqueryui.prefixes.dialog
        String jsNameSpace = ConfigurationHolder.config.grails.jqueryui.namespace

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def config = attrs.remove('config') ?: [:]

        //set ids
        def dialogID = "${jsNameSpace}.${prefix}${id}"

        out << """
<script type="text/javascript">
    \$(function() {
        ${dialogID} = \$("#${id}").dialog(${util.toJSON(config)});
    });
</script>
        """

    }

}
