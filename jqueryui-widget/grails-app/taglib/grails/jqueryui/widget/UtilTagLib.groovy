package grails.jqueryui.widget

import org.codehaus.groovy.grails.commons.ConfigurationHolder

class UtilTagLib {

    static namespace = "jqueryui"

    def javascript = { attrs, body ->

        out << """
            <script type="text/javascript" src="${resource(plugin: 'jqueryui-widget', dir: 'js', file: 'pluginResources.js')}"></script>
            <script type="text/javascript">
                grails.jqueryui.namespace = "${ConfigurationHolder.config.grails.jqueryui.namespace}"
                grails.jqueryui.prefixes.accordion = "${ConfigurationHolder.config.grails.jqueryui.prefixes.accordion}"
                grails.jqueryui.prefixes.autoComplete = "${ConfigurationHolder.config.grails.jqueryui.prefixes.autoComplete}"
                grails.jqueryui.prefixes.datePicker = "${ConfigurationHolder.config.grails.jqueryui.prefixes.datePicker}"
                grails.jqueryui.prefixes.dialog = "${ConfigurationHolder.config.grails.jqueryui.prefixes.dialog}"
                grails.jqueryui.prefixes.button = "${ConfigurationHolder.config.grails.jqueryui.prefixes.button}"
                grails.jqueryui.prefixes.buttonSet = "${ConfigurationHolder.config.grails.jqueryui.prefixes.buttonSet}"
                grails.jqueryui.prefixes.tag = "${ConfigurationHolder.config.grails.jqueryui.prefixes.tab}"
                grails.jqueryui.prefixes.progressBar = "${ConfigurationHolder.config.grails.jqueryui.prefixes.progressBar}"
                grails.jqueryui.prefixes.slider = "${ConfigurationHolder.config.grails.jqueryui.prefixes.slider}"
            </script>
        """
    }

}
