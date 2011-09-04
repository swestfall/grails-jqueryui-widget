package grails.jqueryui.widget

import grails.test.*
import grails.jqueryui.widget.GrailsJQueryUIWidgetUtil
import org.apache.commons.lang.StringUtils
import org.codehaus.groovy.grails.plugins.web.taglib.FormTagLib
import org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class ProgressBarTagLibTests extends TagLibUnitTestCase {
    
    protected void setUp() {
        
        //need to mock the config
        ConfigurationHolder.config = [
            grails : [
                jqueryui : [
                    prefixes : [
                        progressBar : "grailsJQUIProgressBar_"
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
    
    
    void testProgressBar(){
        
        tagLib.jquiProgressBar([
            id : 'progressBar1',
            config : [:]
        ], {})
        
        assertEquals("""
<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIProgressBar_progressBar1 = \$("#progressBar1").progressbar({});
    });
</script>
        """,tagLib.out.toString())
        
    }
    
    




}
