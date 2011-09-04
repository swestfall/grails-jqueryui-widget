package grails.jqueryui.widget

import grails.test.*
import grails.jqueryui.widget.GrailsJQueryUIWidgetUtil
import org.apache.commons.lang.StringUtils
import org.codehaus.groovy.grails.plugins.web.taglib.FormTagLib
import org.codehaus.groovy.grails.plugins.web.taglib.ApplicationTagLib
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class DatePickerTagLibTests extends TagLibUnitTestCase {
    
    protected void setUp() {
        
        //need to mock the config
        ConfigurationHolder.config = [
            grails : [
                jqueryui : [
                    prefixes : [
                        datePicker : "grailsJQUIDatePicker_"
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
    
    
    void testDatePicker_renderMarkup_true() {
        
        tagLib.jquiDatePicker([
            id : 'datePicker1',
            config : [:]
        ], {})
        
        assertEquals("""
<input id='datePicker1' type='text' autocomplete='off' />
<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIDatePicker_datePicker1 = \$("#datePicker1").datepicker({});
    });
</script>
        """, tagLib.out.toString())
    }
    
    void testDatePicker_renderMarkup_false() {
        
        tagLib.jquiDatePicker([
            id : 'datePicker1',
            config : [:],
            renderMarkup : false
        ], {})
        
        assertEquals("""

<script type="text/javascript">
    \$(function() {
        grails.jqueryui.components.grailsJQUIDatePicker_datePicker1 = \$("#datePicker1").datepicker({});
    });
</script>
        """, tagLib.out.toString())
    }
    




}
