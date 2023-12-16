
package classes;
/**
 * A classe Endereco representa um endereço associado a um cliente.
 * Ela estende a classe Cliente, adicionando informações de endereço
 * como rua, número, bairro e CEP.
 */

public class Endereco extends Cliente {

    private String rua;
    private String numero;
    private String bairro;
    private String cep;

    /**
     * Construtor para a classe Endereco.
     *
     * @param rua      A rua do endereço.
     * @param numero   O número da residência ou estabelecimento.
     * @param bairro   O bairro do endereço.
     * @param cep      O CEP do endereço.
     * @param nome     O nome do cliente (herdado de Cliente).
     * @param telefone O telefone do cliente (herdado de Cliente).
     */
    public Endereco(String rua, String numero, String bairro, String cep, String nome, String telefone) {
        super(nome, telefone);
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    /**
     * Sobrescreve o método detalhes da classe Cliente para incluir
     * informações de endereço.
     */
    @Override
    public void detalhes(){
        super.detalhes();
        System.out.println("Rua: "+getRua());
        System.out.println("Número: "+getNumero());
        System.out.println("Bairro: "+getBairro());
        System.out.println("CEP: "+getCep());

    }
}