/*
Write a JavaFX application program that obtains two floating point numbers in two
text fields from the user and displays the sum, product, difference and quotient of
these numbers using Canvas on clicking compute button with a calculator image
placed on it.
*/

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class q1 extends Application{
	public static void main(String args[]){
		System.out.println("Hello World!");
		launch(args);
	}
	@Override
	public void start(Stage mystage){
		FlowPane rootNode = new FlowPane();
		Scene myscene = new Scene(rootNode,600,200);
		mystage.setTitle("javaFx Caluculator");


		Label lb1 = new Label("Enter a:- ");
		TextField tf1 = new TextField();
		Label lb2 = new Label("Enter b:- ");
		TextField tf2 = new TextField();
		lb2.setPadding(new Insets(0,0,0,20));

		Canvas cv1 = new Canvas(600,100);
		GraphicsContext gc1 = cv1.getGraphicsContext2D();

		ImageView iv1 = new ImageView("./Images/png_caluculator.png");
		Button bt1 = new Button("Calc",iv1);
		bt1.setOnAction((event)->{
			float a = Float.parseFloat(tf1.getText());
			float b = Float.parseFloat(tf2.getText());
			gc1.fillText("Sum: "+(a+b),10,10);
			gc1.fillText("Product: "+(a*b),10,25);
			gc1.fillText("Difference: "+(a-b),10,40);
			gc1.fillText("Quotient:" + (a/b),10,55);
		});


		rootNode.getChildren().addAll(lb1,tf1,lb2,tf2,bt1,cv1);

		mystage.setScene(myscene);
		mystage.show();
	}
}
