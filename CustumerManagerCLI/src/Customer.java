public class Customer {
    private int id ;
    private String nome;
    private String email;
    private String telefone;

    public Customer (int id, String nome, String email, String telefone){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    //Construction of Getters and Setters
    public int getId(){return id;}
    public String getNome(){return nome;}
    public String getEmail(){return email;}
    public String getTelefone(){return telefone;}

    @Override
    public String toString(){
        return id + " - " + nome + " - " + email + " - " + telefone;
    }
}
