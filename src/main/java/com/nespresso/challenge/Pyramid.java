package com.nespresso.challenge;

import com.nespresso.challenge.entities.Layers;

public class Pyramid {

    private Layers layers = new Layers();

    public void addLayer(String layer) {
        layers.addLayer(layer);
    }

    public String print() {
        return layers.print();
    }
}
