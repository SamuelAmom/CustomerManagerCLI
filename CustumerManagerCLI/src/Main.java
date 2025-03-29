import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Adicionar Cliente.");
            System.out.println("2 - Lista de Cliente");
            System.out.println("3 - Sair");
            System.out.println("3 - Escolha uma opção!");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = scanner.nextLine();
                    customerManager.adicionarCliente(nome, email, telefone);
                    break;
                case 2:
                    customerManager.listaDeClientes();
                    break;
                case 3:
                    System.out.println("Programa encerrado!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}