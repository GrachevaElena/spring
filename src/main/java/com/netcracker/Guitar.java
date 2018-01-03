package com.netcracker;

public class Guitar implements Instrument{

    private int numStrings;

    public Guitar() {
    }

    public Guitar(int numStrings) {
        this.numStrings = numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public void sound() {
        System.out.println("Guitar (numStrings="+numStrings+")");
    }

}
