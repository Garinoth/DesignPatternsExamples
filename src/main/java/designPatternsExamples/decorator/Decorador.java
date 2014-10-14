package designPatternsExamples.decorator;

public abstract class Decorador extends Componente {
    
    private Componente componente;

    public Decorador(double precio, Componente componente) {
        super(precio);
        this.componente = componente;
    }
    
}
