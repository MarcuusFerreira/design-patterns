package state;

public class EntregaFinalizada implements EstadoPedido {

    @Override
    public void preparar(Pedido pedido) {
        throw new RuntimeException("Entrega já foi entregue ao cliente");
    }

    @Override
    public void iniciarEntrega(Pedido pedido) {
        throw new RuntimeException("Entrega já foi entregue ao cliente");
    }

    @Override
    public void finalizarentrega(Pedido pedido) {
        throw new RuntimeException("Entrega já foi entregue ao cliente");
    }
    
}
