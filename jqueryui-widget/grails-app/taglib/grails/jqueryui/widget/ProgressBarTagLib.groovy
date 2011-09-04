package grails.jqueryui.widget

import org.codehaus.groovy.grails.commons.ConfigurationHolder

class ProgressBarTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiProgressBar = { attrs, body ->

        String prefix = ConfigurationHolder.config.grails.jqueryui.prefixes.progressBar
        String jsNameSpace = ConfigurationHolder.config.grails.jqueryui.namespace

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def config = attrs.remove('config') ?: [:]

        //set ids
        def progressBarID = "${jsNameSpace}.${prefix}${id}"

        out << """
<script type="text/javascript">
    \$(function() {
        ${progressBarID} = \$("#${id}").progressbar(${util.toJSON(config)});
    });
</script>
        """

    }
}
