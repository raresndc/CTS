package ro.ase.cts.flyweight;

public class RetetaCustom implements IReteta{
    private int idReteta;
    private Recomandare recomandare;

    public RetetaCustom(int idReteta, Recomandare recomandare) {
        this.idReteta = idReteta;
        this.recomandare = recomandare;
    }

    @Override
    public void display(Recomandare recomandare) {
        System.out.println("Reteta cu id-ul: " +
                idReteta + " si recomandarea: " + recomandare.getRecomandare());
    }
}
