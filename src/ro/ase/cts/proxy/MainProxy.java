package ro.ase.cts.proxy;

import java.util.ArrayList;
import java.util.List;

public class MainProxy {
    public static void main(String args[]) {
        ISpital spital = new Spital();

        Vizitator v1 = new Vizitator("Popescu", true, true);
        Vizitator v2 = new Vizitator("Enescu", true, true);
        Vizitator v3 = new Vizitator("Georgescu", true, true);
        Vizitator v4 = new Vizitator("Danescu", true, true);
        Vizitator v5 = new Vizitator("Cristescu", true, false);
        Vizitator v6 = new Vizitator("Ionescu", true, true);

        List<Vizitator> listaVizitatori = new ArrayList<>();
        listaVizitatori.add(v1);
        listaVizitatori.add(v2);
        listaVizitatori.add(v3);
        listaVizitatori.add(v4);
        listaVizitatori.add(v5);
        listaVizitatori.add(v6);

        ISpital spitalProxy = new SpitalProxy(spital);
        for (Vizitator vizitator : listaVizitatori) {
            spitalProxy.accesSalon(vizitator);
        }

    }


}
