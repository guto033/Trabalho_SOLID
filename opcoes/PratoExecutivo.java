package opcoes;

public class PratoExecutivo extends Prato{
    public PratoExecutivo(String nome, double precoBase, int tempoPreparoMinutos) {
        super(nome, precoBase, tempoPreparoMinutos);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}