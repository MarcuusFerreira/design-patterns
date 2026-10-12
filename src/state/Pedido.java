package state;

public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new Realizado();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void preparar() {
        this.estado.preparar(this);
    }

    public void iniciarEntrega() {
        this.estado.iniciarEntrega(this);
    }

    public void finalizarEntrega() {
        this.estado.finalizarentrega(this);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "estado=" + estado +
                '}';
    }
}
