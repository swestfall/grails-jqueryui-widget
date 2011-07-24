<%--
  Created by IntelliJ IDEA.
  User: swestfall
  Date: 7/24/11
  Time: 6:22 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Example of jQueryUI DatePicker</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="examplePageContainer">

            <h2>Example of jQueryUI DatePicker</h2>
            <a href="http://jqueryui.com/demos/datepicker/">jQueryUI Example</a>

            <div class="exampleContainer">
                <h3>Pre-Existing Markup</h3>
                <label for="date">Date:</label>
                <input id="date" type="text"/>
                <jqueryui:jquiDatePicker
                        id="date"
                        namespace="grails.jqueryui.components"
                        renderMarkup="false"/>
            </div>


            <div class="exampleContainer">
                <h3>Tag Creates Markup</h3>
                <label for="date2">Date:</label>
                <jqueryui:jquiDatePicker
                        id="date2"
                        namespace="grails.jqueryui.components"
                        />
            </div>

        </div>
    </body>
</html>