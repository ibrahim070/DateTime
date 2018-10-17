package com.company;

public class DateTime {
    public Date date;
    public  Time time;
    public DateTime(Date date,Time time){
        this.date = date;
        this.time = time;
    }
    public void print(){

       date.print();
       System.out.println();
       time.print();
    }

}
