package com.netcracker;

public class Violin implements Instrument {

    private int numStrings;

    public Violin() {
    }

    public Violin(int numStrings) {
        this.numStrings = numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public void sound() {
        System.out.println("Violin plays (numStrings="+numStrings+")");
    }

}
