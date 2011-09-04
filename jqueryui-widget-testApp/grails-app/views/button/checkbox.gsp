<%--
  Created by IntelliJ IDEA.
  User: swestfall
  Date: 8/5/11
  Time: 6:47 AM
  To change this template use File | Settings | File Templates.
--%>

<html>
    <head>
        <title>Example of jQueryUI Checkbox</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="examplePageContainer">

            <h2>Example of jQueryUI Checkbox</h2>
            <a href="http://jqueryui.com/demos/button/#checkbox">jQueryUI Example</a>

            <div class="exampleContainer">
                <h3>Pre-Existing Markup</h3>

                <input type="checkbox" id="check"/><label for="check">Toggle</label>

                <div id="format">
                    <input type="checkbox" id="check1"/><label for="check1">B</label>
                    <input type="checkbox" id="check2"/><label for="check2">I</label>
                    <input type="checkbox" id="check3"/><label for="check3">U</label>
                </div>

                <jqueryui:jquiButton
                        id="check"/>

                <jqueryui:jquiButtonSet
                        id="format" />

            </div>

        </div>
    </body>
</html>