package com.kochar.singh.rajbir.honda;

import com.kochar.singh.rajbir.factory.CarFactory;
import com.kochar.singh.rajbir.factory.Vehical;

public class HondaFactory implements CarFactory{

    public static final short CITY = 111;
    public static final short AMAZE = 222;
    public static final short CIVIC = 333;
    @Override
    public Vehical getVehical(Short VEHICAL) {
        switch (VEHICAL) {
            case CITY:{
                return new city();
            }
            case AMAZE:{
                return new Amaze();
            }
            case CIVIC:{
                return new Civic();
            }
            default:
                return null;
        }
    }
}