package classes;

public class Soja extends ProdutoComPeso {

    private String tipo;

    public Soja (String tipo, String nome, String peso, float valor, int qEstoque) {
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
        System.out.println("Tipo (Farelo ou Casca): " + getTipo());
        super.detalhes();
    }
}
