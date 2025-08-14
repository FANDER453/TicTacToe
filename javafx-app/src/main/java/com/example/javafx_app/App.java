package com.example.javafx_app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class App extends Application {
	@Override
    public void start(Stage stage) {
		
		Button singlePlay = new Button("Против ИИ");
        singlePlay.getStyleClass().add("button-display");
        singlePlay.setLayoutX(100);
        singlePlay.setLayoutY(60);
        singlePlay.setOnAction(actionEvent -> {
            PvE pve = new PvE();
            pve.start();
            stage.close();

        });


        Button multiPlay = new Button("Мультиплеер");
        multiPlay.getStyleClass().add("button-display");
        multiPlay.setLayoutX(97);
        multiPlay.setLayoutY(100);
        multiPlay.setOnAction(actionEvent -> {
            PvP pvp = new PvP();
            pvp.main();
            stage.close();
        });
        

        Pane root = new Pane();
        root.getChildren().add(singlePlay);
        root.getChildren().add(multiPlay);
        root.getStyleClass().add("main-display");



        Scene scene = new Scene(root, 300, 200);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());




        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }


	
}
