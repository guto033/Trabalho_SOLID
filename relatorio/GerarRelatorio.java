package relatorio;
import controle.ConsultaDePedidos;
import opcoes.Pedido;

public class GeradorRelatorio {

    public RelatorioDiario gerar(ConsultaDePedidos consulta) {
        double faturamento = 0;
        Pedido maisCaro = null;

        for (Pedido pedido : consulta.listar()) {
            faturamento += pedido.calcularTotal();
            if (maisCaro == null || pedido.calcularTotal() > maisCaro.calcularTotal()) {
                maisCaro = pedido;
            }
        }

        return new RelatorioDiario(consulta.listar(), faturamento, maisCaro);
    }
}
