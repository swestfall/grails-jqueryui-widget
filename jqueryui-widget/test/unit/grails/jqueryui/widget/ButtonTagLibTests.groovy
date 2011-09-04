package grails.jqueryui.widget

import grails.test.*
import grails.jqueryui.widget.GrailsJQueryUIWidgetUtil
import org.apache.commons.lang.StringUtils
import org.codehaus.groovy.grails.plugins.web.taglib.FormTagLib
import org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class ButtonTagLibTests extends TagLibUnitTestCase {
    
    private GrailsJQueryUIWidgetUtil util;
    
    protected void setUp() {
        
        //need to mock the config
        ConfigurationHolder.config = [
            grails : [
                jqueryui : [
                    prefixes : [
                        button : "grailsJQUIButton_",
                        buttonSet : "grailsJQUIButtonSet_"
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

    void testButton() {
        
        tagLib.jquiButton([
            id : "button1",
            config : [:]
        ], {})
        
        assertEquals("""
<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIButton_button1 = \$("#button1").button({});
    });
</script>
        """, tagLib.out.toString())
        
    }
    
    void testButtonSet(){
        
        tagLib.jquiButtonSet([
            id : 'buttonSet1',
            config : [:]
        ], {})
        
        assertEquals("""
<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIButtonSet_buttonSet1 = \$("#buttonSet1").buttonset({});
    });
</script>
        """, tagLib.out.toString())
        
    }


}
