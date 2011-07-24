package grails.jqueryui.widget

class UtilTagLib {

    static namespace = "jqueryui"

    def javascript = { attrs, body ->

        out << """
            <script type="text/javascript" src="${resource(plugin: 'jqueryui-widget', dir: 'js', file: 'pluginResources.js')}"></script>
        """
    }

}
