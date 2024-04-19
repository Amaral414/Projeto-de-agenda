import java.util.Scanner;
public class anotacao {
    String nome;
    String data;// Usar formato de data
    String nota;
    
    public anotacao(String nome, String data, String nota) {
        this.nome = nome;
        this.data = data;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    


    
    
}
