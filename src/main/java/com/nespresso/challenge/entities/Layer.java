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

    public Block getBlock () {
        return anks / getNumberOfBlock() >= 2 ? Block.HIGH_QUALITY : Block.LOW_QUALITY;
    }

    public boolean isSame (Layer layer) {
        return getNumberOfBlock() == layer.getNumberOfBlock() && getBlock().equals(layer.getBlock()) ;
    }
}
