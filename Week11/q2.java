/*
Write a JavaFX program to accept an integer from the user in a text field and
display the multiplication table (up to number *10) for that number. Use FlowPane
layout for the application.
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class q2 extends Application{
	public static void main(String args[]){
		launch(args);
	}
	public void start(Stage mystage){
		FlowPane rootNode = new FlowPane(10,10);
		Scene myscene = new Scene(rootNode,370,250);
		mystage.setTitle("JavaFx");
		rootNode.setAlignment(Pos.TOP_CENTER);
		Label lb1 = new Label("Enter a Number:");
		TextField tf1 = new TextField();

		Button bt1 = new Button("Show Table");
		bt1.setOnAction((event)->{
			VBox vb1 = new VBox();
			int m = Integer.parseInt(tf1.getText());
			for(int i = 1;i<11;i++){
				Label lb2 = new Label(m+" * "+i+" = "+m*i);
				vb1.getChildren().add(lb2);
			}
			rootNode.getChildren().add(vb1);
		});

		rootNode.getChildren().addAll(new HBox(5,lb1,tf1,bt1));

		mystage.setScene(myscene);
		mystage.show();
	}
}