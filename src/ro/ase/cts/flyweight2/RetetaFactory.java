package ro.ase.cts.flyweight2;

import java.util.HashMap;
import java.util.Map;

public class RetetaFactory {
    private HashMap<Integer, IReteta> mapRetete = new HashMap<>();

    public IReteta getReteta(int codReteta, String diagnostic){
        IReteta reteta = mapRetete.get(codReteta);

        if(reteta == null){
            reteta = new RetetaCustom(codReteta, diagnostic, new Recomandari(""));
            mapRetete.put(codReteta, reteta);
        }
        return reteta;
    }
}
