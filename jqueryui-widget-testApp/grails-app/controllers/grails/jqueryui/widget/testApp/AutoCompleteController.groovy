package grails.jqueryui.widget.testApp

import grails.converters.JSON

class AutoCompleteController {

    def index = { }

    def localData = {
        List stocks = Stock.findAll().collect() {return it.company.toString()}
        return [stocks: stocks]
    }

    def remoteData = {

    }

    def searchStockByCompanyJSON = {
        String query = params.remove('term');
        List stocks = Stock.findAllByCompanyLike(query + '%').collect() {
            return [
                    id: it.id,
                    label: it.company,
                    value: it.company
            ]
        }
        render stocks as JSON
    }
}
