import java.util.Scanner;
import java.util.ArrayList;

public class main{
    

    // ================= MAIN ================= 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<usuario> usuarios = new ArrayList();
        boolean condicaoGeral = true;

        do {
            
            

            int escolhe = opcoesEntrada();
            switch (escolhe){
                
                case 1: //  ENTRAR: ( APARECE OS USUARIOS AQUI)
                    boolean condicaoGeral2 = true;
                    do {
                        if (condicaoGeral != usuarios.isEmpty()) { // Verifica se o Array está vazio.
                            int cpf, senhaUsuario;
                            usuario usr;
                
                            System.out.println("==== DIGITE SEU RA E SENHA ===="); // Faz o loggin.
                            System.out.print("CPF: ");
                            cpf = input.nextInt();
                            System.out.print("Senha: ");
                            senhaUsuario = input.nextInt();

                            boolean condicao = login(usuarios.contains(cpf), usuarios.contains(senhaUsuario));// Verifica se possui CPF e Senha no Array.
                            //ERRO: Ele vai retornar False porque eu estou pedindo o cpf e a senha, mas o array esta guardando objetos
                            //      Primeiro eu tenho que tentar acessar os objetos, e depois pegar o CPF e a Senha.

                            if (condicao == true) { // Se retornar TRUE ele entra se não, não.
                                System.out.println("ENTROOOU!!!");
                                
                            }else{System.out.println("Senha Incorreta!!");}
                        
                        
                        }else{ // Se o Array estiver vazio.
                            System.out.println("Não há cadastros registrados!");
                            condicaoGeral2 = false;
                        }
                    } while (condicaoGeral2);
                

                break;
                    

                case 2: //  CADASTRAR:
                    usuarios.add(cadastrar());

                    break;


                case 3: // SAIR:
                    condicaoGeral = false;
                    

            };
        } while (condicaoGeral);




    }
        //================= METODOS =================
        public static int opcoesEntrada() {
            Scanner input = new Scanner(System.in);
            int escolha;
    
            System.out.println("\nBEM VINDO");
            System.out.print("1 - Entrar\n2 - Cadastrar\n3 - Sair\nR: ");
            escolha = input.nextInt();
            
            return escolha;
        }
    
        public static int opcoesLogado() {
            Scanner input = new Scanner(System.in);
            int escolha;
    
            System.out.println("Ações");
            System.out.println("1 - Visualizar conteúdo");
            System.out.println("2 - Dados Pessoais");
            System.out.println("3 - Sair");
            System.out.println("R: ");
    
            escolha = input.nextInt();
    
            return escolha;
            
        }
    
        public static void dados(String nomeC,String nomeU,int cpf){ 
            System.out.println("SEUS DADOS:");
            System.out.printf("Nome completo: %s\n", nomeC);
            System.out.printf("Nome de usuário: %s\n", nomeU);
            System.out.printf("CPF: %d\n", cpf);

            
    
        }
    
        public static boolean login(boolean CPF, boolean senha){
            boolean condition = false;  
            
            if (CPF && senha == true){ // Se tiver a Senha e o CPF no Array, retornará TRUE.

                condition = true;                
            }

            return condition;
        }
    
        public static usuario cadastrar(){
            Scanner input = new Scanner(System.in);
            String nomeDeUsuario, nomeCompleto;
            int CPF, senha;
    
            System.out.print("Nome Completo: ");
            nomeCompleto = input.next();
            System.out.print("Nome de usuário: ");
            nomeDeUsuario = input.next();
            System.out.print("CPF: ");
            CPF = input.nextInt();
            System.out.print("Senha: ");
            senha = input.nextInt();

            usuario usr = new usuario(CPF, nomeCompleto, nomeDeUsuario, senha);

            

            return usr;
        }

  
        
}