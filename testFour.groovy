import groovy.xml.MarkupBuilder

def xml = new MarkupBuilder()

xml.People(){
    Person(type:'regular'){
        Name("taro")
        Age(15)
    }
    Person(type:'regular'){
        Name("jiro")
        Age(14)
    }
}