package classes;

public class RacaoGato extends Produto {
    
    private String tipo;

    public RacaoGato(String tipo, String nome, String peso, float valor, int qEstoque) {
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
        System.out.println("Tipo (Comum ou Castrado): " + getTipo());
        super.detalhes();
    }    
}
