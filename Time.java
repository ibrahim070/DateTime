package com.company;

public class Time {
    public int saat;
    public int deqiqe;
    public int saniye;
    public Time(int saat,int deqiqe,int saniye){
        this.saat=saat;
        this.deqiqe=deqiqe;
        this.saniye = saniye;
    }
    public Time(String time){

        String[]splitted = time.split(":");
        this.saat = Integer.parseInt(splitted[0]);
        this.deqiqe = Integer.parseInt(splitted[1]);
        this.saniye = Integer.parseInt(splitted[2]);


    }
    public void print(){
        System.out.printf("%d : %d : %d",saat,deqiqe,saniye);
    }

    public int getSaat() {
        System.out.println(saat);
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public int getDeqiqe() {
        System.out.println(deqiqe);
        return deqiqe;
    }

    public void setDeqiqe(int deqiqe) {
        this.deqiqe = deqiqe;
    }

    public int getSaniye() {
        System.out.println(saniye);
        return saniye;
    }

    public void setSaniye(int saniye) {
        this.saniye = saniye;
    }
}
