/*
1. Write a JavaFX application program to do the following:
	a. Display the message “Welcome to JavaFX programming” using Label in the Scene.
	b. Set the text color of the Label to Magenta.
	c. Set the title of the Stage to “This is the first JavaFX Application”.
	d. Set the width and height of the Scene to 500 and 200 respectively.
	e. Use FlowPane layout and set the hgap and vgap of the FlowPane to desired values.
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*; 
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;

public class q1 extends Application{
	public static void main(String args[]){
		launch(args);
	}
	public void start(Stage mystage){
		FlowPane flowpane = new FlowPane(20,20);
        Scene myscene = new Scene(flowpane,500,200);
        mystage.setTitle("Welcome to JavaFX programming");

        Label lb1 = new Label("Welcome to JavaFX programming");
        lb1.setTextFill(Color.MAGENTA);
        flowpane.getChildren().add(lb1);

        mystage.setScene(myscene);
        mystage.show();
	}
}