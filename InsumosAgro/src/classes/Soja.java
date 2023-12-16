package classes;
/**
 * A classe Soja representa um tipo específico de produto com peso,
 * especificamente a soja, com um atributo adicional para o tipo (farelo ou casca).
 * Esta classe estende a classe ProdutoComPeso.
 */
public class Soja extends ProdutoComPeso {

    private String tipo;
    /**
     * Construtor para a classe Soja.
     *
     * @param tipo     O tipo da soja (farelo ou casca).
     * @param nome     O nome do produto.
     * @param peso     O peso do produto.
     * @param valor    O valor do produto.
     * @param qEstoque A quantidade do produto em estoque.
     */
    public Soja (String tipo, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.tipo = tipo;
    }
    /**
     * Retorna o tipo da soja.
     *
     * @return O tipo da soja (farelo ou casca).
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Define o tipo da soja.
     *
     * @param tipo O tipo da soja a ser definido (farelo ou casca).
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Implementação do método detalhes, conforme definido na classe ProdutoComPeso.
     * Este método exibe detalhes específicos do produto Soja, incluindo seu tipo.
     */
    @Override
    public void detalhes(){
        System.out.println("Tipo (Farelo ou Casca): " + getTipo());
        super.detalhes();
    }
}
