package com.example.javafx_app;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PvP {
	String stylesheet = getClass().getResource("style.css").toExternalForm();
    public void main(){
        TextField nickname = new TextField();
        nickname.getStyleClass().add("allField");
        nickname.setLayoutX(35);
        nickname.setLayoutY(30);

        TextField ip = new TextField();
        ip.getStyleClass().add("allField");
        ip.setLayoutX(35);
        ip.setLayoutY(70);

        TextField port = new TextField();
        port.getStyleClass().add("allField");
        port.setLayoutX(35);
        port.setLayoutY(110);




        Text nicknameText = new Text("Nickname");
        nicknameText.getStyleClass().add("allTextwField");
        nicknameText.setY(52);
        nicknameText.setX(210);

        Text ipText = new Text("IP");
        ipText.getStyleClass().add("allTextwField");
        ipText.setY(91);
        ipText.setX(210);

        Text portText = new Text("Port");
        portText.getStyleClass().add("allTextwField");
        portText.setY(130);
        portText.setX(210);

        Button connect = new Button("Connect");
        connect.getStyleClass().add("button-display");
        connect.setLayoutX(160);
        connect.setLayoutY(160);


        Pane root = new Pane();
        root.getChildren().add(nickname);
        root.getChildren().add(nicknameText);
        root.getChildren().add(ip);
        root.getChildren().add(ipText);
        root.getChildren().add(port);
        root.getChildren().add(portText);
        root.getChildren().add(connect);
        root.getStyleClass().add("main-display");

        Scene scene = new Scene(root, 350, 230);
        scene.getStylesheets().add(stylesheet);


        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}