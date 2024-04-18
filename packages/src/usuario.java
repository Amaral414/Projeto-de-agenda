public class usuario {
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
    
 

    
}