package state;

public class EntregaIniciada implements EstadoPedido{
    @Override
    public void preparar(Pedido pedido) {
        throw new RuntimeException("Pedido já foi preparado");
    }

    @Override
    public void iniciarEntrega(Pedido pedido) {
        throw new RuntimeException("Pedido já saiu para o cliente");
    }

    @Override
    public void finalizarentrega(Pedido pedido) {
        pedido.setEstado(new EntregaFinalizada());
    }
}
