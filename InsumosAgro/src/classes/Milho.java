package classes;
/**
 * A classe Milho representa um produto do tipo milho. Esta classe estende
 * ProdutoComPeso, adicionando informações específicas sobre o milho, como
 * o seu tipo (transgênico ou híbrido).
 */
public class Milho extends ProdutoComPeso {

    private String tipo;
    /**
     * Construtor para a classe Milho.
     *
     * @param tipo     O tipo do milho (por exemplo, transgênico ou híbrido).
     * @param nome     O nome do produto milho.
     * @param peso     O peso do milho.
     * @param valor    O valor do milho.
     * @param qEstoque A quantidade do milho em estoque.
     */
    public Milho(String tipo, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Sobrescreve o método detalhes da classe ProdutoComPeso para incluir
     * informações específicas sobre o milho, como seu tipo.
     */
    @Override
    public void detalhes(){
        System.out.println("Tipo (Trangenico ou Hibrido): " + getTipo());
        super.detalhes();
    }
}
