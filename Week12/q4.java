/*
Write a JavaFX application program that displays the student details that are created 
in the earlier labs using Canvas based on the option chosen in List View (student 
register numbers).
*/

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class q4 extends Application{
    public static void main(String args[]){
        launch(args);
    }
    public void start(Stage mystage){
        FlowPane rootNode = new FlowPane();
        Scene myscene = new Scene(rootNode,300,300);
        mystage.setTitle("JavaFx Student");

        mystage.setScene(myscene);
        mystage.show();
    }
}