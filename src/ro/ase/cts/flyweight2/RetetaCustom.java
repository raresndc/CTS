package ro.ase.cts.flyweight2;

public class RetetaCustom implements IReteta {
    private int codReteta;
    private String diagnostic;
    private Recomandari recomandare;

    public RetetaCustom(int codReteta, String diagnostic, Recomandari recomandare) {
        this.codReteta = codReteta;
        this.diagnostic = diagnostic;
        this.recomandare = recomandare;
    }

    public int getCodReteta() {
        return codReteta;
    }

    public void setCodReteta(int codReteta) {
        this.codReteta = codReteta;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Recomandari getRecomandare() {
        return recomandare;
    }

    public void setRecomandare(Recomandari recomandare) {
        this.recomandare = recomandare;
    }

    @Override
    public void display(Recomandari recomandari) {
        System.out.println("RetetaCustom{" +
                "codReteta=" + codReteta +
                ", diagnostic='" + diagnostic + '\'' +
                ", recomandare=" + recomandari.getText() +
                '}');
    }
}
