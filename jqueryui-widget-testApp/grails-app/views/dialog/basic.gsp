<%--
  Created by IntelliJ IDEA.
  User: swestfall
  Date: 7/30/11
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Example of jQueryUI Dialog</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="examplePageContainer">

            <h2>Example of jQueryUI Dialog</h2>
            <a href="http://jqueryui.com/demos/dialog/">jQueryUI Example</a>


            <div class="exampleContainer">
                <h3>Pre-Existing Markup</h3>
                <div id="dialog" title="Basic dialog">
                    <p>This is the default dialog which is useful for displaying information. The dialog window can be moved, resized and closed with the 'x' icon.</p>
                </div>

            </div>

            <jqueryui:jquiDialog
                    id="dialog"
                    dialog="grails.jqueryui.components"
                    config="${[:]}"/>

        </div>
    </body>
</html>