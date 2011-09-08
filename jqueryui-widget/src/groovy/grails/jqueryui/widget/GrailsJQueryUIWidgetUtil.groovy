package grails.jqueryui.widget

import java.util.regex.Matcher
import java.util.regex.Pattern
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
            return new org.json.JSONObject2(((Map) obj)).toString();
        } else if (obj instanceof ArrayList) {
            return new org.json.JSONArray2(((Collection) obj)).toString();
        }
    }
    
    public static String cleanWhitespace(String inputStr) {
        String patternStr = "\\s+";
        String replaceStr = " ";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.replaceAll(replaceStr).trim();
    }
}

