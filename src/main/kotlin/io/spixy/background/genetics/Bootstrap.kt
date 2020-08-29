package io.spixy.background.genetics

import javafx.application.Application
import javafx.stage.Stage

class Bootstrap : Application() {
    override fun start(primaryStage: Stage) {
        primaryStage.show()
    }
}

fun main() {
    Application.launch(Bootstrap::class.java)
}