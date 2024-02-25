package cidadania;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Cidadao cidadao = null; 

        while (opcao != 3) {
            System.out.println("\nMENU DO SISTEMA:\n");
            System.out.println("1. Cadastrar");
            System.out.println("2. Atualizar Dados");
            System.out.println("3. Sair");
            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nPor favor, insira as seguintes informacoes: ");
                    
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Sexo: ");
                    String sexo = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    cidadao = new Cidadao(nome, sexo, idade, cpf);

                    System.out.println("\nDados cadastrados:");
                    cidadao.informacoes();
                    break; 

                case 2:
                    if (cidadao != null) {
                        System.out.println("\nPor favor, insira as novas informacoes: ");
                        
                        System.out.print("Nome: ");
                        cidadao.nome = scanner.nextLine();

                        System.out.print("Sexo: ");
                        cidadao.sexo = scanner.nextLine();

                        System.out.print("Idade: ");
                        cidadao.idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("CPF: ");
                        cidadao.setCpf(scanner.nextLine());

                        System.out.println("\nDados atualizados:");
                        cidadao.informacoes();
                    } else {
                        System.out.println("\nNenhum cidadao cadastrado ainda.");
                    }
                    break;

                case 3:
                    System.out.println("\nSaindo do sistema...");
                    break;

                default:
                    System.out.println("\nOpcao invalida, tente novamente.");
            }
        }
        scanner.close();
    }
}
