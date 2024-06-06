package com.cs.oop.techgiant.complexnooperationsec1;

public class ComplexNo {
    int real;
    int img;

    public ComplexNo() {

    }

    public ComplexNo(int real, int img) {
        this.img = img;
        this.real = real;
    }

    public ComplexNo add(ComplexNo c){
        ComplexNo temp = new ComplexNo();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }

//    public ComplexNo add(ComplexNo para1, ComplexNo para2);
//        ComplexNo temp = new ComplexNo();
//        temp.real = this.real + para1.real;
//        temp.img = this.img + c.img;
//        return temp;


    public ComplexNo subtract(ComplexNo c){
        ComplexNo temp = new ComplexNo();
        temp.real = this.real - c.real;
        temp.img = this.img - c.img;
        return temp;
    }

    @Override
    public String toString() {
        return "Complex No: " + real + "+" + img + "i";
    }
}
