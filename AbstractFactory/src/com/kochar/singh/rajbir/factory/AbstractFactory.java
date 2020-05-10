package com.kochar.singh.rajbir.factory;

import com.kochar.singh.rajbir.ford.FordFactory;
import com.kochar.singh.rajbir.honda.HondaFactory;
import com.kochar.singh.rajbir.vw.VwFactory;

public class AbstractFactory {

    public static final byte FORD = 101;
    public static final byte VOLKSWAGON = 102;
    public static final byte HONDA = 103;
    public static CarFactory getFactory(byte factories) {
         
        switch(factories){
            case FORD:{
                return new FordFactory();
            }
            case VOLKSWAGON:{
                return new VwFactory();
            }
            case HONDA:{
                return new HondaFactory();
            }
            default:{
                return null;
            }
        }        
    }
}