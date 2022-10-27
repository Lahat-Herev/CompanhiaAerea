import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    BufferedReader reader;
    private List<Companhia>  companhias;

    public List<Companhia> getCompanhias() {
        return companhias;
    }

    public void setCompanhia(Companhia companhia) {
        companhias.add(companhia);
    }

    public Main()
    {
        this.companhias = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception{
        Main main = new Main();
        reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        Companhia companhia = new Companhia();
        System.out.println("---------------------------");
        System.out.println("*Cadastrar companhia*");
        System.out.println("Informe o CNPJ da empresa: ");
        companhia.setCNPJ(main.reader.readLine());

        System.out.println("Informe o nome da empresa: ");
        companhia.setNome(main.reader.readLine());

        System.out.println("Informe o telefone da empresa: ");
        companhia.setTelefone(main.reader.readLine());

        main.setCompanhia(companhia);

        main.menu(companhia, reader);
    }

    public void menu(Companhia companhia, BufferedReader reader) throws Exception
    {
        String opcao = "";
        while (!opcao.equals("3"))
        {
            System.out.println("---------------------------");
            System.out.println("[1] Cadastrar novo voo: ");
            System.out.println("[2] Listar voos existentes: ");
            System.out.println("[3] Consultar determinado voo: ");

            opcao = this.reader.readLine();
            switch (opcao)
            {
                case "1":
                    this.cadastrarVoo(companhia, reader);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
                }
        }
    }

    public void cadastrarVoo(Companhia companhia, BufferedReader reader) throws Exception
    {
        System.out.println("---------------------------");
        System.out.println("Digite a data do voo");
        Voo voo = new Voo();
        voo.setData(reader.readLine());
        voo.setCodigo(reader.readLine());
        companhia.setVoo(voo);
        cadastrarPassageiro(voo);
    }

    public void cadastrarPassageiro(Voo voo) throws Exception
    {
        System.out.println("---------------------------");
        System.out.println("Cadastro de passageiro: ");
        System.out.println("Informe o nome: ");
        Passageiro passageiro = new Passageiro();
    }
    /*
        TODO: 
            Cadastrar passageiro: Quem o faz? 
                Primeiro: o sistema cadastra uma companhia
                Segundo: essa companhia cadastra um voo
                Terceiro: esse voo cadastra seu(s) passageiro(s)
            Separar o menu em 3: menuCompanhia, menuVoo, menuPassageiro
                Criar um metodo menuPrincipal contendo os tres
    */
}