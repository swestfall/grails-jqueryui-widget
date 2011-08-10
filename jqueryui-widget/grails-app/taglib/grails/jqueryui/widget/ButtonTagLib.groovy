package grails.jqueryui.widget

import org.codehaus.groovy.grails.commons.ConfigurationHolder

class ButtonTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def button = { attrs, body ->

        String prefix = ConfigurationHolder.config.grails.jqueryui.prefixes.button
        String jsNameSpace = ConfigurationHolder.config.grails.jqueryui.namespace

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def config = attrs.remove('config') ?: [:]

        //set ids
        def buttonID = "${jsNameSpace}.${prefix}${id}"

        out << """
<script type="text/javascript">
    \$(function() {
        ${buttonID} = \$("#${id}").button(${util.toJSON(config)});
    });
</script>
        """

    }

    def buttonSet = { attrs, body ->

        String prefix = ConfigurationHolder.config.grails.jqueryui.prefixes.buttonSet
        String jsNameSpace = ConfigurationHolder.config.grails.jqueryui.namespace

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def config = attrs.remove('config') ?: [:]

        //set ids
        def buttonSetID = "${jsNameSpace}.${prefix}${id}"

        out << """
<script type="text/javascript">
    \$(function() {
        ${buttonSetID} = \$("#${id}").buttonset(${util.toJSON(config)});
    });
</script>
        """

    }
}
