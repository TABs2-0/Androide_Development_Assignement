package com.example

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class Main: Application() {

    override fun start(stage: Stage) {

        val loader = FXMLLoader(javaClass.getResource("/fxml/home.fxml"))
        val scene = Scene(loader.load())

        stage.title = "Grade Processor"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(Main::class.java)
}