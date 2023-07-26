package com.workintech.model;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        if (width<0){
            this.width = 0;
        }
        else {
            this.width = width;
        }

        if (height<0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(int width){
        if (width<0){
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }
    public void setHeight(int height){
        if (height<0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }

    public double getArea(){
        return height*width;
    }
}
