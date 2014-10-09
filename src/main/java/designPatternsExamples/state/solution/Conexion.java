package designPatternsExamples.state.solution;

public class Conexion {
    
    private EstadoConexion estado;
    private Estado codigoEstado;
    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new EstadoCerrado();
        this.codigoEstado = Estado.CERRADO;
    }

    protected void setEstado(EstadoConexion estado) {
        this.estado = estado;
    }

    protected void setCodigoEstado(Estado codigoEstado) {
        this.codigoEstado = codigoEstado;  
    }
    
    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.codigoEstado;
    }

    public void abrir() {
        this.estado.abrir(this);
    }

    public void cerrar() {
        this.estado.cerrar(this);
    }

    public void parar() {
        this.estado.parar(this);
    }

    public void iniciar() {
        this.estado.iniciar(this);
    }

    public void enviar(String msg) {
        this.estado.enviar(this, msg);
    }

    public void recibir(int respuesta) {
        this.estado.recibir(this, respuesta);
    }

}
