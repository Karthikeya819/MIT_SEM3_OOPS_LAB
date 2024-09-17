package com.course.structure;

public class Building{
    int squareFeets,Stories;
    public Building(int squareFeets,int Stories){
        this.squareFeets = squareFeets;
        this.Stories = Stories;
    }
    public void setSquareFeets(int squareFeets){
        this.squareFeets = squareFeets;
    }
    public void setStories(int Stories){
        this.Stories = Stories;
    }
    public int getSquareFeets(){
        return this.squareFeets;
    }
    public int getStories(){
        return this.Stories;
    }

}