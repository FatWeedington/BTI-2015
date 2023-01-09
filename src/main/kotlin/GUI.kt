import javafx.geometry.Pos
import javafx.stage.Stage
import tornadofx.*

class GUI: App(Counter::class) {
    override fun start(stage: Stage) {
        stage.width = 800.0
        stage.height = 600.0
        super.start(stage)
    }
}

class MainView : View("MyFirstTornadoApp") {
    override val root = vbox() {
        var fld = textfield()
        button("hemnlo"){
            action{ println(fld.text)}
            action{ println(fld.clear())}
        }
    }
}

class Counter : View("MyFirstTornadoApp") {
    var flda = label("1")
    var fldb = label("1")

    override val root = hbox(spacing = 100, alignment = Pos.CENTER) {
        vbox(spacing = 10, alignment = Pos.CENTER){
            button("  A  "){
                action{flda.text = flda.text.toInt().inc().toString()}
            }
            add(flda)
        }

        vbox(spacing = 10, alignment = Pos.CENTER){
            button("  B  "){
                action{fldb.text = fldb.text.toInt().inc().toString()}
            }
            add(fldb)
        }
    }
}


fun main(args: Array<String>) {
    launch<GUI>(args)
}