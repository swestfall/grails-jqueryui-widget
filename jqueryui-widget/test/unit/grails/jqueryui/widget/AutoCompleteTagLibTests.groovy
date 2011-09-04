package grails.jqueryui.widget

import grails.test.*
import grails.jqueryui.widget.GrailsJQueryUIWidgetUtil
import org.apache.commons.lang.StringUtils
import org.codehaus.groovy.grails.plugins.web.taglib.FormTagLib
import org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class AutoCompleteTagLibTests extends TagLibUnitTestCase {
    
    protected void setUp() {
        
        //need to mock the config
        ConfigurationHolder.config = [
            grails : [
                jqueryui : [
                    prefixes : [
                        autoComplete : "grailsJQUIAutoComplete_"
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

    void testAutoComplete_renderMarkup_true() {
        
        tagLib.jquiAutoComplete([
            id : 'autoComplete1',
            config : [:]
        ], {})
        
        assertEquals("""
<input id='autoComplete1' type='text' autocomplete='off' />
<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIAutoComplete_autoComplete1 = \$("#autoComplete1").autocomplete({});
    });
</script>
        """, tagLib.out.toString())
        
    }
    
    void testAutoComplete_renderMarkup_false() {
        
        tagLib.jquiAutoComplete([
            id : 'autoComplete1',
            renderMarkup : false,
            config : [:]
        ], {})
        
        assertEquals("""

<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIAutoComplete_autoComplete1 = \$("#autoComplete1").autocomplete({});
    });
</script>
        """,tagLib.out.toString())
    }


}
