package ro.ase.cts.flyweight;

public class MainFlyweight {
    public static void main(String args[]){
        RetetaFactory factory = new RetetaFactory();
        IReteta reteta1 = factory.getReteta(1);
        reteta1.display(new Recomandare("bea"));

        IReteta reteta2 = factory.getReteta(2);
        reteta2.display(new Recomandare("fara sare"));

        IReteta reteta3 = factory.getReteta(2);
        reteta3.display(new Recomandare("fara amidon"));
        System.out.println(reteta2 == reteta3);
    }
}
