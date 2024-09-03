/*
Create a Building class and two subclasses, House and School. The Building class 
contains fields for square footage and stories. The House class contains additional 
fields for number of bedrooms and baths. The School class contains additional fields 
for number of classrooms and grade level (for example, elementary or junior high). 
All the classes contain appropriate get and set methods. Create a main method that 
declares objects of each type.

*/

import java.io.*;
import java.util.*;

class Building{
    int squareFeets,Stories;
    Building(int squareFeets,int Stories){
        this.squareFeets = squareFeets;
        this.Stories = Stories;
    }
    void setSquareFeets(int squareFeets){
        this.squareFeets = squareFeets;
    }
    void setStories(int Stories){
        this.Stories = Stories;
    }
    int getSquareFeets(){
        return this.squareFeets;
    }
    int getStories(){
        return this.Stories;
    }

}
class House extends Building{
    int noOfBedRomms,noOfBathRooms;
    House(int squareFeets,int Stories,int noOfBedRomms,int noOfBathRooms){
        super(squareFeets, Stories);
        this.noOfBedRomms = noOfBedRomms;
        this.noOfBathRooms = noOfBathRooms;
    }
    void setnoOfBedRomms(int noOfBedRomms){
        this.noOfBedRomms = noOfBedRomms;
    }
    void setnoOfBathRooms(int noOfBathRooms){
        this.noOfBathRooms = noOfBathRooms;
    }
    int getnoOfBedRomms(){
        return this.noOfBedRomms;
    }
    int getnoOfBathRooms(){
        return this.noOfBathRooms;
    }

}
class School extends Building{
    int noOfClassRooms;
    String gradeLevel;
    School(int squareFeets,int Stories,int noOfClassRooms,String gradeLevel){
        super(squareFeets, Stories);
        this.noOfClassRooms = noOfClassRooms;
        this.gradeLevel = gradeLevel;
    }
    void setnoOfClassRooms(int noOfClassRooms){
        this.noOfClassRooms = noOfClassRooms;
    }
    void setgradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    int getnoOfClassRooms(){
        return this.noOfClassRooms;
    }
    String getgradeLevel(){
        return this.gradeLevel;
    }
}

class q4{
    public static void main(String args[]){
        House h1 = new House(2000,2,3,3);
        h1.setSquareFeets(2500);
        System.out.println(h1.getSquareFeets());
        h1.setnoOfBedRomms(4);
        System.out.println(h1.getnoOfBedRomms());

        School s1 = new School(5000,4,30,"High school");
        s1.setStories(5);
        System.out.println(s1.getnoOfClassRooms());
        s1.setgradeLevel("University");
        System.out.println(s1.getgradeLevel());
    }
}