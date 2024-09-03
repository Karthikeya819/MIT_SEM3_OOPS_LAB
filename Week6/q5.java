/*
 Create an abstract class Figure with abstract method area and two integer dimensions. 
Create three more classes Rectangle, Triangle and Square which extend Figure and 
implement the area method. Show how the area can be computed dynamically during 
run time for Rectangle, Square and Triangle to achieve dynamic polymorphism. (Use 
the reference of Figure class to call the three different area methods)
*/

import java.io.*;

abstract class Figure{
    double x,y;
    Figure(double x,double y){
        this.x = x;
        this.y = y;
    }
    abstract double area();
}
class Rectangle extends Figure{
    Rectangle(double x,double y){
        super(x,y);
    }
    double area(){
        return super.x*super.y;
    }
}
class Triangle extends Figure{
    Triangle(double x,double y){
        super(x,y);
    }
    double area(){
        return 0.5*x*y;
    }
}
class Square extends Figure{
    Square(int side){
        super(side,side);
    }
    @Ovverride
    double area(){
        return x*y;
    }
}

class q5{
    public static void main(String args[]){
        Figure fig;
        fig = new Rectangle(2,3);
        System.out.println("Rectangle: "+fig.area());

        fig = new Triangle(5,2);
        System.out.println("Traingle: "+fig.area());

        fig = new Square(2);
        System.out.println("Square: "+fig.area());
    }
}