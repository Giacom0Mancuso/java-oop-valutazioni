package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Corso corso = new Corso();
        ArrayList<Studente> listaStudenti = corso.getStudenti();
        boolean listDone = false;
        while (!listDone){
            System.out.println("do you want to add a student to the Course? y/n");
            String addToList = scanner.nextLine();
            if (addToList.equals("y") || addToList.equals("yes")){
                Studente studente = new Studente();
                listaStudenti.add(studente);
            } else if (addToList.equals("n") || addToList.equals("no")) {
                listDone = true;
            }else{
                System.out.println("the wording of the response isn't acceptable");
                System.out.println("please try again");
            }
        }
        boolean removeStudent = false;
        while (!removeStudent){
            System.out.println("do you want to remove a student to the Course? y/n");
            String removeFromList = scanner.nextLine();
            if (removeFromList.equals("y") || removeFromList.equals("yes")){
                System.out.println("choose the student you want to remove by their number in the list ");
                int numeroScelto = scanner.nextInt();
                listaStudenti.remove(listaStudenti.get(numeroScelto));
            }else if (removeFromList.equals("n") || removeFromList.equals("no")) {
                removeStudent = true;
            }else{
                System.out.println("the wording of the response isn't acceptable");
                System.out.println("please try again");
            }
        }
        scanner.close();
    }
}