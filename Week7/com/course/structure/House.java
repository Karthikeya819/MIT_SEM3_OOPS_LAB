package com.course.structure;

public class House extends Building{
    int noOfBedRomms,noOfBathRooms;
    public House(int squareFeets,int Stories,int noOfBedRomms,int noOfBathRooms){
        super(squareFeets, Stories);
        this.noOfBedRomms = noOfBedRomms;
        this.noOfBathRooms = noOfBathRooms;
    }
    public void setnoOfBedRomms(int noOfBedRomms){
        this.noOfBedRomms = noOfBedRomms;
    }
    public void setnoOfBathRooms(int noOfBathRooms){
        this.noOfBathRooms = noOfBathRooms;
    }
    public int getnoOfBedRomms(){
        return this.noOfBedRomms;
    }
    public int getnoOfBathRooms(){
        return this.noOfBathRooms;
    }

}