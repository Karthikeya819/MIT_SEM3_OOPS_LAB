/*
Write a JavaFX application program that creates a thread which will scroll the
message from right to left across the window or left to right based on RadioButton
option selected by the user.
*/
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.canvas.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class q3 extends Application{
	public static void main(String args[]){
		launch(args);
	}
	public void start(Stage mystage){
		FlowPane rootNode = new FlowPane();
		Scene myscene = new Scene(rootNode,600,300);
		mystage.setTitle("Scrolling Text");

		rootNode.setAlignment(Pos.TOP_CENTER);

		Canvas cv1 = new Canvas(600,100);
		GraphicsContext gc1 = cv1.getGraphicsContext2D();

		RadioButton rb1 = new RadioButton("Left to Right");
		RadioButton rb2 = new RadioButton("Right to Left");
		ToggleGroup tg1 = new ToggleGroup();
		rb1.setToggleGroup(tg1);rb2.setToggleGroup(tg1);
		Button bt1 = new Button("Start");

		bt1.setOnAction((event)->{
			Animate anim1 = new Animate(gc1,rb1.isSelected());
			anim1.start();
		});

		rootNode.getChildren().addAll(cv1,rb1,rb2,bt1);
		mystage.setScene(myscene);
		mystage.show();

	}
}
class Animate extends Thread{
	GraphicsContext gc1;
	 boolean l2r;
	 int x;
	Animate(GraphicsContext gc1, boolean l2r){
		this.gc1 = gc1;this.l2r = l2r;this.x=0;
	}
	public void run(){
		double canvasWidth = gc1.getCanvas().getWidth();
    	double canvasHeight = gc1.getCanvas().getHeight();
		if(l2r){
			for(x = 0;x<=canvasWidth;){
				gc1.fillText("Left To Right",x,30);
				try{sleep(100);}catch(Exception e){e.printStackTrace();}
				x+=20;
				gc1.clearRect(0, 0, canvasWidth, canvasHeight);
			}
		}else{
			for(x = Integer.parseInt(canvasWidth);x>=0;){
				gc1.fillText("Left To Right",x,30);
				try{sleep(100);}catch(Exception e){e.printStackTrace();}
				x-=20;
				gc1.clearRect(0, 0, canvasWidth, canvasHeight);
			}

		}
	}
}