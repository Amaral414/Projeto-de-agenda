public class usuario {
    String nomeCompleto;
    String nome;
    String nomeDeUsuario;
    int senha;
    int CPF;
    
    public usuario(int CPF, String nomeCompleto,String nomeDeUsuario, int senha) {
    this.nomeCompleto = nomeCompleto;
    this.nomeDeUsuario = nomeDeUsuario;
    this.senha = senha;
    }
    
    public void conteudo(){
        
    }

    public void setCPF(int CPF) {
        CPF = CPF;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }
    public int getSenha() {
        return senha;
    }
    public int getCPF() {
        return CPF;
    }

    
    

    
}