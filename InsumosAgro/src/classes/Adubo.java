package classes;

public class Adubo extends ProdutoComPeso {

    private String tipo;
    private boolean organico;

    public Adubo(String tipo, String nome, String peso, float valor, int qEstoque, boolean organico) {
        super(nome, peso, valor, qEstoque);
        this.tipo = tipo;
        this.organico = organico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOrganico() {
        return organico;
    }

    public void setOrganico(boolean organico) {
        this.organico = organico;
    }

    public void detalhes() {
        System.out.println("Tipo de Adubo: " + getTipo());
        System.out.println("Orgânico: " + (isOrganico() ? "Sim" : "Não"));
        super.detalhes();
    }
}
