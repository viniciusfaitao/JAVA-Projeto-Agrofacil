package classes;

public class RacaoCachorro extends Produto {
    
    private String porte;

    public RacaoCachorro(String porte, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    @Override
    public void detalhes(){
        System.out.println("Porte: " + getPorte());
        super.detalhes();
    }
    
}
