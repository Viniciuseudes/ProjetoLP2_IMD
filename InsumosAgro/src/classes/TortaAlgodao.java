package classes;
/**
 * A classe TortaAlgodao representa um tipo específico de produto com peso,
 * especificamente a torta de algodão, com um atributo adicional para o tipo (moída ou não moída).
 * Esta classe estende a classe ProdutoComPeso.
 */
public class TortaAlgodao extends ProdutoComPeso {

    private String tipo;
    /**
     * Construtor para a classe TortaAlgodao.
     *
     * @param tipo     O tipo da torta de algodão (moída ou não moída).
     * @param nome     O nome do produto.
     * @param peso     O peso do produto.
     * @param valor    O valor do produto.
     * @param qEstoque A quantidade do produto em estoque.
     */
    public TortaAlgodao (String tipo, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.tipo = tipo;
    }
    /**
     * Retorna o tipo da torta de algodão.
     *
     * @return O tipo da torta de algodão (moída ou não moída).
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Define o tipo da torta de algodão.
     *
     * @param tipo O tipo da torta de algodão a ser definido (moída ou não moída).
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Implementação do método detalhes, conforme definido na classe ProdutoComPeso.
     * Este método exibe detalhes específicos do produto TortaAlgodao, incluindo seu tipo.
     */
    @Override
    public void detalhes(){
        System.out.println("Tipo (Moida ou Não Moida): " + getTipo());
        super.detalhes();
    }
}
