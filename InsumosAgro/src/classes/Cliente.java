package classes;

/**
 * Classe Cliente para representar um cliente.
 * Esta classe armazena informações sobre um cliente, incluindo seu código, nome, telefone e endereço.
 */
public class Cliente {
    private static int aux = 0;  // Auxiliar estático para gerar códigos únicos para cada cliente
    private int cod = 0;         // Código do cliente
    private String nome;         // Nome do cliente
    private String telefone;     // Telefone do cliente
    private Endereco endereco;   // Endereço do cliente

    /**
     * Construtor para criar uma instância de Cliente.
     *
     * @param nome      O nome do cliente (String).
     * @param telefone  O telefone do cliente (String).
     */
    public Cliente(String nome, String telefone) {
        this.cod = gerarCodigo();
        this.nome = nome;
        this.telefone = telefone;
    }

    /**
     * Método estático para obter o valor atual do auxiliar de código.
     *
     * @return O valor atual do auxiliar de código.
     */
    public static int getAux() {
        return aux;
    }

    /**
     * Método estático para definir o valor do auxiliar de código.
     *
     * @param aux O novo valor do auxiliar de código.
     */
    public static void setAux(int aux) {
        Cliente.aux = aux;
    }

    /**
     * Método para obter o código do cliente.
     *
     * @return O código do cliente.
     */
    public int getCod() {
        return cod;
    }

    /**
     * Método para definir o código do cliente.
     *
     * @param cod O novo código do cliente.
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * Método para obter o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do cliente.
     *
     * @param nome O novo nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o telefone do cliente.
     *
     * @return O telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método para definir o telefone do cliente.
     *
     * @param telefone O novo telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método para obter o endereço do cliente.
     *
     * @return O endereço do cliente.
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Método para definir o endereço do cliente.
     *
     * @param endereco O novo endereço do cliente.
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Método para exibir detalhes do cliente.
     * Imprime o código, nome e telefone do cliente.
     */
    public void detalhes() {
        System.out.println("Código: " + getCod());
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
    }

    /**
     * Método estático privado para gerar um código único para cada cliente.
     * Incrementa o auxiliar de código e retorna o novo valor.
     *
     * @return O código gerado para um novo cliente.
     */
    private static int gerarCodigo() {
        return ++aux;
    }
}
