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
        <title>Example of jQueryUI AutoComplete with Local DataSource</title>
        <meta name="layout" content="main"/>
    </head>
    <body>
        <div class="examplePageContainer">

            <h2>Example of jQueryUI AutoComplete with Local DataSource</h2>
            <a href="http://jqueryui.com/demos/autocomplete/#default">jQueryUI Example</a>


            <div class="exampleContainer">
                <h3>Pre-Existing Markup</h3>
                <label for="tags">Tags:</label>
                <input id="tags"/>
                <jqueryui:jquiAutoComplete
                        id="tags"
                        namespace="grails.jqueryui.components"
                        renderMarkup="false"
                        config="${[
                        source: stocks
                    ]}"/>
            </div>

            <div class="exampleContainer">
                <h3>Tag Creates Markup</h3>
                <label for="tags2">Tags:</label>
                <jqueryui:jquiAutoComplete
                        id="tags2"
                        namespace="grails.jqueryui.components"
                        config="${[
                        source: stocks
                    ]}"/>
            </div>

        </div>
    </body>
</html>