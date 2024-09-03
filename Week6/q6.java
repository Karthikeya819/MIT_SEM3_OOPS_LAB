/*
Design a base class called Student with the following 2 fields:- (i) Name (ii) Id. 
Derive 2 classes called Sports and Exam from the Student base class. Class Sports 
has a field called s_grade and class Exam has a field called e_grade which are 
integer fields. Derive a class called Results which inherit from Sports and Exam. 
This class has a character array or string field to represent the final result. Also it has 
a method called display which can be used to display the final result. Illustrate the usage of 
these classes in main.
*/

import java.io.*;

class Student{
    String Name;
    int Id;
}
class Sports extends Student{
    int s_grade;

}
class Exam extends Student{
    int e_grade;

}

class q6{
    public static void main(String args[]){
        System.out.println("Hello World!");
    }
}