package com.nespresso.challenge.parsers;

import com.nespresso.challenge.entities.PyramidLayer;

public interface Parser {
    PyramidLayer parse (String layer , String separator);
}
