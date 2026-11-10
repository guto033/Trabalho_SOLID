package excecao;

public class PrecoBaseInvalido extends RuntimeException {
    public PrecoBaseInvalido() {
        super("Preço negativo não é permitido");
    }
}