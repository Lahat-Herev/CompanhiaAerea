public class Passageiro {

    private String cpf;
    private String nome;
    private String passaporte;
    private String telefone;

    public Passageiro(String cpf, String nome, String passaporte, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.passaporte = passaporte;
        this.telefone = telefone;
    }

    public String getCpf() { return cpf;}

    public void setCpf(String cpf) { this.cpf = cpf;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
