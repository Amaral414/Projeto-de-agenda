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




                
                case 1: //  ENTRAR:
                    boolean condicaoGeral2 = true;
                    boolean condicaoTeste = true;
                    usuario usr;


                    //Quando estiver sem cadastro, não pode aparecer esse...
                    System.out.println("ESCOLHA O PERFIL:");
                    for (usuario i: usuarios) {
                        System.out.println(usuarios.size()+"-"+i.getNomeCompleto());// Colocar o número antes do nome...
                    }
                    int perfil = input.nextInt();
                    //perfil = perfil-1;
                    usr = usuarios.get(perfil);



                    do { // Repetição do Login...(OK)
                        if (condicaoTeste != usuarios.isEmpty()) { // Verifica se o Array está vazio...(OK)
                            int cpf, senhaUsuario;
                            

                            System.out.println("DIGITE SEU CPF E SENHA..."); // Faz o Login...(OK)
                            System.out.print("CPF: ");
                            cpf = input.nextInt();
                            System.out.print("Senha: ");
                            senhaUsuario = input.nextInt();
                            

                            if (usr.getCPF() == cpf && usr.getSenha() == senhaUsuario) { // Se CPF for igual entra
                                System.out.println("Entrou!!!\n");
                                condicaoGeral=false;condicaoGeral2=false; // Recebe False e acaba o programa (tirar depois)
                                
                            }else{System.out.println("Senha ou CPF Incorreto!!\n");}
                        
                        
                        }else{ // Se o Array estiver vazio...(OK)
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
    
        public static boolean login(ArrayList listaDeUsuario,int CPF){
            

            
            return false;
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

//for (usuario i: usuarios) {
//    System.out.println(usuarios.get(i.getCPF()));
//}


//boolean condicao = login(usuarios.get(0));// Verifica se possui CPF e Senha no Array.

//ERRO: Ele vai retornar False porque eu estou pedindo o cpf e a senha, mas o array esta guardando objetos
//      Primeiro eu tenho que tentar acessar os objetos, e depois pegar o CPF e a Senha.