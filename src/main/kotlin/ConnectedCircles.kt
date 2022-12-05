    import javafx.beans.binding.Bindings
    import javafx.scene.paint.Color
    import javafx.stage.Stage
    import tornadofx.*


    class CircleBindApp : App(CircleBindView::class) {
        override fun start(stage: Stage) {
            stage.width = 300.0
            stage.height = 300.0
            super.start(stage)
        }
    }

    class CircleBindView : View("Circle Binding") {
        override val root = pane {
            circle (radius = 50){
                fill = Color.BLUE
                centerXProperty().bind(Bindings.divide(this@pane.widthProperty(),1/0.25))
                centerYProperty().bind(Bindings.divide(this@pane.heightProperty(), 2))
                radiusProperty().bind(Bindings.divide(this@pane.heightProperty(), 2))
            }
            circle (radius = 50){
                fill = Color.VIOLET
                centerXProperty().bind(Bindings.divide(this@pane.widthProperty(),2))
                centerYProperty().bind(Bindings.divide(this@pane.heightProperty(), 2))
                radiusProperty().bind(Bindings.divide(this@pane.heightProperty(), 2))
            }
            circle (radius = 50){
                fill = Color.PINK
                centerXProperty().bind(Bindings.divide(this@pane.widthProperty(),1/0.75))
                centerYProperty().bind(Bindings.divide(this@pane.heightProperty(), 2))
                radiusProperty().bind(Bindings.divide(this@pane.heightProperty(), 2))
            }
        }
    }

    fun main(args: Array<String>) {
        launch<CircleBindApp>(args)
    }
