package ro.ase.cts.proxy;

import java.util.ArrayList;
import java.util.List;

public class Vizitator {
    private String nume;
    private boolean scrisoare;
    private boolean haine;

    public Vizitator(String nume, boolean scrisoare, boolean haine) {
        this.nume = nume;
        this.scrisoare = scrisoare;
        this.haine = haine;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isScrisoare() {
        return scrisoare;
    }

    public void setScrisoare(boolean scrisoare) {
        this.scrisoare = scrisoare;
    }

    public boolean isHaine() {
        return haine;
    }

    public void setHaine(boolean haine) {
        this.haine = haine;
    }
}
