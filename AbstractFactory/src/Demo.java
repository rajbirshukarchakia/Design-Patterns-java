

import com.kochar.singh.rajbir.factory.AbstractFactory;
import com.kochar.singh.rajbir.factory.AbstractFactoryNew;
import com.kochar.singh.rajbir.factory.CarFactory;
import com.kochar.singh.rajbir.factory.Vehical;
import com.kochar.singh.rajbir.honda.HondaFactory;
import com.kochar.singh.rajbir.mahindra.MahindraFactory;


public class Demo{
    public static void main(String[] args) {
     
    CarFactory fordCarFactory = AbstractFactoryNew.getFactory(AbstractFactoryNew.MAHINDRA);
    Vehical vehical = fordCarFactory.getVehical(MahindraFactory.XUV5OO);
    vehical.car();  
    }
}