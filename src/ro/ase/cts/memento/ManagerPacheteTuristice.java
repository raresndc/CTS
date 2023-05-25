package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerPacheteTuristice {
    private List<MementoPachetTuristic> listaPachete = new ArrayList<>();

    public void adaugaMemento(MementoPachetTuristic mementoPachetTuristic){
        listaPachete.add(mementoPachetTuristic);
    }

    public MementoPachetTuristic getMemento(int index){
        return listaPachete.get(index);
    }

    public MementoPachetTuristic getLastMemento() throws Exception {
        if(listaPachete.size() != 0){
            MementoPachetTuristic memento = listaPachete.get(listaPachete.size() - 1);
            listaPachete.remove(listaPachete.size() - 1);
            return memento;
        } else {
            throw new Exception("Nu exista stari salvate");
        }
    }
}
