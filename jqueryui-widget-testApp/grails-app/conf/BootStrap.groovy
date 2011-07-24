import grails.jqueryui.widget.testApp.Stock

 class BootStrap {

    def init = { servletContext ->

        new Stock(company: '3m Co', price: 71.72, change: 0.02, percentChange: 0.03, lastChange: new Date()).save()
        new Stock(company: 'Alcoa Inc', price: 29.01, change: 0.42, percentChange: 1.47, lastChange: new Date().parse('MM/dd/yyyy', '02/01/2005')).save()
        new Stock(company: 'Altria Group Inc', price: 83.81, change: 0.28, percentChange: 0.34, lastChange: new Date().parse('MM/dd/yyyy', '07/07/2011')).save()
        new Stock(company: 'American Express Company', price: 52.55, change: 0.01, percentChange: 0.02, lastChange: new Date().parse('MM/dd/yyyy', '08/12/2007')).save()
        new Stock(company: 'American International Group, Inc.', price: 64.13, change: 0.31, percentChange: 0.49, lastChange: new Date()).save()
        new Stock(company: 'AT&T Inc.', price: 31.61, change: -0.48, percentChange: -1.54, lastChange: new Date()).save()
        new Stock(company: 'Boeing Co.', price: 75.43, change: 0.53, percentChange: 0.72, lastChange: new Date().parse('MM/dd/yyyy', '02/01/2005')).save()
        new Stock(company: 'Caterpillar Inc.', price: 67.27, change: 0.92, percentChange: 1.39, lastChange: new Date().parse('MM/dd/yyyy', '08/12/2007')).save()
        new Stock(company: 'Citigroup, Inc.', price: 49.37, change: 0.02, percentChange: 0.04, lastChange: new Date().parse('MM/dd/yyyy', '01/28/2007')).save()
        new Stock(company: 'E.I. du Pont de Nemours and Company', price: 40.48, change: 0.51, percentChange: 1.28, lastChange: new Date()).save()
        new Stock(company: 'Exxon Mobil Corp', price: 68.1, change: -0.43, percentChange: -0.64, lastChange: new Date()).save()
        new Stock(company: 'General Electric Company', price: 34.14, change: -0.08, percentChange: -0.23, lastChange: new Date().parse('MM/dd/yyyy', '08/12/2007')).save()
        new Stock(company: 'General Motors Corporation', price: 30.27, change: 1.09, percentChange: 3.74, lastChange: new Date().parse('MM/dd/yyyy', '12/20/2002')).save()
        new Stock(company: 'Hewlett-Packard Co.', price: 36.53, change: -0.03, percentChange: -0.08, lastChange: new Date().parse('MM/dd/yyyy', '02/01/2005')).save()
        new Stock(company: 'Honeywell Intl Inc', price: 38.77, change: 0.05, percentChange: 0.13, lastChange: new Date().parse('MM/dd/yyyy', '07/07/2011')).save()
        new Stock(company: 'Intel Corporation', price: 19.88, change: 0.31, percentChange: 1.58, lastChange: new Date().parse('MM/dd/yyyy', '01/28/2007')).save()
        new Stock(company: 'International Business Machines', price: 81.41, change: 0.44, percentChange: 0.54, lastChange: new Date()).save()
        new Stock(company: 'Johnson & Johnson', price: 64.72, change: 0.06, percentChange: 0.09, lastChange: new Date()).save()
        new Stock(company: 'JP Morgan & Chase & Co', price: 45.73, change: 0.07, percentChange: 0.15, lastChange: new Date().parse('MM/dd/yyyy', '08/12/2007')).save()
        new Stock(company: 'McDonald\'s Corporation', price: 36.76, change: 0.86, percentChange: 2.40, lastChange: new Date().parse('MM/dd/yyyy', '01/28/2007')).save()
        new Stock(company: 'Merck & Co., Inc.', price: 40.96, change: 0.41, percentChange: 1.01, lastChange: new Date().parse('MM/dd/yyyy', '07/07/2011')).save()
        new Stock(company: 'Microsoft Corporation', price: 25.84, change: 0.14, percentChange: 0.54, lastChange: new Date()).save()
        new Stock(company: 'Pfizer Inc', price: 27.96, change: 0.4, percentChange: 1.45, lastChange: new Date().parse('MM/dd/yyyy', '02/01/2005')).save()
        new Stock(company: 'The Coca-Cola Company', price: 45.07, change: 0.26, percentChange: 0.58, lastChange: new Date()).save()
        new Stock(company: 'The Home Depot, Inc.', price: 34.64, change: 0.35, percentChange: 1.02, lastChange: new Date().parse('MM/dd/yyyy', '01/28/2007')).save()
        new Stock(company: 'The Procter & Gamble Company', price: 61.91, change: 0.01, percentChange: 0.02, lastChange: new Date()).save()
        new Stock(company: 'United Technologies Corporation', price: 63.26, change: 0.55, percentChange: 0.88, lastChange: new Date().parse('MM/dd/yyyy', '12/20/2002')).save()
        new Stock(company: 'Verizon Communications', price: 35.57, change: 0.39, percentChange: 1.11, lastChange: new Date().parse('MM/dd/yyyy', '07/07/2011')).save()
        new Stock(company: 'Wal-Mart Stores, Inc.', price: 45.45, change: 0.73, percentChange: 1.63, lastChange: new Date()).save()

    }

    def destroy = {
    }

}
