/*
Design a class Student with the methods, get Number and put Number to read and 
display the Roll No. of each student and get Marks() and put Marks() to read and 
display their marks. Create an interface called Sports with a method put Grade() that 
will display the grade obtained by a student in Sports. Design a class called Result 
that will implement the method put Grade() and generate the final result based on the
grade in sports and the marks obtained from the superclass Student.
*/

import java.util.*;

interface Sports{
    String getGrade();
    void putGrade(String Grade);
}

class Student{
    private int RollNumber,Marks;
    int getMarks(){return Marks;}
    void putMarks(int Marks){this.Marks = Marks;}
    int getRollNo(){return RollNumber;}
    void putRollNo(int RollNumber){this.RollNumber = RollNumber;}
}

class Result extends Student implements Sports{
    private String SportsGrade;
    public String getGrade(){return SportsGrade;}
    public void putGrade(String SportsGrade){this.SportsGrade=SportsGrade;}
    void displayResult(){
        System.out.println("Student Roll: " + super.getRollNo());
        System.out.println("Student Marks: " + super.getMarks());
        System.out.println("Student Sports Grade: " + SportsGrade);
    }
    
}

class q4{
    public static void main(String args[]){
        Result s1 = new Result();
        s1.putRollNo(8198);
        s1.putMarks(100);
        s1.putGrade("A1");
        s1.displayResult();
    }
}