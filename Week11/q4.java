/*
Define a class called Employee with the attributes name, empID, designation, 
basicPay, DA, HRA, PF, LIC, netSalary. DA is 40% of basicPay, HRA is 15% of 
basicPay, PF is 12% of basicPay. Display all the employee information in a JavaFX 
application
*/

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class q4 extends Application{
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage mystage){
        FlowPane rootNode = new FlowPane();
        Scene myscene = new Scene(rootNode,300,300);
        mystage.setTitle("Employee Information");

        rootNode.setAlignment(Pos.CENTER);
        rootNode.getChildren().add(new Employee("Karthikeya","Student",8198,1000000,10000).display());

        mystage.setScene(myscene);
        mystage.show();
    }
}
class Employee{
    String name,designation;
    int empID;
    double basicPay,DA,HRA,PF,LIC,netSalary;
    Employee(String name,String designation,int empID,double basicPay,double LIC){
        this.name = name;this.empID = empID;this.basicPay = basicPay;
        this.LIC = LIC;this.DA = 0.4*basicPay;this.designation = designation;
        this.HRA = 0.15*basicPay;this.PF = 0.12 * basicPay;
        this.netSalary = basicPay + PF + HRA - DA - LIC;
    }
    VBox display(){
        Label lb1 = new Label("Employee Name: "+name);
        Label lb2 = new Label("Employee Id: "+empID);
        Label lb3 = new Label("Employee Designation: "+designation);
        Label lb4 = new Label("Employee basicPay: "+basicPay);
        Label lb5 = new Label("Employee net Salary: "+netSalary);
        
        return new VBox(lb1,lb2,lb3,lb4,lb5);
    }
}