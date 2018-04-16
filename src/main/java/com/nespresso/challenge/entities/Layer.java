package com.nespresso.challenge.entities;

public class Layer {

    private final int slaves ;
    private final int anks ;

    public Layer(int slaves, int anks) {
        this.slaves = slaves;
        this.anks = anks;
    }

    public int getNumberOfBlock () {
        return slaves / 50;
    }

    public String getBlockType () {
        return anks / getNumberOfBlock() >= 2 ? "X" : "V";
    }

    public boolean isSame (Layer layer) {
        return getNumberOfBlock() == layer.getNumberOfBlock() && getBlockType().equals(layer.getBlockType()) ;
    }
}
