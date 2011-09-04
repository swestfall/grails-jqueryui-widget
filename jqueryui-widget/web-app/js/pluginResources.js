if (!window.grails) {
    grails = {};
}

grails.jqueryui = {};

/* components instantiated by taglib */
grails.jqueryui.components = {};

/* contains predefined formatters */
grails.jqueryui.formatters = {};

/* contains reusable event handlers */
grails.jqueryui.events = {};

/* placeholders for configurable namespace and prefixes */
/* content is filled out UtilTagLib */
grails.jqueryui.namespace = "";
grails.jqueryui.prefixes = {};

/* contains reusable utility methods */
grails.jqueryui.util = {
    applyConfig: function(oObject, oConfig) {
        if (oObject && oConfig && typeof oConfig == 'object') {
            for (var val in oConfig) {
                oObject[val] = oConfig[val];
            }
        }
        return oObject;
    },

    //TODO: determine if this is needed
    buildQueryString: function(oState, oDataTable) {

        // Get states or use defaults.  when called by initialReqest, arguments will be null
        oState = oState || { pagination: null, sortedBy: null };
        var sort = (oState.sortedBy) ? oState.sortedBy.key : "id";
        var order = (oState.sortedBy && oState.sortedBy.dir === YAHOO.widget.DataTable.CLASS_DESC) ? "desc" : "asc";
        var offset = (oState.pagination) ? oState.pagination.recordOffset : 0;
        var max = (oState.pagination) ? oState.pagination.rowsPerPage : 25;

        // Build custom request
        var queryString = "?sort=" + sort +
                "&order=" + order +
                "&offset=" + offset +
                "&max=" + max

        return queryString;
    },

    //TODO: determine if this is needed
    handleDataReturnPayload : function(oRequest, oResponse, oPayload) {
        oPayload.totalRecords = oResponse.meta.totalRecords;
        return oPayload;
    }
}
