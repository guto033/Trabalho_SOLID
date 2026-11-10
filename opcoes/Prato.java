package opcoes;
import PrecoBaseInvalido;

public abstract class Prato implements Precificavel {
    private String nome;
    private double precoBase;
    private int tempoPreparo;

    public Prato(String nome, double precoBase, int tempoPreparo) {
        if (precoBase < 0) {
            throw new PrecoBaseInvalidoException(precoBase);
        }
        this.nome = nome;
        this.precoBase = precoBase;
        this.tempoPreparo = tempoPreparo;
    }

    public String getNome() { return nome; }
    public double getPrecoBase() { return precoBase; }
    public int getTempoPreparo() { return tempoPreparo; }
}

