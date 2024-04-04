import java.util.Scanner;


public class main{

    //================= METODOS =================
    public static int opcoesEntrada() {
        Scanner input = new Scanner(System.in);
        int escolha;

        System.out.println("\nBEM VINDO");
        System.out.print("1 - Entrar\n2 - Cadastrar\nR: ");
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
        String nomeCompleto;
        String nomeDeUsuario;
        int CPF;

        System.out.println("Nome Completo: ");
        nomeCompleto = input.nextLine();
        System.out.println("Nome de usuário: ");
        nomeDeUsuario = input.nextLine();
        System.out.println("CPF: ");
        CPF = input.nextInt();
        
        //criar uma lista com os dados do usuario

        return null;
    }










    // ================= MAIN ================= 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
      
        usuario  Usr1 = new usuario(045, "Gabriel da Silva Amaral", "Gabikiller", 155);
        usuario  Usr2 = new usuario(046,"João Bernardes JR", "JBjunior", 123);
        usuario  Usr3 = new usuario(047,"Maria Claudia Affonso", "MClaudinha", 321);


        int escolhe = opcoesEntrada();
        switch (escolhe) {
            case 1:         
      
            //  ENTRAR:
                int usuarioLogado = login(Usr1, Usr2, Usr3);
                if (usuarioLogado != 0) {
                    
                    int condition = 0;
                    do {
                        
                            
                        
                        System.out.println("\nBEM VINDO, É UMA HONRA RECEBE-LO NOVAMENTE!!\n");
                        int opcoesLogado = opcoesLogado();
                        switch (opcoesLogado) {

                            case 1:

                                
                                break;
                            
                            case 2:
                                if (usuarioLogado == 1) {
                                    dados(Usr1.getNomeCompleto(), Usr1.getNomeDeUsuario(), Usr1.getSenha());
                                }
                                if (usuarioLogado == 2) {
                                    dados(Usr2.getNomeCompleto(), Usr2.getNomeDeUsuario(), Usr2.getSenha());
                                }
                                if (usuarioLogado == 3) {
                                    dados(Usr3.getNomeCompleto(), Usr3.getNomeDeUsuario(), Usr3.getSenha());
                                }
                                
                                
                                break;

                            case 3:
                                condition = 1;
                                break;
                        }
                    } while (condition == 0);

                }

            case 2:     
      
            //  CADASTRAR:


                break;





            default:

                break;
        
        }
        




    }
}