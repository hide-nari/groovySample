import groovy.swing.SwingBuilder

import javax.swing.WindowConstants as WC
import java.awt.BorderLayout as BL

data = [
        [id: 1, item: 'one'],
        [id: 2, item: 'two'],
        [id: 3, item: 'three'],
]

swing = new SwingBuilder()

table = swing.table() {
    tableModel(list: data) {
        propertyColumn(header: 'ID', propertyName: 'id', preferredWidth: 20)
        propertyColumn(header: 'Item', propertyName: 'item', preferredWidth: 200)
    }
}

frame = swing.frame(title: 'タイトル',
        layout: new BL(),
        defaultCloseOperation: WC.EXIT_ON_CLOSE) {
    panel(constraints: BL.NORTH) {
        label(text: '見出しテキスト')
    }
    panel(constraints: BL.CENTER) {
        scrollPane {
            widget(table)
        }
    }
}
frame.pack()
frame.show()
