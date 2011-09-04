package grails.jqueryui.widget

import grails.test.*
import grails.jqueryui.widget.GrailsJQueryUIWidgetUtil
import org.apache.commons.lang.StringUtils
import org.codehaus.groovy.grails.plugins.web.taglib.FormTagLib
import org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class DialogTagLibTests extends TagLibUnitTestCase {
    
    protected void setUp() {
        
        //need to mock the config
        ConfigurationHolder.config = [
            grails : [
                jqueryui : [
                    prefixes : [
                        dialog : "grailsJQUIDialog_"
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
    
    
    void testDialog(){
        
        tagLib.jquiDialog([
            id : 'dialog1',
            config : [:]
        ], {})
        
        assertEquals("""
<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIDialog_dialog1 = \$("#dialog1").dialog({});
    });
</script>
        """, tagLib.out.toString())
        
    }
    
    




}
