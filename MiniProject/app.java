//javac --module-path "C:\Program Files\Java\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml app.java
//java --module-path "C:\Program Files\Java\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml app

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*; 
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.collections.*;


public class app extends Application{
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage mystage) throws Exception{
        FlowPane flowpane = new FlowPane();
        Scene myscene = new Scene(flowpane,600,600);
        //VBox group1 = new VBox(10);
        //group1.getChildren().addAll(new Label("Room 1"),new Button("Button 1"),new Button("Button 2"));
        //group1.setAlignment(Pos.TOP_CENTER);
        // VBox vb1 = new VBox(5);
        // String states[] = {"Low","Medium","High"};
        // ComboBox cb1 = new ComboBox(FXCollections.observableArrayList(states));
        // cb1.setVisible(false);
        // Button bt1 = new Button("OFF");
        // Label l2 = new Label("Light1 is Off");
        // bt1.setOnAction(event->{
        //     cb1.setVisible(!cb1.isVisible());
        //     bt1.setText("ON");
        //     l2.setText("Light1 is On,Brightness: "+cb1.getValue());
        // });
        // cb1.setOnAction(event->{
        //     l2.setText("Light1 is On,Brightness: "+cb1.getValue());
        // });
        // VBox vb11 = new VBox(5);
        // vb11.setAlignment(Pos.TOP_CENTER);
        // vb11.getChildren().addAll(bt1,cb1,l2);
        // vb1.getChildren().addAll(new Label("Light 1:"),vb11);
        VBox vb1 = new VBox(20);
        LightController lc1 = new LightController();
        FanController fc2 = new FanController();
        vb1.getChildren().addAll(lc1.getLayout(),fc2.getLayout());
        flowpane.getChildren().addAll(vb1);
        mystage.setScene(myscene);
        mystage.show();
    }
}
class Controller{
    String Controller_Name;
    boolean State = false;
    String Current_Sate = null;
    String State_Dessciption[];
    Controller(String Controller_Name,String State_Dessciption[]){
        this.Controller_Name = Controller_Name;
        this.State_Dessciption = State_Dessciption;
    }
}
class LightController extends Controller{
    static int Light_Count = 0;
    LightController(){
        super("Light-"+(++Light_Count),new String[]{"Low","Medium","High"});
    }
    VBox getLayout(){
        VBox vb1 = new VBox(5);
        ComboBox cb1 = new ComboBox(FXCollections.observableArrayList(super.State_Dessciption));
        cb1.setVisible(false);
        Button bt1 = new Button("OFF");
        Label l2 = new Label(Controller_Name+" is Off");
        bt1.setOnAction(event->{
            cb1.setVisible(!cb1.isVisible());
            super.State = !super.State;
            bt1.setText((State)?"OFF":"On");
            super.Current_Sate = (cb1.getValue() == null) ? "Null" : cb1.getValue().toString();
            l2.setText((State)?Controller_Name+" is On,Brightness: "+Current_Sate:Controller_Name+" is Off");
        });
        cb1.setOnAction(event->{
            super.Current_Sate = (cb1.getValue() == null) ? "Null" : cb1.getValue().toString();
            l2.setText(Controller_Name+" is On,Brightness: "+Current_Sate);
        });
        VBox vb11 = new VBox(5);
        vb11.setAlignment(Pos.TOP_CENTER);
        vb11.getChildren().addAll(bt1,cb1,l2);
        vb1.getChildren().addAll(new Label(Controller_Name+":"),vb11);
        return vb1;
    }
}
class FanController extends Controller{
    static int Fan_Count = 0;
    FanController(){
        super("Fan-"+(++Fan_Count),new String[]{"Low","Medium","High"});
    }
    VBox getLayout(){
        VBox vb1 = new VBox(5);
        ComboBox cb1 = new ComboBox(FXCollections.observableArrayList(super.State_Dessciption));
        cb1.setVisible(false);
        Button bt1 = new Button("OFF");
        Label l2 = new Label(Controller_Name+" is Off");
        bt1.setOnAction(event->{
            cb1.setVisible(!cb1.isVisible());
            super.State = !super.State;
            bt1.setText((State)?"OFF":"ON");
            super.Current_Sate = (cb1.getValue() == null) ? "Null" : cb1.getValue().toString();
            l2.setText((State)?Controller_Name+" is On, Speed: "+Current_Sate:Controller_Name+" is Off");
        });
        cb1.setOnAction(event->{
            super.Current_Sate = (cb1.getValue() == null) ? "Null" : cb1.getValue().toString();
            l2.setText(Controller_Name+" is On, Speed: "+Current_Sate);
        });
        VBox vb11 = new VBox(5);
        vb11.setAlignment(Pos.TOP_CENTER);
        vb11.getChildren().addAll(bt1,cb1,l2);
        vb1.getChildren().addAll(new Label(Controller_Name+":"),vb11);
        return vb1;
    }
}
class Room{
    final static int Max_Capacity = 10;
    String Room_Name;
    Controller Controllers[];
    int Controllers_Count = 0;
    Room(String Room_Name){
        this.Room_Name = Room_Name;
        Controllers = new Controller[Max_Capacity];
    }
    void Add_Controller(Controller item){
        Controllers[Controllers_Count++] = item;
    }
}