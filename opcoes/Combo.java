package opcoes;

public class Combo extends Prato {
    public Combo(String nome, double precoBase, int tempoPreparo) {
        super(nome, precoBase, tempoPreparo);
    }

    public double calcularPreco() {
        return getPrecoBase() * 0.85;
    }
}
