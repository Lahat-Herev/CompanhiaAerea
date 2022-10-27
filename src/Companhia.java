import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Companhia {
    private String CNPJ;
    private String nome;
    private String telefone;
    private List<Voo> voos;

    public Companhia()
    {
        this.voos = new ArrayList<>();
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoo(Voo voo) {
        voos.add(voo);
    }
}
