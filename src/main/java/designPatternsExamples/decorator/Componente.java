package designPatternsExamples.decorator;

public abstract class Componente {
    
    private double precio;
    
    public Componente(double precio) {
        this.precio = precio;
    }

    public abstract double precioFinal();
    public abstract String descripcionFinal();

}
