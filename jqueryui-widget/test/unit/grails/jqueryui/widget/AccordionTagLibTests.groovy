package grails.jqueryui.widget

import grails.test.*
import grails.jqueryui.widget.GrailsJQueryUIWidgetUtil
import org.apache.commons.lang.StringUtils
import org.codehaus.groovy.grails.plugins.web.taglib.FormTagLib
import org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class AccordionTagLibTests extends TagLibUnitTestCase {
    
    private GrailsJQueryUIWidgetUtil util;
    
    protected void setUp() {
        
        //need to mock the config
        ConfigurationHolder.config = [
            grails : [
                jqueryui : [
                    prefixes : [
                        accordion : "grailsJQUIAccordion_"
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
    
    void testAccordion() {
        
        tagLib.jquiAccordion([
            id : 'accordion1',
            config : [:]
        ], {})
        
        println tagLib.out.toString()
        
        assertEquals("""
<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIAccordion_accordion1 = \$("#accordion1").accordion({});
    });
</script>
        """, tagLib.out.toString())
    }



}
