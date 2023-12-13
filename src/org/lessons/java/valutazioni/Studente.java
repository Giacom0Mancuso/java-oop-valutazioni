package org.lessons.java.valutazioni;

import java.math.BigDecimal;
import java.util.Random;

public class Studente {
    private int idStudente;
    private int assenze;
    private BigDecimal media;

    private int counter = 0;

    public Studente() {
        this.idStudente = counter++;
        this.assenze = randomAttendance();
        this.media = randomGrade();
    }

    public int getIdStudente() {
        return idStudente;
    }

    public void setIdStudente(int idStudente) {
        this.idStudente = idStudente;
    }

    public int getAssenze() {
        return assenze;
    }

    public void setAssenze(int assenze) {
        this.assenze = assenze;
    }

    public BigDecimal getMedia() {
        return media;
    }

    public void setMedia(BigDecimal media) {
        this.media = media;
    }

    public BigDecimal randomGrade(){
        Random generator = new Random();
        return BigDecimal.valueOf(generator.nextDouble(0, 5));

    }

    public int randomAttendance(){
        Random generator = new Random();
        return generator.nextInt(0, 100);
    }
}
