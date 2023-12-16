package classes;
/**
 * A classe Sorgo representa um tipo específico de produto com peso,
 * especificamente o sorgo, com um atributo adicional para o tipo (semente ou ração).
 * Esta classe estende a classe ProdutoComPeso.
 */
public class Sorgo extends ProdutoComPeso {

    private String tipo;
    /**
     * Construtor para a classe Sorgo.
     *
     * @param tipo     O tipo do sorgo (semente ou ração).
     * @param nome     O nome do produto.
     * @param peso     O peso do produto.
     * @param valor    O valor do produto.
     * @param qEstoque A quantidade do produto em estoque.
     */
    public Sorgo (String tipo, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.tipo = tipo;
    }
    /**
     * Retorna o tipo do sorgo.
     *
     * @return O tipo do sorgo (semente ou ração).
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Define o tipo do sorgo.
     *
     * @param tipo O tipo do sorgo a ser definido (semente ou ração).
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Implementação do método detalhes, conforme definido na classe ProdutoComPeso.
     * Este método exibe detalhes específicos do produto Sorgo, incluindo seu tipo.
     */
    @Override
    public void detalhes(){
        System.out.println("Tipo (Semente ou Ração): " + getTipo());
        super.detalhes();
    }
}
