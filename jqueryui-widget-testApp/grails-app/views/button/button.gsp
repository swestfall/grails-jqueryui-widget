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

                <jqueryui:button
                        id="button1"/>

                <jqueryui:button
                        id="div1"/>

                <jqueryui:button
                        id="input1"/>

                <jqueryui:button
                        id="href1"/>

            </div>


            %{--<div class="exampleContainer">--}%
                %{--<h3>Tag Creates Markup</h3>--}%
                %{--<label for="date2">Date:</label>--}%
                %{--<jqueryui:jquiDatePicker--}%
                        %{--id="date2"--}%
                        %{--namespace="grails.jqueryui.components"/>--}%
            %{--</div>--}%

        </div>
    </body>
</html>