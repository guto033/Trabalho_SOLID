package excecao;

public class PedidoSemClienteException extends RuntimeException {
    public PedidoSemClienteException() {
        super("Pedido não pode existir sem cliente");
    }
}