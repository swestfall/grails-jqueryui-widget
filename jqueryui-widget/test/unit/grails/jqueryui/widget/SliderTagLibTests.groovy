package grails.jqueryui.widget

import grails.test.*
import grails.jqueryui.widget.GrailsJQueryUIWidgetUtil
import org.apache.commons.lang.StringUtils
import org.codehaus.groovy.grails.plugins.web.taglib.FormTagLib
import org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class SliderTagLibTests extends TagLibUnitTestCase {
    
    protected void setUp() {
        
        //need to mock the config
        ConfigurationHolder.config = [
            grails : [
                jqueryui : [
                    prefixes : [
                        slider : "grailsJQUISlider_"
                    ],
                    namespace : "grails.jqueryui.components"
                ]
            ]
        ]
        
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }
    
    
    void testSlider(){
        
        tagLib.jquiSlider([
            id : 'slider1',
            config : [:]
        ], {})
        
        assertEquals("""
<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUISlider_slider1 = \$("#slider1").slider({});
    });
</script>
        """, tagLib.out.toString())
        
    }
    
    




}
