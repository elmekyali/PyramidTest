package com.nespresso.challenge.parsers;

import com.nespresso.challenge.entities.Layer;

public interface Parser {
    Layer parse (String layer , String separator);
}
