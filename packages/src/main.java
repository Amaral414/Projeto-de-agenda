import java.util.Scanner;
import java.util.ArrayList;

public class main{
    

    // ================= MAIN ================= 
    public static void main(String args[]){
        usuario usr1 = new usuario(456, "Dick Vigarista", "dick.vigarista@gmail.com", 123);
        usuario usr2 = new usuario(987, "Mutley", "mutley@gmail.com", 123);    
        usuario usr3 = new usuario(123, "Gabriel", "gabriel.amaral155@hotmail.com", 123);    
        Scanner input = new Scanner(System.in);
        ArrayList<usuario> usuarios = new ArrayList();
        usuarios.add(usr1);
        usuarios.add(usr2);
        usuarios.add(usr3);
        boolean condicaoGeral = true, condicaoLogado = true, condicaoTeste = true;
        int cpf, senhaUsuario, cont=0, cont2=0;
        usuario usr;
        boolean resp;
        anotacao anot;
        
        do {
            
            int escolha = opcoesEntrada();// Opções de entrada
            switch (escolha){


                case 1: //  ENTRAR:            

                    if (condicaoTeste != usuarios.isEmpty()) { // Verifica se o Array está vazio...(OK)                        
                        System.out.println("\n---------------------------------------------");
                        System.out.println("============ ESCOLHA O PERFIL ============");// Lista de usuários...(OK)
                        for (usuario i: usuarios) {
                            System.out.println(cont+" - "+i.getNome().toUpperCase());
                            cont = 1+cont;
                        }
                        cont=0;
                        System.out.print("R:");
                        int perfil = input.nextInt();// Escolhe o usuario pra entrar.
                        usr = usuarios.get(perfil);// usr Recebe o numero do usuario na lista.
                        

                        resp = login(usr);// resp Recebe true para entrar na condição de logado.
                        
                        if (resp) {// Funcionalidades depois de logado.
                            
                            do{

                                escolha = opcoesLogado();// Opções de funcionalidades.

                                switch (escolha) {
                                    case 1:
                                        anotacao anotacaoUsuario = usr.criarAnotacao();
                                        usr.minhasAnotacoes(anotacaoUsuario);

                                        break;

                                    case 2:
                                    if (usr.anotacoes.isEmpty()) {
                                        System.out.println("Não há anotações!!!");
                                    }else{
                                        System.out.println("\n---------------------------------------------");
                                        System.out.println("========== ESCOLHA A NOTA ==========");// Lista de usuários...(OK)
                                        for (anotacao i: usr.anotacoes) {
                                            System.out.println(cont2+" - "+i.getNome().toUpperCase());
                                            cont2 = 1+cont2;
                                        }
                                        cont2 = 0;
                                        System.out.print("R:");
                                        int notaEscolhida = input.nextInt();// Escolhe a nota para mostrar.
                                        anot = usr.anotacoes.get(notaEscolhida);// anot Recebe o numero da nota na lista.
                                        usr.mostrarAnotacoes(anot,usr);
                                        }
                                        break;
                                    
                                    case 3:
                                        dados(usr);
                                        break;
                                        
                                    case 4:
                                        System.out.println("Saindo...");
                                        condicaoLogado = false;
                                        break;
                                        
                                }
                            }while(condicaoLogado);
                            condicaoLogado = true;
                        }

                        

                    }else{ // Se o Array estiver vazio...(OK)
                        System.out.println("\nNão há cadastros registrados!");
                    }
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
    
            System.out.println("\n---------------------------------------------");    
            System.out.println("\n========== BEM VINDO ==========");
            System.out.print("1 - Entrar\n2 - Cadastrar\n3 - Sair\nR: ");
            escolha = input.nextInt();
            
            return escolha;
        }
    
        public static int opcoesLogado() {
            Scanner input = new Scanner(System.in);
            int escolha;

            System.out.println("\n---------------------------------------------");    
            System.out.println("\n=============== Ações ===============");
            System.out.println("1 - Criar conteúdo");
            System.out.println("2 - Visualizar conteúdo");
            System.out.println("3 - Dados Pessoais");
            System.out.println("4 - Sair");
            System.out.print("R: ");
    
            escolha = input.nextInt();
    
            return escolha;
            
        }
    
        public static void dados(usuario usr){ 
            System.out.println("\n---------------------------------------------"); 
            System.out.println("\n=============== SEUS DADOS ===============");
            System.out.printf("Nome: %s\n", usr.getNome());
            System.out.printf("Email: %s\n", usr.getEmail());
            System.out.printf("CPF: %d\n", usr.getCPF());

            
    
        }
    
        public static boolean login(usuario usr){
            Scanner input = new Scanner(System.in);
            int cpf, senhaUsuario, cont=0;
            boolean resp = false, condicao = true;

            do { // Repetição do Login...(OK)
                System.out.println("\n---------------------------------------------");                        
                System.out.println("\n=========== DIGITE SEU CPF E SENHA ==========="); // Faz o Login...(OK)
                System.out.print("CPF: ");
                cpf = input.nextInt();
                System.out.print("Senha: ");
                senhaUsuario = input.nextInt();
                

                if (usr.getCPF() == cpf && usr.getSenha() == senhaUsuario) { // Se CPF for igual entra
                    System.out.println("Entrou!!!\n");
                    resp=true;condicao=false; // Recebe False e acaba o programa (tirar depois)
                    
                }else{System.out.println("\nSenha ou CPF Incorreto!!\n");}
            
            } while (condicao);
            
            return resp;
        }
    
        public static usuario cadastrar(){
            Scanner input = new Scanner(System.in);
            String email, nome;
            int CPF, senha;
            System.out.println("\n---------------------------------------------");
            System.out.print("Nome: ");
            nome = input.next();
            System.out.print("Email: ");
            email = input.next();
            System.out.print("CPF: ");
            CPF = input.nextInt();
            System.out.print("Senha: ");
            senha = input.nextInt();

            usuario usr = new usuario(CPF, nome, email, senha);

            

            return usr;
        }

  
        
}

//for (usuario i: usuarios) {
//    System.out.println(usuarios.get(i.getCPF()));
//}


//boolean condicao = login(usuarios.get(0));// Verifica se possui CPF e Senha no Array.

//ERRO: Ele vai retornar False porque eu estou pedindo o cpf e a senha, mas o array esta guardando objetos
//      Primeiro eu tenho que tentar acessar os objetos, e depois pegar o CPF e a Senha.