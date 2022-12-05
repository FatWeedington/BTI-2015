import javafx.beans.binding.Bindings
import javafx.scene.paint.Color
import javafx.stage.Stage
import tornadofx.*
import javax.swing.GroupLayout.Alignment


class DynamicCircle: App(CircleView1::class) {
    override fun start(stage: Stage) {
        stage.width = 300.0
        stage.height = 300.0
        super.start(stage)
    }
}

class CircleView1 : View("Circle Binding") {
    private val numbers = mutableListOf("1","2","3").asObservable()

    override val root = borderpane {
        top{
            vbox{
                Alignment.CENTER
                button("add"){
                    action { numbers.add(numbers.size.toString()) }
                }
                button("Remove"){
                    action { numbers.removeAt(numbers.size-1) }
                }
            }
        }
        center{
            flowpane{
                bind
            }
        }
        }
    }