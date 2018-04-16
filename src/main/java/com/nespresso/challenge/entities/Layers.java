package com.nespresso.challenge.entities;

import com.nespresso.challenge.parsers.Parser;
import com.nespresso.challenge.parsers.PyramidLayerParser;
import com.nespresso.challenge.presenters.Presenter;
import com.nespresso.challenge.presenters.PyramidPresenter;

import java.util.*;

public class Layers {

    private List<Layer> layers = new LinkedList<>();
    private Parser pyramidLayerParser = new PyramidLayerParser();
    private Presenter pyramidPresenter = new PyramidPresenter();

    public void addLayer(String layer) {

        Layer currentLayer = pyramidLayerParser.parse(layer, ", ");
        layers.add(currentLayer);

        int indexOfLastLayer = layers.size() - 2;

        while (indexOfLastLayer >= 0 &&
                (layers.get(indexOfLastLayer).getNumberOfBlock() < currentLayer.getNumberOfBlock() || layers.get(indexOfLastLayer).isSame(currentLayer))
                )
            layers.remove(indexOfLastLayer--);
    }

    public String print() {
        return pyramidPresenter.present(layers);
    }

}
