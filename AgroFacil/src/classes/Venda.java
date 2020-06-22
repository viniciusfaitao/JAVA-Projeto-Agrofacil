package classes;

public class Venda extends Produto{
    private int quantidade;

    public Venda(int quantidade, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public void detalhes(){
        
        System.out.println("nome " + getNome());
        System.out.println("Valor " + getValor());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Total: " + getValor() * getQuantidade());
    }

}
