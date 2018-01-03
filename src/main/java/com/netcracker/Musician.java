package com.netcracker;

public class Musician {

    private Instrument instrument;
    private int age;

    public Musician() {
    }

    public Musician(Instrument instrument) {
        this.instrument = instrument;
    }

    public Musician(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void play(){
        System.out.println("Musician:");
        System.out.println("age="+age);
        instrument.sound();
    }
}
