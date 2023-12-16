/**
 * Classe Adubo que estende ProdutoComPeso.
 * Esta classe representa um tipo específico de produto, o Adubo, com características adicionais como tipo e se é orgânico.
 */
package classes;

public class Adubo extends ProdutoComPeso {

    private String tipo;
    private boolean organico;
    /**
     * Construtor para criar uma instância de Adubo.
     *
     * @param tipo      O tipo do adubo (String).
     * @param nome      O nome do adubo (String).
     * @param peso      O peso do adubo (String).
     * @param valor     O valor do adubo (float).
     * @param qEstoque  A quantidade de adubo em estoque (int).
     * @param organico  Indica se o adubo é orgânico (boolean).
     */

    public Adubo(String tipo, String nome, String peso, float valor, int qEstoque, boolean organico) {
        super(nome, peso, valor, qEstoque);
        this.tipo = tipo;
        this.organico = organico;
    }
    /**
     * Método para obter o tipo do adubo.
     *
     * @return O tipo do adubo.
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * Método para definir o tipo do adubo.
     *
     * @param tipo O tipo do adubo.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Método para verificar se o adubo é orgânico.
     *
     * @return Verdadeiro se o adubo é orgânico, falso caso contrário.
     */
    public boolean isOrganico() {
        return organico;
    }
    /**
     * Método para definir se o adubo é orgânico.
     *
     * @param organico Verdadeiro para definir o adubo como orgânico, falso caso contrário.
     */
    public void setOrganico(boolean organico) {
        this.organico = organico;
    }
    /**
     * Método para exibir detalhes sobre o adubo.
     * Inclui o tipo, se é orgânico, e invoca o método detalhes da superclasse ProdutoComPeso.
     */
    public void detalhes() {
        System.out.println("Tipo de Adubo: " + getTipo());
        System.out.println("Orgânico: " + (isOrganico() ? "Sim" : "Não"));
        super.detalhes();
    }
}
