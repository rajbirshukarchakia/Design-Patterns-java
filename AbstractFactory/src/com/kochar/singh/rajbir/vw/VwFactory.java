package com.kochar.singh.rajbir.vw;

import com.kochar.singh.rajbir.factory.CarFactory;
import com.kochar.singh.rajbir.factory.Vehical;

public class VwFactory implements CarFactory{
    
    public static final short AMEO = 11;
    public static final short VENTO = 22;
    public static final short POLO = 33;
    
    @Override
    public Vehical getVehical(Short vwVehicals) {
        switch (vwVehicals) {
            case AMEO:{
                return new Ameo();
            }
            case POLO:{
                return new Polo();
            }
            case VENTO:{
                return new Vento();
            }
            default:
            return null;
        }
       
    }
}