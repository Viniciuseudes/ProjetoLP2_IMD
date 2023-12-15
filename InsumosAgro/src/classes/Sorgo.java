package classes;

public class Sorgo extends ProdutoComPeso {

    private String tipo;

    public Sorgo (String tipo, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void detalhes(){
        System.out.println("Tipo (Semente ou Ração): " + getTipo());
        super.detalhes();
    }
}
