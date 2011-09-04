package grails.jqueryui.widget

import org.codehaus.groovy.grails.commons.ConfigurationHolder

class SliderTagLib {

    static namespace = "jqueryui"

    GrailsJQueryUIWidgetUtil util = GrailsJQueryUIWidgetUtil.getInstance();

    def jquiSlider = { attrs, body ->

        String prefix = ConfigurationHolder.config.grails.jqueryui.prefixes.slider
        String jsNameSpace = ConfigurationHolder.config.grails.jqueryui.namespace

        //pull the config properties and set defaults
        def id = attrs.remove('id')
        def config = attrs.remove('config') ?: [:]

        //set ids
        def sliderID = "${jsNameSpace}.${prefix}${id}"

        out << """
<script type="text/javascript">
    \$(function() {
        ${sliderID} = \$("#${id}").slider(${util.toJSON(config)});
    });
</script>
        """

    }

}
