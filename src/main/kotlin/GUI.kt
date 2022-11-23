import javafx.geometry.Pos
import javafx.stage.Stage
import tornadofx.*

class GUI: App(MainView::class) {
    override fun start(stage: Stage) {
        stage.width = 300.0
        stage.height = 150.0
        super.start(stage)
    }
}

class MainView : View("MyFirstTornadoApp") {
    override val root = hbox(alignment = Pos.CENTER) {
        button { "Henlo" }
        label("My First Tornado App !!!")
    }
}

fun main(args: Array<String>) {
    launch<GUI>(args)
}