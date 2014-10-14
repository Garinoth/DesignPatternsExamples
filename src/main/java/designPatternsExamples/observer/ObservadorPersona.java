package designPatternsExamples.observer;

import upm.jbb.IO;

public class ObservadorPersona implements Observador{

    private Persona persona;

    public ObservadorPersona(Persona persona) {
        this.persona = persona;
        this.persona.aniadir(this);
    }

    @Override
    public void actualizar() {
        IO.out.setStatusBar(this.persona.getEstado());
    }

}
