package com.nespresso.challenge.parsers;

import com.nespresso.challenge.entities.PyramidLayer;

public class PyramidLayerParser implements Parser {
    public PyramidLayer parse(String layer, String separator) {
        String[] component = layer.split(separator);
        int slaves = Integer.parseInt(component[0].split(" ")[0]);
        int anks = Integer.parseInt(component[1].split(" ")[0]);
        return new PyramidLayer(slaves , anks);
    }
}
