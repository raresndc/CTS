package ro.ase.cts.memento;

public class PachetTuristic {
    private double pret;
    private String numePachet;

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public PachetTuristic(double pret) {
        super();
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "PachetTuristic{" +
                "pret=" + pret +
                ", numePachet='" + numePachet + '\'' +
                '}';
    }

    public MementoPachetTuristic salvareMemento(){
        return new MementoPachetTuristic(pret);
    }

    public void undoToMemento(MementoPachetTuristic mementoPachetTuristic){
        this.pret = mementoPachetTuristic.getPretPachet();
    }
}
