import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*; // To use FlowPane,VBox,HBox,GridPane
import javafx.scene.control.*; // To use Label,Button,...
import javafx.event.*; // To use Eventhandler,ActionEvent
import javafx.geometry.*; // To get acsses to Pos Enums
import javafx.scene.canvas.*; // To get GraphicsContext
import javafx.scene.text.*; // To get Font Class
import javafx.scene.paint.*; // TO get Color Enums
import javafx.collections.*; //to use FXCollections.observableArrayList
import javafx.scene.image.*; // To use ImageView

public class JavaFxpractice extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage mystage){
        FlowPane rootNode = new FlowPane();
        Scene myscene = new Scene(rootNode,330,300);
        mystage.setTitle("JavaFx Application");

        Label lb1 = new Label("Hello WOrld!");
        Button bt1 = new Button("Click me");
        bt1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                lb1.setText("hebdhcu");
            }
        });
        // ComboBox
        ObservableList<String> opt1 = FXCollections.observableArrayList("Sleep","Study","Fuck");
        ComboBox cb1 = new ComboBox(opt1);

        // RadioButton
        RadioButton rb1 = new RadioButton("Car");
        RadioButton rb2 = new RadioButton("Dog");
        ToggleGroup tg1 = new ToggleGroup();
        rb1.setToggleGroup(tg1);
        rb2.setToggleGroup(tg1);
        rb1.fire();

        // CheckBox
        CheckBox cx1 = new CheckBox("Car");
        CheckBox cx2 = new CheckBox("Dog");

        // TextField
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter Username");
        tf1.setPrefColumnCount(30);
        // tf1.setText("To setText");

        // Loading Images
        ImageView iv1 = new ImageView("./Week12/Images/png_caluculator.png");
        // If u want to put this image inside a Element or Buton new Button("Name",iv1);

        // GridPane
        // GridPane gp1 = new GridPane();
		// gp1.setAlignment(Pos.CENTER);
		// gp1.setMinSize(300,200);
		// gp1.setVgap(5);gp1.setHgap(5);
        // gp1.add(lb1,1,0); add(Node,Column,Row);



        Canvas cv1 = new Canvas(100,100);
        GraphicsContext gc1 = cv1.getGraphicsContext2D();
        gc1.setStroke(Color.RED);
        gc1.strokeLine(10,10,50,50);
        gc1.strokeRect(10,10,50,50);
        gc1.strokeOval(10,10,50,50);
        gc1.setFont(new Font(20));
        gc1.setFill(Color.GREEN);
        gc1.fillText("Working!!",80,70);


        rootNode.setAlignment(Pos.CENTER);

        rootNode.getChildren().addAll(lb1,bt1,cb1,cv1,rb1,rb2,cx1,cx2,tf1,iv1);

        mystage.setScene(myscene);
        mystage.show();
    }
}