import groovy.xml.XmlNodePrinter
import groovy.xml.XmlParser

def root = new XmlParser().parse('sample.xml')

new File('output.xml').withPrintWriter { writer ->
    writer << '<?xml version="1.0" encoding="UTF-8"?>\n'
    def printer = new XmlNodePrinter(writer)
    printer.preserveWhitespace = true
    printer.print(root)
}