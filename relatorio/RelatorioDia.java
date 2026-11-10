package relatorio;
import opcoes.Pedido;
import java.util.List;

public class RelatorioDiario {
    private List<Pedido> pedidos;
    private double faturamentoTotal;
    private Pedido pedidoMaisCaro;

    public RelatorioDiario(List<Pedido> pedidos, double faturamentoTotal, Pedido pedidoMaisCaro) {
        this.pedidos = pedidos;
        this.faturamentoTotal = faturamentoTotal;
        this.pedidoMaisCaro = pedidoMaisCaro;
    }

    public List<Pedido> getPedidos() { return pedidos; }
    public double getFaturamentoTotal() { return faturamentoTotal; }
    public Pedido getPedidoMaisCaro() { return pedidoMaisCaro; }
}
