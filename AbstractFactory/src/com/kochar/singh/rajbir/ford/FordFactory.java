package com.kochar.singh.rajbir.ford;

import com.kochar.singh.rajbir.factory.CarFactory;
import com.kochar.singh.rajbir.factory.Vehical;

public class FordFactory implements CarFactory{

    public static final short FIGO = 1 ;
    public static final short FIGO_SEDAN = 2;
    public static final short MUSTANG = 3;
    @Override
    public Vehical getVehical(Short fordVehicals) {


        switch (fordVehicals) {
            case FIGO:{
                return new Figo();
            }
            case FIGO_SEDAN:{
                return new FigoSedan();
            }
            case MUSTANG:{
                return new Mustang();
            }
            default:
            return null;
        }

        
    }

}