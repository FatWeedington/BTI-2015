import javafx.stage.Stage
import tornadofx.*

class SolarEnergy: App(Solar::class) {
    override fun start(stage: Stage) {
        stage.width = 800.0
        stage.height = 600.0
        super.start(stage)
    }
}

class Solar : View("MyFirstTornadoApp") {
    override val root = vbox() {

    }
}


fun main(args: Array<String>) {
    launch<SolarEnergy>(args)
}