package com.nespresso.challenge.entities;

public enum Block {
    HIGH_QUALITY {
        @Override
        public String print() {
            return "X";
        }
    }
    ,
    LOW_QUALITY {
        @Override
        public String print() {
            return "V";
        }
    } ;

    public abstract String print();

}
