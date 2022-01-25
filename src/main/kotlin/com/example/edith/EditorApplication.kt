package com.example.edith

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class EditorApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(EditorApplication::class.java.getResource("app-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 1024.0, 512.0)
        stage.title = "Edith"
        stage.scene = scene
        DynamicSceneSystem.initializeScene(scene)
        fxmlLoader.getController<AppController>().init()
        stage.show()
    }
}

fun main() {
    Application.launch(EditorApplication::class.java)
}