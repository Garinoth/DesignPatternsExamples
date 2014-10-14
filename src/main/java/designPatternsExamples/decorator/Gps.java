package designPatternsExamples.decorator;

public class Gps extends Decorador {

    public Gps(double precio, Componente componente) {
        super(precio, componente);
    }

    @Override
    public double precioFinal() {
        return 0;
    }

    @Override
    public String descripcionFinal() {
        // TODO Auto-generated method stub
        return null;
    }

}
