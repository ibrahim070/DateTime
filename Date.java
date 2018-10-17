package com.company;

public class Date {
    public int day;
    public int month;
    public int year;


    public Date(int day, int month, int year) {
        if (year < 0 || month < 0 || day < 0) {
            System.out.println("Tarixi duzgun daxil edin");
        }
        else if (day < 32 && month < 13 && year > 0) {

            this.day = day;
            this.month = month;
            this.year = year;
        }
        else
            System.out.println("Tarixi duzgun daxil edin");



    }


    public Date(String date) {
        String[] splitted = date.split("-");
        int [] tarix = new  int [splitted.length];
        for ( int i = 0; i <splitted.length; i ++){
            tarix[i] = Integer.parseInt(splitted[i]);
        }
         if (tarix[0]<0 & tarix[1]<0 & tarix[2]<0){
            System.out.println("Tarixi duzgun daxil edin");

        }
        else if (tarix[0] < 32 & tarix[1] < 13 & tarix[2]>0) {

            this.day = tarix[0];
            this.month = tarix[1];
            this.year = tarix[2];
        }

        else
            System.out.println("Tarixi duzgun daxil edin");






    }
    public  void print(){

        System.out.printf("%d.%d.%d",day,month,year);
    }

    public int getDay() {
        System.out.println(day);
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        System.out.println(month);
        return month;

    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        System.out.println(year);
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
