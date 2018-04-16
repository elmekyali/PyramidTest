package com.nespresso.challenge.presenters;

import com.nespresso.challenge.entities.PyramidLayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PyramidPresenter implements Presenter {

    @Override
    public String present(List<PyramidLayer> layers) {

        List<String> figure = new ArrayList<>();
        int index = 0;
        while (index < layers.size()) {

            PyramidLayer previousLayer = index == 0 ? null : layers.get(index - 1);
            PyramidLayer currentLayer  = layers.get(index);

            if (previousLayer == null) figure.add(repeat(currentLayer.getNumberOfSlot(), currentLayer.getSlotType()));
            else {
                int numberOfUnderscore = previousLayer.getNumberOfSlot() - currentLayer.getNumberOfSlot();
                int numberOfSpace = layers.get(0).getNumberOfSlot() - (numberOfUnderscore + currentLayer.getNumberOfSlot());
                figure.add(0 ,
                        String.format("%s%s%s%s%s" ,
                                repeat( numberOfSpace / 2 , " ") ,
                                repeat(numberOfUnderscore / 2 , "_") ,
                                repeat(currentLayer.getNumberOfSlot() , currentLayer.getSlotType()) ,
                                repeat(numberOfUnderscore / 2 , "_") ,
                                repeat( numberOfSpace / 2 , " "))
                );
            }

            index++;
        }
        return String.join("\n" , figure);
    }

    private String repeat (int number , String chain) {
        return String.join("", Collections.nCopies(number, chain));
    }
}
