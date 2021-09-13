public class Agenda {
    private String nome;
    private int telefone;
    private String endereco;
    private String email;
    
public void setNome(String nome) {
    this.nome = nome;
}

public String getNome() {
    return this.nome;
}

public void setTelefone (int telefone) {
    this.telefone = telefone;
}

public int getTelefone() {
    return this.telefone;
}

public void setEndereco (String endereco) {
    this.endereco = endereco;
}

public String getEndereco() {
    return this.endereco;
}

public void setEmail (String email) {
    this.email = email;
}

public String getEmail() {
    return this.email;
}

public String toString() {
    return this.nome + "\n" + 
    this.telefone + "\n" +    
    this.endereco + "\n" +
    this.email;
    }

}