package classes;

public class Glifosato extends ProdutoSemPeso {

    private String tipo;

    public Glifosato(String tipo, String nome, String peso, float valor, int qEstoque) {
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
        System.out.println("Tipo (soluvel ou insoluvel): " + getTipo());
        super.detalhes();
    }
}
