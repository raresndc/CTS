package ro.ase.cts.flyweight2;

import ro.ase.cts.flyweight2.Recomandari;
import ro.ase.cts.flyweight2.RetetaCustom;
import ro.ase.cts.flyweight2.RetetaFactory;

public class MainFlyweight2 {
    public static void main(String args[]){
        RetetaFactory factory = new RetetaFactory();
        IReteta reteta1 = factory.getReteta(1, "Astm bronsic");
        reteta1.display(new Recomandari("A se evita efortul!"));

        IReteta reteta2 = factory.getReteta(2, "Deficit pulmonar");
        reteta2.display(new Recomandari("A se evita efortul excesiv!"));

        IReteta reteta3 = factory.getReteta(2, "Dureri musculare");
        reteta3.display(new Recomandari("A se bea apa!"));

        System.out.println(reteta2 == reteta3);

    }
}
