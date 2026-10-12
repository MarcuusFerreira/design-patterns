package state;

public interface EstadoPedido {

    void preparar(Pedido pedido);
    void iniciarEntrega(Pedido pedido);
    void finalizarentrega(Pedido pedido);

}
