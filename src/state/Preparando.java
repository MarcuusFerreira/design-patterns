package state;

public class Preparando implements EstadoPedido {
    @Override
    public void preparar(Pedido pedido) {
        throw new RuntimeException("Pedido já está sendo preparado!");
    }

    @Override
    public void iniciarEntrega(Pedido pedido) {
        pedido.setEstado(new EntregaIniciada());
    }

    @Override
    public void finalizarentrega(Pedido pedido) {
        throw new RuntimeException("Pedido não pode ser finalizado pois ainda está sendo preparado");
    }
}
