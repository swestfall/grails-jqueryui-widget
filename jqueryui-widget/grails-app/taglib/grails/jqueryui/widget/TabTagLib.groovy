package grails.jqueryui.widget

import org.codehaus.groovy.grails.commons.ConfigurationHolder

class TabTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiTab = { attrs, body ->

        String prefix = ConfigurationHolder.config.grails.jqueryui.prefixes.tab
        String jsNameSpace = ConfigurationHolder.config.grails.jqueryui.namespace

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def config = attrs.remove('config') ?: [:]

        //set ids
        def tabID = "${jsNameSpace}.${prefix}${id}"

        out << """
<script type="text/javascript">
    \$(function() {
        ${tabID} = \$("#${id}").tabs(${util.toJSON(config)});
    });
</script>
        """

    }
}
