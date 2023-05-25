package ro.ase.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RetetaFactory {
    private HashMap<Integer, IReteta> retete = new HashMap<>();

    public IReteta getReteta(int codReteta){
        IReteta reteta = retete.get(codReteta);
        if(reteta == null){
            reteta = new RetetaCustom(codReteta, new Recomandare("fara recomandare"));
            retete.put(codReteta, reteta);
        }
        return reteta;
    }
}
