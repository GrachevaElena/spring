package com.netcracker;

import java.util.List;

public class Musician {

    private List<Instrument> instrument;

    public Musician() {
    }

    public Musician(List<Instrument> instrument) {
        this.instrument = instrument;
    }

    public List<Instrument> getInstrument() {
        return instrument;
    }

    public void setInstrument(List<Instrument> instrument) {
        this.instrument = instrument;
    }

    public void play(){
        System.out.println("Musician is playing:");
        for (Instrument instr: instrument)
            instr.sound();
    }
}
