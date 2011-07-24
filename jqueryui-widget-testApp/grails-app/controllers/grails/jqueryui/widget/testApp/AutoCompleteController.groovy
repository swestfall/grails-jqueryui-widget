package grails.jqueryui.widget.testApp

class AutoCompleteController {

    def index = { }

    def localData = {
        List stocks = Stock.findAll().collect() {return it.company.toString()}
        return [stocks: stocks]
    }
}
