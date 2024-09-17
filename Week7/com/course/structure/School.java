package com.course.structure;

public class School extends Building{
    int noOfClassRooms;
    String gradeLevel;
    public School(int squareFeets,int Stories,int noOfClassRooms,String gradeLevel){
        super(squareFeets, Stories);
        this.noOfClassRooms = noOfClassRooms;
        this.gradeLevel = gradeLevel;
    }
    public void setnoOfClassRooms(int noOfClassRooms){
        this.noOfClassRooms = noOfClassRooms;
    }
    public void setgradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    public int getnoOfClassRooms(){
        return this.noOfClassRooms;
    }
    public String getgradeLevel(){
        return this.gradeLevel;
    }
}