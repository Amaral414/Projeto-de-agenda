import java.util.ArrayList;
import java.time.*;
import java.util.Scanner;
public class usuario {
    ArrayList<anotacao> anotacoes = new ArrayList();
    String dados;
    String nome, email;
    int senha, CPF;
    
    public usuario(int CPF, String nome,String email, int senha) {
    this.CPF = CPF;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    }
    
    public void conteudo(){
        
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    public void setDados(int CPF, String nome,String email, int senha){
        CPF = getCPF();
        nome = getNome();
        email = getEmail();
        senha = getSenha();
    }
    public void setNomeCompleto(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public int getSenha() {
        return senha;
    }
    public int getCPF() {
        return CPF;
    }

    public anotacao criarAnotacao(){
        Scanner input = new Scanner(System.in);
        String nome, nota, data="18/04/2024";
        
        
        System.out.println("\n========== Criar anotacao ==========");
        System.out.print("Nome da Anotação: ");
        nome = input.nextLine();
        System.out.print("Anotação: ");
        nota = input.nextLine();
        
        anotacao anot = new anotacao(nome,data,nota);

        return anot; 
    }

    public void minhasAnotacoes(anotacao anot){
        anotacoes.add(anot);
    }
    public void mostrarAnotacoes(anotacao anot, usuario usr){
        anot.setData("19/04/2024");
        System.out.println("\n---------------------------------------------");
        System.out.printf("\n=============== %s ===============\n",anot.getNome().toUpperCase());
        System.out.println("Criado por: "+usr.getNome());
        System.out.println("Data: "+anot.getData());
        System.out.println("\nNota: ");
        System.out.println(anot.getNota());
       

    }

    
    
 

    
}