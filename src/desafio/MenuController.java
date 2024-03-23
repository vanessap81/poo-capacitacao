package desafio;

[16:11, 23/03/2024] Laura De Freitas ♥️🧿: public class MenuController {
    private static final Logger logger = Logger.getLogger(MenuController.class.getName());
    private final DesenvolvedorService desenvolvedorService;
    private final SequenciaService sequenciaService;
    private final Scanner scanner;

    public MenuController() {
        this.desenvolvedorService = new DesenvolvedorService();
        this.sequenciaService = new SequenciaService();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Inserir desenvolvedor");
            System.out.println("2. Registrar número de sequência");
            System.out.println("3. Consultar desenvolvedor");
            System.out.println("4. Consultar número de sequência");
            System.out.println("5. Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inserirDesenvolvedor();
                    break;
                case 2:
                    registrarNumeroSequencia();
                    break;
                case 3:
                    consultarDesenvolvedor();
                    break;
                case 4:
                    consultarNumeroSequencia();
                    break;
                case 5:
                    encerrar();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println("Pressione ENTER para continuar...");
            scanner.nextLine();
        } while (opcao != 5);
    }

    private void inserirDesenvolvedor() {
        logger.info("Opção selecionada: Inserir desenvolvedor");
        desenvolvedorService.inserirDesenvolvedor();
    }

    private void registrarNumeroSequencia() {
        logger.info("Opção selecionada: Registrar número de sequência");
        sequenciaService.registrarNumeroSequencia();
    }

    private void consultarDesenvolvedor() {
        logger.info("Opção selecionada: Consultar desenvolvedor");
        System.out.print("Digite a matrícula do desenvolvedor: ");
        String matricula = scanner.nextLine();
        desenvolvedorService.consultarDesenvolvedor(matricula);
    }

    private void consultarNumeroSequencia() {
        logger.info("Opção selecionada: Consultar número de sequência");
        System.out.print("Digite o número de sequência para consultar: ");
        String numeroSequencia = scanner.nextLine();
        sequenciaService.consultarNumeroSequencia(numeroSequencia);
    }

    private void encerrar() {
        logger.info("Encerrando programa...");
        System.out.println("Encerrando programa...");

        RelatorioService.gerarRelatorio(gerarDadosRelatorio(), "C:\\suportedbdc_resource\\batch\\capacitacao\\capacitacao_POSO");
    }

    private List<String> gerarDadosRelatorio() {
        List<String> dadosRelatorio = new ArrayList<>();

        // Adicionando um cabeçalho ao relatório
        dadosRelatorio.add("RELATÓRIO - CONTROLE DE ATIVIDADES");

        // Adicionando informações de cada sequência ao relatório
        List<Sequencia> sequencias = Mock.criarSequencias();
        for (Sequencia sequencia : sequencias) {
            dadosRelatorio.add("Número de sequência: " + sequencia.getNumeroSequencial());
            dadosRelatorio.add("Data de início: " + sequencia.getDataInicio());
            dadosRelatorio.add("Data final: " + sequencia.getDataFinal());

            // Adicionando informações dos desenvolvedores associados à sequência
            List<Desenvolvedor> desenvolvedores = sequencia.getDesenvolvedores();
            for (Desenvolvedor desenvolvedor : desenvolvedores) {
                dadosRelatorio.add("Desenvolvedor: " + desenvolvedor.getNome() + " - Matrícula: " + desenvolvedor.getMatricula());
            }

            // Adicionando o status de desenvolvimento e o domínio de ambiente
            dadosRelatorio.add("Status de desenvolvimento: " + sequencia.getStatusDesenvolvimento().getDescricao());
            dadosRelatorio.add("Domínio de ambiente: " + sequencia.getDominioAmbiente().getDescricao());

            // Adicionando uma linha em branco para separar as sequências no relatório
            dadosRelatorio.add("");
        }

        return dadosRelatorio;
    }
}