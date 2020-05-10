package com.kochar.singh.rajbir.mahindra;

import com.kochar.singh.rajbir.factory.CarFactory;
import com.kochar.singh.rajbir.factory.Vehical;

public class MahindraFactory implements CarFactory{
    public static final short XUV5OO = 1111;
    public static final short MARAZO = 2222;
    public static final short SCORPIO = 3333;
    @Override
    public Vehical getVehical(Short VEHICAL) {
        switch (VEHICAL) {
            case XUV5OO:{
                return new XUV5OO();
            }                        
            default:
                return null;
        }
    }
}