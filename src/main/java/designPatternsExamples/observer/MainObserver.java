package designPatternsExamples.observer;

import upm.jbb.IO;

public final class MainObserver {
    private MainObserver() {
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Paquito", 0, 0);
        new ObservadorPersona(persona);
        IO.in.addModel(persona);
    }
}
