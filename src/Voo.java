import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voo {
    private String codigo;
    private Date data;
    private List<Passageiro> passageiros;

    public Voo()
    {
        this.passageiros = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }
}
