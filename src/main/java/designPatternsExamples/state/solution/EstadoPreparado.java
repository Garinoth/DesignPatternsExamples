package designPatternsExamples.state.solution;

public class EstadoPreparado extends EstadoConexion {

    public EstadoPreparado() {
    }

    @Override
    public void abrir(Conexion conexion) {

    }

    @Override
    public void cerrar(Conexion conexion) {
        conexion.setCodigoEstado(Estado.CERRADO);
        conexion.setEstado(new EstadoCerrado());
    }

    @Override
    public void parar(Conexion conexion) {
        conexion.setCodigoEstado(Estado.PARADO);
        conexion.setEstado(new EstadoParado());
    }

    @Override
    public void iniciar(Conexion conexion) {

    }

    @Override
    public void enviar(Conexion conexion, String msg) {
        conexion.getLink().enviar(msg);
        conexion.setCodigoEstado(Estado.ESPERANDO);
        conexion.setEstado(new EstadoEsperando());
    }

    @Override
    public void recibir(Conexion conexion, int respuesta) {
        throw new UnsupportedOperationException("Acción no permitida... ");
    }

}
