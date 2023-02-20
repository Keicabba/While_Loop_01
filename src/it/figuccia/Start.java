package it.figuccia;

import java.util.concurrent.TimeUnit;

public class Start {
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("I am in loop");
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            // Gestione dell'eccezione
            System.out.println("Loop interrotto!");
        }
    }
}
