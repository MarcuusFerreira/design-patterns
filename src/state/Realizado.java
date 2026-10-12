package state;

public class Realizado implements EstadoPedido {

    @Override
    public void preparar(Pedido pedido) {
        pedido.setEstado(new Preparando());
    }

    @Override
    public void iniciarEntrega(Pedido pedido) {
        throw new RuntimeException("Pedido ainda não foi preparado!");
    }

    @Override
    public void finalizarentrega(Pedido pedido) {
        throw new RuntimeException("Pedido ainda não foi preparado!");
    }

}
