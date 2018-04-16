package com.nespresso.challenge;

import com.nespresso.challenge.entities.PyramidLayer;
import com.nespresso.challenge.parsers.Parser;
import com.nespresso.challenge.parsers.PyramidLayerParser;
import com.nespresso.challenge.presenters.Presenter;
import com.nespresso.challenge.presenters.PyramidPresenter;

import java.util.*;

public class Pyramid {

    private List<PyramidLayer> layers = new LinkedList<>();
    private Parser pyramidLayerParser = new PyramidLayerParser();
    private Presenter pyramidPresenter = new PyramidPresenter();

    public void addLayer(String layer) {

        PyramidLayer currentLayer = pyramidLayerParser.parse(layer , ", ");
        layers.add(currentLayer);

        int index = layers.size() - 2;

        while (index >= 0 &&
                    ( layers.get(index).getNumberOfSlot() < currentLayer.getNumberOfSlot() ||
                            layers.get(index).isSame(currentLayer)
                    )
                )
            layers.remove(index--);


    }

    public String print() {
        return pyramidPresenter.present(layers);
    }
}
