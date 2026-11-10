package opcoes;

public class PratoEspecial extends Prato {
    private double custoIngrediente;

    public PratoEspecial(String nome, double precoBase, int tempoPreparo, double custoIngrediente) {
        super(nome, precoBase, tempoPreparo);
        this.custoIngrediente = custoIngrediente;
    }

    public double calcularPreco() {
        return getPrecoBase() + custoIngrediente;
    }
}
