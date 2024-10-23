//javac --module-path "C:\Program Files\Java\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml app.java
//java --module-path "C:\Program Files\Java\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml app

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;


public class app extends Application{
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage mystage) throws Exception{
        FlowPane flowpane = new FlowPane();
        Scene myscene = new Scene(flowpane,300,200);
        mystage.setScene(myscene);
        mystage.show();
    }
}