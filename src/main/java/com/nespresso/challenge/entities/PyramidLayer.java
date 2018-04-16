package com.nespresso.challenge.entities;

public class PyramidLayer {

    private final int slaves ;
    private final int anks ;

    public PyramidLayer(int slaves, int anks) {
        this.slaves = slaves;
        this.anks = anks;
    }

    public int getNumberOfSlot () {
        return slaves / 50;
    }

    public String getSlotType () {
        return anks / getNumberOfSlot() >= 2 ? "X" : "V";
    }

    public boolean isSame (PyramidLayer pyramidLayer) {
        return getNumberOfSlot() == pyramidLayer.getNumberOfSlot() && getSlotType().equals(pyramidLayer.getSlotType()) ;
    }
}
