package com.netcracker;

public class Piano implements Instrument{

    private int numStrings;

    public Piano() {
    }

    public Piano(int numStrings) {
        this.numStrings = numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public void sound() {
        System.out.println("Piano (numStrings="+numStrings+")");
    }
}
