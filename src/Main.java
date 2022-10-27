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
        System.out.println("\nInforme o CNPJ da empresa: ");
        companhia.setCNPJ(main.reader.readLine());

        System.out.println("\nInforme o nome da empresa: ");
        companhia.setNome(main.reader.readLine());

        System.out.println("\nInforme o telefone da empresa: ");
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
                    this.menuCompanhia();
                    break;
                case "2":
                    this.menuVoo();
                    break;
                case "3":
                    break;
                default:
                    break;
                }
        }
    }

    public void menuCompanhia(Companhia companhia, BufferedReader reader)
    {
        this.cadastrarVoo(companhia, reader);
    }

    public void menuPassageiro()
    {
        System.out.println("---------------------------");
        System.out.println("O que gostaria de fazer?");
        System.out.println("1 - Cadastrar passageiro");
        System.out.println("2 - Mostrar todos os passageiros");
        System.out.println("3 - Ver dados de passageiro específico");
    }

    public void menuVoo()
    {

    }

    public void cadastrarVoo(Companhia companhia, BufferedReader reader) throws Exception
    {
        System.out.println("---------------------------");
        System.out.println("Digite a data do voo");
        Voo voo = new Voo();
        voo.setData(reader.readLine());
        System.out.println("\nDigite o código do voo");
        voo.setCodigo(reader.readLine());
        companhia.setVoo(voo);
        cadastrarPassageiro(voo, reader);
    }

    public void cadastrarPassageiro(Voo voo, BufferedReader reader) throws Exception
    {
        System.out.println("---------------------------");
        System.out.println("Cadastro de passageiro: ");

        Passageiro passageiro = new Passageiro();
        
        System.out.println("\nInforme o nome: ");
        passageiro.setNome(reader.readLine());

        System.out.println("\nInforme o CPF: ");
        passageiro.setCpf(reader.readLine());

        System.out.println("\nInforme o passaporte: ");
        passageiro.setPassaporte(reader.readLine());
        System.out.println("\nInforme o telefone: ");
        passageiro.setTelefone(reader.readLine());

        voo.setPassageiro(passageiro);
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