package com.cs.oop.techgiant.complexnooperationsec1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("ComplexNoOperationScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 498, 404);
        stage.setTitle("Complex Number Operation");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {


        launch();
    }
}