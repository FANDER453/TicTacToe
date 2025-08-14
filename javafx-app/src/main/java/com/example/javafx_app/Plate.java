package com.example.javafx_app;

import javafx.animation.PauseTransition;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class Plate {
	
	String stylesheet = getClass().getResource("style.css").toExternalForm();
    static Stage stage = new Stage();
    static Button[][] button = new Button[3][3];
    
    public static void win() {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	alert.setHeaderText("You Win");
    	alert.getDialogPane().setPrefSize(200, 200);
    	alert.showAndWait();
    	stage.close();
    	PvE pve = new PvE();
    	pve.start();
    }
    
    
    public static void loss() {
    	Alert alert = new Alert(Alert.AlertType.ERROR);
    	alert.setHeaderText("You Lose");
    	alert.getDialogPane().setPrefSize(200, 200);
    	alert.show();
    	stage.close();
    	PvE pve = new PvE();
    	pve.start();
    }
    
    public static void draw() {
    	ArrayList<Button> notAvailableButtons = new ArrayList<>();
    	Alert alert = new Alert(Alert.AlertType.NONE);
    	alert.setHeaderText("Draw");
    	alert.getDialogPane().setPrefSize(200, 200);
    	for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (button[i][j].isDisable()) {
                    notAvailableButtons.add(button[i][j]);
                    if(notAvailableButtons.size() == 9) {
                    	alert.show();
                    	stage.close();
                    	PvE pve = new PvE();
                    	pve.start();
                    }
                }
            }
        }
    	
    }
    public static void availableButtons() {
    	ArrayList<Button> availableButtons = new ArrayList<>();
    	for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!button[i][j].isDisable()) {
                    availableButtons.add(button[i][j]);
                }
            }
        }
        if (!availableButtons.isEmpty()) {
            int randomIndex = (int) (Math.random() * availableButtons.size());
            Button selected = availableButtons.get(randomIndex);
            selected.setText("O");
            selected.setDisable(true);
        }
    }
    public static void random() {
    			
    			//0.0|1.0|2.0
				//0.1|1.1|2.1
				//0.2|1.2|2.2
    	
	            //Паттерн блокировки
    			//По вертикали
    			//0.0|
    			//0.1|
    			//0.2|
    			
	            if(button[0][0].getText() == "X" && button[0][1].getText() == "X"){
	            	if(!button[0][2].isDisable()) {
	            		button[0][2].setText("O");
		            	button[0][2].setDisable(true);
	            	}else {
	            		availableButtons();
	            	}
	            	
                }else if(button[0][0].getText() == "X" && button[0][2].getText() == "X") {
                	if(!button[0][1].isDisable()) {
                		button[0][1].setText("O");
    	            	button[0][1].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                	
                }else if(button[0][1].getText() == "X" && button[0][2].getText() == "X") {
                	if(!button[0][0].isDisable()) {
                		button[0][0].setText("O");
    	            	button[0][0].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }
	            //|1.0
	            //|1.1
	            //|1.2
	            
                else if(button[1][0].getText() == "X" && button[1][1].getText() == "X"){
                	if(!button[1][2].isDisable()) {
                		button[1][2].setText("O");
    	            	button[1][2].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[1][0].getText() == "X" && button[1][2].getText() == "X") {
                	if(!button[1][1].isDisable()) {
                		button[1][1].setText("O");
    	            	button[1][1].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[1][1].getText() == "X" && button[1][2].getText() == "X") {
                	if(!button[1][0].isDisable()) {
                		button[1][0].setText("O");
    	            	button[1][0].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }
	            
	            //|2.0
	            //|2.1
	            //|2.2
	        	
                else if(button[2][0].getText() == "X" && button[2][1].getText() == "X"){
                	if(!button[2][2].isDisable()) {
                		button[2][2].setText("O");
    	            	button[2][2].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[2][0].getText() == "X" && button[2][2].getText() == "X") {
                	if(!button[2][1].isDisable()) {
                		button[2][1].setText("O");
    	            	button[2][1].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[2][1].getText() == "X" && button[2][2].getText() == "X") {
                	if(!button[2][0].isDisable()) {
                		button[2][0].setText("O");
    	            	button[2][0].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }
	            
	        	//По горизонтали
	            //0.0|1.0|2.0
                else if(button[0][0].getText() == "X" && button[1][0].getText() == "X"){
                	if(!button[2][0].isDisable()) {
                		button[2][0].setText("O");
    	            	button[2][0].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[0][0].getText() == "X" && button[2][0].getText() == "X") {
                	if(!button[1][0].isDisable()) {
                		button[1][0].setText("O");
    	            	button[1][0].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[1][0].getText() == "X" && button[2][0].getText() == "X") {
                	if(!button[0][0].isDisable()) {
                		button[0][0].setText("O");
    	            	button[0][0].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }
	            //0.1|1.1|2.1
                else if(button[0][1].getText() == "X" && button[1][1].getText() == "X"){
                	if(!button[2][1].isDisable()) {
                		button[2][1].setText("O");
    	            	button[2][1].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[0][1].getText() == "X" && button[2][1].getText() == "X") {
                	if(!button[1][1].isDisable()) {
                		button[1][1].setText("O");
    	            	button[1][1].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[1][1].getText() == "X" && button[2][1].getText() == "X") {
                	if(!button[0][1].isDisable()) {
                		button[0][1].setText("O");
    	            	button[0][1].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }
	            //0.2|1.2|2.2
                else if(button[0][2].getText() == "X" && button[1][2].getText() == "X"){
                	if(!button[2][2].isDisable()) {
                		button[2][2].setText("O");
    	            	button[2][2].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[0][2].getText() == "X" && button[2][2].getText() == "X") {
                	if(!button[1][2].isDisable()) {
                		button[1][2].setText("O");
    	            	button[1][2].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[1][2].getText() == "X" && button[2][2].getText() == "X") {
                	if(!button[0][2].isDisable()) {
                		button[0][2].setText("O");
    	            	button[0][2].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }
                //По диагонали
	            //0.0
	            //|1.1
	            //||2.2
                
                else if(button[0][0].getText() == "X" && button[2][2].getText() == "X") {
                	if(!button[1][1].isDisable()) {
                		button[1][1].setText("O");
    	            	button[1][1].setDisable(true);
               	}else {
	            	availableButtons();
               	}
                }else if(button[0][0].getText() == "X" && button[1][1].getText() == "X") {
                	if(!button[2][2].isDisable()) {
                		button[2][2].setText("O");
    	            	button[2][2].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[1][1].getText() == "X" && button[2][2].getText() == "X") {
                	if(!button[0][0].isDisable()) {
                		button[0][0].setText("O");
    	            	button[0][0].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }
	            //||2.0
	            //|1.1
	            //0.2
                else if(button[2][0].getText() == "X" && button[0][2].getText() == "X") {
                	if(!button[1][1].isDisable()) {
                		button[1][1].setText("O");
    	            	button[1][1].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[2][0].getText() == "X" && button[1][1].getText() == "X") {
                	if(!button[0][2].isDisable()) {
                		button[0][2].setText("O");
    	            	button[0][2].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }else if(button[1][1].getText() == "X" && button[0][2].getText() == "X") {
                	if(!button[2][0].isDisable()) {
                		button[2][0].setText("O");
    	            	button[2][0].setDisable(true);
                	}else {
	            		availableButtons();
	            	}
                }
	            
                else {
                	availableButtons();
                }
	            
                //Варианты проигрыша
                //По вертикали
                if(button[0][0].getText() == "O" && button[0][1].getText() == "O" && button[0][2].getText() == "O"){
                	loss();
                }else if(button[1][0].getText() == "O" && button[1][1].getText() == "O" && button[1][2].getText() == "O") {
                	loss();
                }else if(button[2][0].getText() == "O" && button[2][1].getText() == "O" && button[2][2].getText() == "O") {
                	loss();
                }
                //По горизонтали
                else if(button[0][0].getText() == "O" && button[1][0].getText() == "O" && button[2][0].getText() == "O") {
                	loss();
                }else if(button[0][1].getText() == "O" && button[1][1].getText() == "O" && button[2][1].getText() == "O") {
                	loss();
                }else if(button[0][2].getText() == "O" && button[1][2].getText() == "O" && button[2][2].getText() == "O") {
                	loss();
                }
                
                //По диоганали
                else if(button[0][0].getText() == "O" && button[1][1].getText() == "O" && button[2][2].getText() == "O") {
                	loss();
                }else if(button[2][0].getText() == "O" && button[1][1].getText() == "O" && button[0][2].getText() == "O") {
                	loss();
                }else {
                	draw();
                }
	        }
        
    //}
    
    //Ход

    //Игрок 
    
    
    public static void player() {
    		
    		
    		for (int i = 0; i < button.length; i++){
	            for (int j = 0; j < button[i].length; j++){
	                final int row = i;
	                final int col = j;
	                
	                button[i][j].setOnAction(actionEvent -> {
	
	                    if (button[row][col].getText().isEmpty()){
	                        button[row][col].setText("X");
	                        button[row][col].setDisable(true);
	                        
	                        PauseTransition delay = new PauseTransition(Duration.seconds(0.5));
	                        delay.setOnFinished(e -> {
	                        	random();
	                        });
	                        delay.play();	                        
	                        
	                    }
	                    
	                    //Варианты победы
	                    //По вертикали
	                    if(button[0][0].getText() == "X" && button[0][1].getText() == "X" && button[0][2].getText() == "X"){
	                    	win();
	                    }else if(button[1][0].getText() == "X" && button[1][1].getText() == "X" && button[1][2].getText() == "X") {
	                    	win();
	                    }else if(button[2][0].getText() == "X" && button[2][1].getText() == "X" && button[2][2].getText() == "X") {
	                    	win();
	                    }
	                    //По горизонтали
	                    else if(button[0][0].getText() == "X" && button[1][0].getText() == "X" && button[2][0].getText() == "X") {
	                    	win();
	                    }else if(button[0][1].getText() == "X" && button[1][1].getText() == "X" && button[2][1].getText() == "X") {
	                    	win();
	                    }else if(button[0][2].getText() == "X" && button[1][2].getText() == "X" && button[2][2].getText() == "X") {
	                    	win();
	                    }
	                    
	                    //По диоганали
	                    else if(button[0][0].getText() == "X" && button[1][1].getText() == "X" && button[2][2].getText() == "X") {
	                    	win();
	                    }else if(button[2][0].getText() == "X" && button[1][1].getText() == "X" && button[0][2].getText() == "X") {
	                    	win();
	                    }else {
	                    	draw();
	                    }
	                   
	                });
	                
	           }
            
    		}
    		
    	
	    	
    	
    }
    
    
    public void start() {
        GridPane grid = new GridPane();
        grid.getStyleClass().add("main-display");  
        
        //Создане buttons
        for (int i = 0; i < button.length; i++){
            for (int j = 0; j < button[i].length; j++){
                button[i][j] = new Button();
                button[i][j].getStyleClass().add("button-plate");
                grid.add(button[i][j], i,j);
                
            }
        }
        player();
        
        
        
        
        Pane root = new Pane();
        grid.add(root, 4,0);

        Scene scene = new Scene(grid, 300, 200);
        scene.getStylesheets().add(stylesheet);


        stage.setScene(scene);
        stage.show();

    }
}

