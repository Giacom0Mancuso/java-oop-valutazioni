package org.lessons.java.valutazioni;

import java.util.ArrayList;

public class Corso {
    private ArrayList<Studente> studenti;

    public Corso() {
        this.studenti = new ArrayList<>();
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }


}
