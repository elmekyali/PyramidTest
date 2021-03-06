package com.nespresso.challenge.parsers;

import com.nespresso.challenge.entities.Layer;

public class PyramidLayerParser implements Parser {
    public Layer parse(String layer, String separator) {
        String[] component = layer.split(separator);
        int slaves = Integer.parseInt(component[0].split(" ")[0]);
        int anks = Integer.parseInt(component[1].split(" ")[0]);
        return new Layer(slaves , anks);
    }
}
