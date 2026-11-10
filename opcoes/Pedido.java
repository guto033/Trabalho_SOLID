package opcoes;
import PedidoSemCliente;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private String data;
    private List<Prato> pratos = new ArrayList<>();

    public Pedido(Cliente cliente, String data) {
        if (cliente == null) {
            throw new PedidoSemClienteException();
        }
        this.cliente = cliente;
        this.data = data;
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.calcularPreco();
        }
        return total;
    }

    public Cliente getCliente() { return cliente; }
    public String getData() { return data; }
    public List<Prato> getPratos() { return pratos; }
}
