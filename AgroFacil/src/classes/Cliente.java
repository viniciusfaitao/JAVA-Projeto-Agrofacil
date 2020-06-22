
package classes;


public class Cliente{
    private static int aux=0;
    private int cod=0;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String telefone) {
        this.cod = gerarCodigo();
        this.nome = nome;
        this.telefone = telefone;
    }

    public static int getAux() {
        return aux;
    }

    public static void setAux(int aux) {
        Cliente.aux = aux;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
    public void detalhes(){
        System.out.println("Código: "+getCod());
        System.out.println("Nome: "+getNome());
        System.out.println("Telefone: "+getTelefone());
    }
    
     private static int gerarCodigo(){
        return ++aux;
     }
}

