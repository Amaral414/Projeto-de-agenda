import java.util.Scanner;
import java.util.ArrayList;

public class main{
    

    // ================= MAIN ================= 
    public static void main(String args[]){
        usuario usr1 = new usuario(456, "Dick Vigarista", "dick.vigarista@gmail.com", 123);
        usuario usr2 = new usuario(987, "Mutley", "mutley@gmail.com", 123);    
        Scanner input = new Scanner(System.in);
        ArrayList<usuario> usuarios = new ArrayList();
        usuarios.add(usr1);
        usuarios.add(usr2);
        boolean condicaoGeral = true, condicaoLogado = true, condicaoTeste = true;
        int cpf, senhaUsuario, cont=0;
        usuario usr;
        boolean resp;
        
        do {
            
            int escolha = opcoesEntrada();
            switch (escolha){


                case 1: //  ENTRAR:            

                    if (condicaoTeste != usuarios.isEmpty()) { // Verifica se o Array está vazio...(OK)                        

                        System.out.println("\nESCOLHA O PERFIL:");// Lista de usuários...(OK)
                        for (usuario i: usuarios) {
                            System.out.println(cont+" - "+i.getNome().toUpperCase());
                            cont = 1+cont;
                        }
                        cont=0;
                        int perfil = input.nextInt();
                        usr = usuarios.get(perfil);
                        

                        resp = login(usr);// Faz o login e retorna True

                        if (resp) {// Quando retornar true, cai na condição para outras funcionalidades
                            
                          
                            condicaoLogado = true;
                        }

                        

                    }else{ // Se o Array estiver vazio...(OK)
                        System.out.println("Não há cadastros registrados!");
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
    
            System.out.println("\nBEM VINDO");
            System.out.print("1 - Entrar\n2 - Cadastrar\n3 - Sair\nR: ");
            escolha = input.nextInt();
            
            return escolha;
        }
    
        public static int opcoesLogado() {
            Scanner input = new Scanner(System.in);
            int escolha;
    
            System.out.println("\nAções");
            System.out.println("1 - Criar conteúdo");
            System.out.println("2 - Visualizar conteúdo");
            System.out.println("3 - Dados Pessoais");
            System.out.println("4 - Sair");
            System.out.print("R: ");
    
            escolha = input.nextInt();
    
            return escolha;
            
        }
    
        public static void dados(usuario usr){ 
            System.out.println("\nSEUS DADOS:");
            System.out.printf("Nome: %s\n", usr.getNome());
            System.out.printf("Email: %s\n", usr.getEmail());
            System.out.printf("CPF: %d\n", usr.getCPF());

            
    
        }
    
        public static boolean login(usuario usr){
            Scanner input = new Scanner(System.in);
            int cpf, senhaUsuario, cont=0;
            boolean resp = false, condicao = true;

            do { // Repetição do Login...(OK)
                        
                System.out.println("DIGITE SEU CPF E SENHA..."); // Faz o Login...(OK)
                System.out.print("CPF: ");
                cpf = input.nextInt();
                System.out.print("Senha: ");
                senhaUsuario = input.nextInt();
                

                if (usr.getCPF() == cpf && usr.getSenha() == senhaUsuario) { // Se CPF for igual entra
                    System.out.println("Entrou!!!\n");
                    resp=true;condicao=false; // Recebe False e acaba o programa (tirar depois)
                    
                }else{System.out.println("Senha ou CPF Incorreto!!\n");}
            
            } while (condicao);
            
            return resp;
        }
    
        public static usuario cadastrar(){
            Scanner input = new Scanner(System.in);
            String email, nome;
            int CPF, senha;
    
            System.out.print("\nNome: ");
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