import groovy.xml.MarkupBuilder

def todos = [
        [name: 'one', done: false],
        [name: 'two', done: true]
]

def builder = new MarkupBuilder()

builder.html {
    head {
        title('タイトル')
    }
    body {
        table(border: '1') {
            tr {
                th('Name')
                th('Done')
            }
            todos.each { todo ->
                tr {
                    td(todo.name)
                    td(todo.done)
                }
            }
        }
    }
}