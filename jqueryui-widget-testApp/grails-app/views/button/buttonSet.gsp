<%--
  Created by IntelliJ IDEA.
  User: swestfall
  Date: 8/5/11
  Time: 6:43 AM
  To change this template use File | Settings | File Templates.
--%>

<html>
    <head>
        <title>Example of jQueryUI ButtonSet</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="examplePageContainer">

            <h2>Example of jQueryUI ButtonSet</h2>
            <a href="http://jqueryui.com/demos/button/#radio">jQueryUI Example</a>

            <div class="exampleContainer">
                <h3>Pre-Existing Markup</h3>

                <div id="radio">
                    <input type="radio" id="radio1" name="radio"/><label for="radio1">Choice 1</label>
                    <input type="radio" id="radio2" name="radio" checked="checked"/><label for="radio2">Choice 2</label>
                    <input type="radio" id="radio3" name="radio"/><label for="radio3">Choice 3</label>
                </div>

                <jqueryui:jquiButtonSet
                        id="radio"/>

            </div>


        </div>
    </body>
</html>