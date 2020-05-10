package com.kochar.singh.rajbir.factory;

import com.kochar.singh.rajbir.mahindra.MahindraFactory;

public class AbstractFactoryNew extends AbstractFactory{

    public static final byte MAHINDRA = 104;
    public static CarFactory getFactory(byte factories) {
         
        switch(factories){
            case MAHINDRA:{
                return new MahindraFactory();
            }        
            default:{
                return AbstractFactory.getFactory(factories);
            }
        }        
    }
}
