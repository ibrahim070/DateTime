package com.company;

public class Main {

    public static void main(String[] args) {


        Date date2 = new Date("17-11-2015");


        Time time2 = new Time("13:23:34");

        DateTime datetime = new DateTime(date2,time2);
        datetime.print();

//        String a = "123-34-56";
//        String[] splitted = a.split("-");
//        int[] tarix = new int[splitted.length];
//        for (int i = 0; i < splitted.length; i++) {
//
//            tarix[i] = Integer.parseInt(splitted[i]);
//        }
//        for (int i = 0; i < splitted.length; i++) {
//
//            System.out.println(tarix[i]);
//        }
//        int b = splitted.length;
//        System.out.println(b);


    }
}
