package com.example.javafx_app;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PvE {
    Stage stage = new Stage();
    String stylesheet = getClass().getResource("style.css").toExternalForm();
    public void start() {
        Button level1 = new Button("1");
        level1.getStyleClass().add("button-display");
        level1.setLayoutX(100);
        level1.setLayoutY(60);
        level1.setOnAction(actionEvent -> {
            Plate plate = new Plate();
            plate.start();
            stage.close();
        });

        Button level2 = new Button("2");
        level2.getStyleClass().add("button-display");
        level2.setLayoutX(100);
        level2.setLayoutY(100);

        Pane root = new Pane();
        root.getChildren().add(level1);
        root.getChildren().add(level2);
        root.getStyleClass().add("main-display");

        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(stylesheet);


        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
}
