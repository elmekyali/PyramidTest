package com.nespresso.challenge.presenters;

import com.nespresso.challenge.entities.Layer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PyramidPresenter implements Presenter {

    @Override
    public String present(List<Layer> layers) {

        List<String> figure = new ArrayList<>();
        int index = 0;

        while (index < layers.size()) {
            Layer previousLayer = index == 0 ? null : layers.get(index - 1);
            Layer currentLayer = layers.get(index);

            if (previousLayer == null) figure.add(repeat(currentLayer.getNumberOfBlock(), currentLayer.getBlockType()));
            else {
                int numberOfUnderscore = previousLayer.getNumberOfBlock() - currentLayer.getNumberOfBlock();
                int numberOfSpace = layers.get(0).getNumberOfBlock() - (numberOfUnderscore + currentLayer.getNumberOfBlock());
                figure.add(0,
                        String.format("%s%s%s%s%s",
                                repeat(numberOfSpace / 2, " "),
                                repeat(numberOfUnderscore / 2, "_"),
                                repeat(currentLayer.getNumberOfBlock(), currentLayer.getBlockType()),
                                repeat(numberOfUnderscore / 2, "_"),
                                repeat(numberOfSpace / 2, " "))
                );
            }
            index++;
        }
        return String.join("\n", figure);
    }

    private String repeat(int number, String chain) {
        return String.join("", Collections.nCopies(number, chain));
    }
}
