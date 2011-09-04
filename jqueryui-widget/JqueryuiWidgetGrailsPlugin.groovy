import grails.util.Environment
import org.codehaus.groovy.grails.commons.GrailsApplication

class JqueryuiWidgetGrailsPlugin {
    // the plugin version
    def version = "0.1.4"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def author = "Stephen Westfall"
    def authorEmail = "stephen.westfall@gmail.com"
    def title = "Grails Plugin for jQuery UI Widgets"
    def description = '''\\
This plugin allows for the creation of jQuery-UI Widgets via TagLibs.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/jqueryui-widget"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        mergeConfig(application)
    }

    /**
     * Merge the jqueryui config w/ the application config.  Allow app config to override.
     * Code is taken from Spring-Security-Core  Files:
     *  SpringSecurityUtils.java
     *  ReflectionUtils.java
     *  DefaultSecurityConfig.java
     *
     * @param app
     */
    private void mergeConfig(GrailsApplication app) {

        ConfigObject currentConfig = app.config.grails.jqueryui

        ConfigSlurper slurper = new ConfigSlurper(Environment.getCurrent().getName());
        ConfigObject secondaryConfig = slurper.parse(app.classLoader.loadClass("JqueryuiWidgetConfig"))


        ConfigObject config = new ConfigObject();
        config.putAll(secondaryConfig.jqueryui.merge(currentConfig))

        app.config.grails.jqueryui = config;
    }


    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        this.mergeConfig(application)
    }
}
