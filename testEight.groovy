import groovy.swing.SwingBuilder

import javax.swing.WindowConstants as WC
import java.awt.BorderLayout as BL
import java.awt.FlowLayout as FL

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
    panel(constraints: BL.SOUTH) {
        button(text: 'Insert Record', actionPerformed: { event ->
            dialog.show()
        })
    }
}

dialog = swing.dialog(size: [350, 250], layout: new FL()) {
    panel({ label 'ID'; textField(id: 'id', columns: 20) })
    panel({ label 'Item'; textField(id: 'item', columns: 20) })
    panel {
        button(text: 'PUSH', actionPerformed: { event ->
            data << [
                    'id'  : swing.id.text,
                    'item': swing.item.text
            ]
            table.model.fireTableDataChanged()
            dialog.hide()
        })
        button(text: 'CLOSE', actionPerformed: { event ->
            dialog.hide()
        })
    }
}
frame.pack()
frame.show()
