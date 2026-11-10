package controle;

import dominio.Pedido;
import java.util.ArrayList;
import java.util.List;

public class ControleDePedidos implements RegistroDePedidos, ConsultaDePedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionar(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listar() {
        return pedidos;
    }
}
