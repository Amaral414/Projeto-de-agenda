import java.util.Scanner;


public class main{

    // ================= MAIN ================= 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        boolean condicaoGeral = true;

        do {
            
        
            usuario [][] usuarios = {
                {}
            }; 
            

            int escolhe = opcoesEntrada();
            switch (escolhe) {
                case 1:         
                //  ENTRAR:
                break;
                    

                case 2:     
                //  CADASTRAR:
                    cadastrar();


                    break;

                case 3:
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
    
        public static void dados(String nomeC,String nomeU,int senhaU){
            Scanner input = new Scanner(System.in); 
            System.out.println("SEUS DADOS:");
            System.out.printf("Nome completo: %s\n", nomeC);
            System.out.printf("Nome de usuário: %s\n", nomeU);
            int ok = input.nextInt();
    
        }
    
        public static int login(usuario usuario1, usuario usuario2, usuario usuario3){
            Scanner input = new Scanner(System.in);
            usuario Usr1 = usuario1;
            usuario Usr2= usuario2;
            usuario Usr3 = usuario3;
            
            
            
            int condition1 = 0;
    
            do {
                
                int cpf;
                int senhaUsuario;
    
                System.out.println("==== DIGITE SEU RA E SENHA ====");
                System.out.print("CPF: ");
                cpf = input.nextInt();
                System.out.print("Senha: ");
                senhaUsuario = input.nextInt();
    
                if (cpf == Usr1.getCPF() || senhaUsuario == Usr1.getSenha()){
                    condition1 = condition1+1;
                }
    
                if (cpf == Usr2.getCPF() || senhaUsuario == Usr2.getSenha()){
                    condition1 = condition1+2;
                }
    
                if (cpf == Usr3.getCPF() || senhaUsuario == Usr3.getSenha()){
                    condition1 =condition1+3;
                }
            
            } while (condition1 == 0);
    
            
            return condition1;
        }
    
        public static usuario cadastrar(){
            Scanner input = new Scanner(System.in);
            String nomeDeUsuario, nomeCompleto;
            int CPF, senha;
    
            System.out.print("Nome Completo: ");
            nomeCompleto = input.nextLine();
            System.out.print("Nome de usuário: ");
            nomeDeUsuario = input.nextLine();
            System.out.print("CPF: ");
            CPF = input.nextInt();
            System.out.print("Senha: ");
            senha = input.nextInt();
    
            usuario usr = new usuario(CPF, nomeCompleto, nomeDeUsuario, senha);
            
            // talvez seja fora = usuario[] usuarios = {};
            // criar uma lista com os dados do usuario
    
            return usr;
        }
}