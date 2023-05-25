package ro.ase.cts.proxy;

import java.util.ArrayList;
import java.util.List;

public class SpitalProxy implements ISpital{
    List<Vizitator> listaVizitatori = new ArrayList<>();

    private ISpital spital;

    public SpitalProxy(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void accesSalon(Vizitator vizitator) {
        if(vizitator.isHaine() == true && vizitator.isScrisoare() == true){
            listaVizitatori.add(vizitator);
        }
        if(listaVizitatori.size() >= 5){
            System.out.println("Urmatorii vizitatori vor fi introdusi:\n");
            for (Vizitator vizitator1 : listaVizitatori){
                spital.accesSalon(vizitator1);
            }
        } else {
            System.out.println("Nu s-a atins minimul necesar!");
        }
    }
}
