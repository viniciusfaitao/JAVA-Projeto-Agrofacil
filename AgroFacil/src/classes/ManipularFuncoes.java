package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ManipularFuncoes{
    Scanner leitura = new Scanner(System.in);
    ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Venda> vendas = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList();

    
    public void cadastrarCliente(){
        System.out.println("Nome:");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Telefone:");
        String telefone = leitura.nextLine();
        System.out.println("Rua:");
        String rua = leitura.nextLine();
        System.out.println("Número:");
        String numero = leitura.nextLine();
        System.out.println("Bairro:");
        String bairro = leitura.nextLine();
        System.out.println("Cep:");
        String cep = leitura.nextLine();
        System.out.println("Cidade:");
        String cidade = leitura.nextLine();
        System.out.println("Estado:");
        String estado = leitura.nextLine();
        
        Cliente cli = new Endereco(rua, numero, bairro, cep, cidade, estado, nome, telefone);
        clientes.add(cli);
    }
    
    public void excluirCliente(){
        boolean encontrou = false;
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!!");
        }else{
            System.out.println("Informe o nome do cliente que deseja excluir:");
            leitura.nextLine();
            String nome=leitura.nextLine();
                for (Cliente c1: clientes){
                    if (nome.equals(c1.getNome())){
                        encontrou = true;
                        clientes.remove(c1);
                        System.out.println("Cliente removido com sucesso!");
                        break;
                    }
                }
            if(!encontrou){
                System.out.println("Cliente não encontrado!");
            }
        }
    }
    
    public void listarClientes(){
         if(clientes.isEmpty()){
            System.out.println(" ");
            System.out.println("Nenhum cliente cadastrado!!");
        }else{
            System.out.println(" ");
            System.out.println("Listando clientes");
                for(Cliente cl: clientes){
                    System.out.println("--------------------------------");
                    cl.detalhes();
                }
        }
    }
    
    public void ListarClientePorNome(){
        boolean encontrou = false;
        System.out.println("Nome do cliente: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        
            for(Cliente cl: clientes){
                if(nome.equals(cl.getNome())){
                    System.out.println(" ");
                    encontrou = true;
                    cl.detalhes();
                    break;
                }
            }
            if(!encontrou){
                System.out.println(" ");
                System.out.println("Cliente não encontrado!!");
            }
    }
    
    public void cadastrarCachorro(){
        System.out.println("Cadastrando Ração de Cachorro");
        System.out.println("Nome: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Peso: ");
        String peso = leitura.nextLine();
        System.out.println("Porte: ");
        String porte = leitura.nextLine();
        System.out.println("Quantidade estoque: ");
        int qEstoque = leitura.nextInt();
        System.out.println("Valor: ");
        float valor = leitura.nextFloat();
                       
        RacaoCachorro racaoCachorro = new RacaoCachorro(porte, nome, peso, valor, qEstoque);
        produtos.add(racaoCachorro);
        System.out.println("Ração cadastrada com sucesso!");
    }
    
    public void cadastrarGato(){
        System.out.println("Cadastrando ração de Gato");
        System.out.println("Nome: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Peso: ");
        String peso = leitura.nextLine();
        System.out.println("Tipo (Comum ou Castrado): ");
        String tipo = leitura.nextLine();
        System.out.println("Quantidade estoque: ");
        int qEstoque = leitura.nextInt();
        System.out.println("Valor: ");
        float valor = leitura.nextFloat();
                                
        RacaoGato racaoGato = new RacaoGato(tipo, nome, peso, valor, qEstoque);
        produtos.add(racaoGato);
        System.out.println("Ração cadastrada com sucesso!");
    
    }
    
    public void listarCachorro(){
        if(produtos.isEmpty()){
            System.out.println(" ");
            System.out.println("Nenhuma produto cadastrado!!");
        }else{
            System.out.println(" ");
            System.out.println("Listando rações de cachorro");
                for(Produto racao: produtos){
                    if(racao instanceof RacaoCachorro){
                        System.out.println("--------------------------------");
                        racao.detalhes();
                    }
                }
        }
    }
     
    public void listarGato(){
        if(produtos.isEmpty()){
            System.out.println(" ");
            System.out.println("Nenhuma produto cadastrado!!");
        }else{
            System.out.println(" ");
            System.out.println("Listando rações de Gato");
                for(Produto racao: produtos){
                    if(racao instanceof RacaoGato){
                        System.out.println("--------------------------------");
                        racao.detalhes();
                    }
                }
        }
    }
    
    public void excluirProduto(){
        boolean encontrou = false;
        System.out.println("Nome do produto: ");
        leitura.nextLine();
        String nome = leitura.nextLine();

        for(Produto racao: produtos){
            if(nome.equals(racao.getNome())){
                System.out.println(" ");
                encontrou = true;
                produtos.remove(racao);
                System.out.println("Produto Excluido!!");
                break;
            }
        }
        if(!encontrou){
            System.out.println(" ");
            System.out.println("Produto não encontrado!!");
        }
    }
    
    public void realizarVenda(){
        boolean encontrou = false;
        System.out.println("Nome do produto: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        
            for(Produto racao: produtos){
                if(nome.equals(racao.getNome())){
                    System.out.println(" ");
                    encontrou = true;
                    System.out.println("Digite a quantidade de venda: ");
                    int quantidade = leitura.nextInt();
                        if(racao.getqEstoque() < quantidade){
                            System.out.println("Estoque insuficiente");
                        }else{
                            racao.setqEstoque(racao.getqEstoque() - quantidade);
                            Venda venda = new Venda(quantidade, nome, racao.getPeso(), racao.getValor(), racao.getqEstoque());
                            vendas.add(venda);
                            System.out.println("Venda realizada com sucesso!!");
                        }
                    break;
                }
            }
            if(!encontrou){
                System.out.println(" ");
                System.out.println("Produto não encontrado!!");
            }
    }
    
    public void relatorioVendas(){
        for(Venda venda: vendas){
            System.out.println("--------------------------------");
            venda.detalhes();
        }
    }
    
    public void detalhesExtra(){
        System.out.println("Desenvolvedores\nVinicius Faitão\nMaiara Àvila\nCristian da Silva");
        System.out.println(" ");
        System.out.println("Professor\nFlavio Treib");
        System.out.println("APS - POO");
    }
    

    
    
    
}
