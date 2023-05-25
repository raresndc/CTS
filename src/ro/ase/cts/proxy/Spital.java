package ro.ase.cts.proxy;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private List<Vizitator> listaVizitatori = new ArrayList<>();

    public Spital() {
        this.listaVizitatori = listaVizitatori;
    }

    @Override
    public void accesSalon(Vizitator vizitator) {
        listaVizitatori.add(vizitator);
        System.out.println("Vizitatorul " + vizitator.getNume());
    }
}
