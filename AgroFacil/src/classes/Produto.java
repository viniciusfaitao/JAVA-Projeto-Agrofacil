package classes;

public class Produto {
    
    private String nome;
    private String peso;
    private float valor;
    private int qEstoque;

    public Produto(String nome, String peso, float valor, int qEstoque) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
        this.qEstoque = qEstoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public int getqEstoque() {
        return qEstoque;
    }

    public void setqEstoque(int qEstoque) {
        this.qEstoque = qEstoque;
    }
    
    public void detalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Quantidade: " + getqEstoque());
        System.out.println("Valor: R$ " + getValor());
    }
    
}
