package grails.jqueryui.widget

import org.codehaus.groovy.grails.web.servlet.mvc.GrailsParameterMap

public class GrailsJQueryUIWidgetUtil {

    private static GrailsJQueryUIWidgetUtil instance;

    private GrailsJQueryUIWidgetUtil() {}

    public static GrailsJQueryUIWidgetUtil getInstance() {
        if (instance == null) {
            instance = new GrailsJQueryUIWidgetUtil();
        }
        return instance;
    }

    public String toJSON(Object obj) {
        if (obj instanceof Map) {
            return new org.json.JSONObject(((Map) obj)).toString();
        } else if (obj instanceof ArrayList) {
            return new org.json.JSONArray(((Collection) obj)).toString();
        }
    }
}

