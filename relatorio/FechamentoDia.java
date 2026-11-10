package relatorio;

import controle.ConsultaDePedidos;

public class FechamentoDoDia {
    private ConsultaDePedidos consulta;
    private GeradorRelatorio gerador;
    private SaidaRelatorio saida;

    public FechamentoDoDia(ConsultaDePedidos consulta, GeradorRelatorio gerador, SaidaRelatorio saida) {
        this.consulta = consulta;
        this.gerador = gerador;
        this.saida = saida;
    }

    public void fechar() {
        RelatorioDiario relatorio = gerador.gerar(consulta);
        saida.emitir(relatorio);
    }
}
