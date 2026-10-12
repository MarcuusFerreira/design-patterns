package state;

public class PedidoClient {

    static void main() {
        var pedido = new Pedido();
        System.out.println(pedido);
        pedido.preparar();
        System.out.println(pedido);
        pedido.iniciarEntrega();
        System.out.println(pedido);
        pedido.finalizarEntrega();
        System.out.println(pedido);
        pedido.preparar();
    }

}
