import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> clientes = new ArrayList<>();
    private int contadorId = 1;

    public void adicionarCliente(String nome, String email, String telefone){
        Customer novoCliente = new Customer(contadorId++, nome, email, telefone);
        clientes.add(novoCliente);
        System.out.println("Cliente adicionado com sucesso!");
    }
    public void listaDeClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
            return;
        }
            System.out.println("Lista de clientes: ");
            for(Customer c : clientes){
                System.out.println(c);
            }
    }
}
