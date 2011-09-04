<%--
  Created by IntelliJ IDEA.
  User: swestfall
  Date: 8/5/11
  Time: 6:58 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Example of jQueryUI Tabs</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="examplePageContainer">

            <h2>Example of jQueryUI Tabs</h2>
            <a href="http://jqueryui.com/demos/tabs/#default">jQueryUI Example</a>

            <div class="exampleContainer">
                <h3>Pre-Existing Markup</h3>
                <div id="progressBar"></div>

                <jqueryui:jquiProgressBar
                        id="progressBar"
                        config="${[
                                value: 37
                        ]}"/>

            </div>


        </div>
    </body>
</html>