<%--
  Created by IntelliJ IDEA.
  User: swestfall
  Date: 8/5/11
  Time: 6:29 AM
  To change this template use File | Settings | File Templates.
--%>

%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Example of jQueryUI Buttons</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="examplePageContainer">

            <h2>Example of jQueryUI Buttons</h2>
            <a href="http://jqueryui.com/demos/button/">jQueryUI Example</a>

            <div class="exampleContainer">
                <h3>Pre-Existing Markup</h3>

                <button id="button1">Button</button>
                <div id="div1">Div</div>
                <input id="input1" type="submit" value="submit">
                <a href="#" id="href1">Anchor</a>

                <jqueryui:jquiButton
                        id="button1"/>

                <jqueryui:jquiButton
                        id="div1"/>

                <jqueryui:jquiButton
                        id="input1"/>

                <jqueryui:jquiButton
                        id="href1"/>

            </div>

        </div>
    </body>
</html>