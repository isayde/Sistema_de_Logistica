import java.time.LocalDate;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // manutenções
        Manutencao manutencao1 = new Manutencao(LocalDate.of(2023, 10, 1), "Troca de óleo", 150.0);
        Manutencao manutencao2 = new Manutencao(LocalDate.of(2023, 9, 15), "Revisão geral", 300.0);
        Manutencao manutencao3 = new Manutencao(LocalDate.of(2023, 8, 20), "Troca de pneus", 200.0);

        // listas de manutenções
        ArrayList<Manutencao> manutencoes1 = new ArrayList<>();
        manutencoes1.add(manutencao1);
        manutencoes1.add(manutencao2);

        ArrayList<Manutencao> manutencoes2 = new ArrayList<>();
        manutencoes2.add(manutencao3);

        // 5 veículos diferentes
        CaminhaoLeve caminhaoLeve = new CaminhaoLeve("ABC-1234", 5000.0, "Diesel", "123456789", "Volvo", 10000, manutencoes1);
        CaminhaoPesado caminhaoPesado = new CaminhaoPesado("XYZ-5678", 15000.0, "Diesel", "987654321", "Scania", 20000, manutencoes2);
        Van van1 = new Van("VAN-001", 2000.0, "Gasolina", "111111111", "Ford", 5000, new ArrayList<>());
        Van van2 = new Van("VAN-002", 2500.0, "Etanol", "222222222", "Fiat", 7000, manutencoes1);
        CaminhaoLeve caminhaoLeve2 = new CaminhaoLeve("DEF-5678", 6000.0, "Diesel", "333333333", "Mercedes", 15000, manutencoes2);

        // cargas
        CargaFragil cargaFragil = new CargaFragil(200.0, 5000.0);
        CargaPerigosa cargaPerigosa = new CargaPerigosa(500.0, 10000.0);
        CargaFragil cargaFragil2 = new CargaFragil(300.0, 7000.0);

        // motoristas
        Motorista motorista1 = new Motorista("João Silva", "123456789", "Experiente", LocalDate.of(2023, 1, 1), new ArrayList<>());
        Motorista motorista2 = new Motorista("Maria Oliveira", "987654321", "Intermediária", LocalDate.of(2023, 2, 15), new ArrayList<>());
        Motorista motorista3 = new Motorista("Carlos Souza", "456789123", "Iniciante", LocalDate.of(2023, 3, 10), new ArrayList<>());

        // rotas
        ArrayList<String> pontosParada1 = new ArrayList<>();
        pontosParada1.add("São Paulo");
        pontosParada1.add("Rio de Janeiro");
        pontosParada1.add("Belo Horizonte");
        Rota rota1 = new Rota(800.0, "Boa", pontosParada1);

        ArrayList<String> pontosParada2 = new ArrayList<>();
        pontosParada2.add("Curitiba");
        pontosParada2.add("Florianópolis");
        pontosParada2.add("Porto Alegre");
        Rota rota2 = new Rota(1200.0, "Ótima", pontosParada2);

        ArrayList<String> pontosParada3 = new ArrayList<>();
        pontosParada3.add("Brasília");
        pontosParada3.add("Goiânia");
        pontosParada3.add("Uberlândia");
        Rota rota3 = new Rota(600.0, "Regular", pontosParada3);

        // 3 viagens diferentes
        Viagem viagem1 = new Viagem("São Paulo", "Belo Horizonte", "2023-10-10", cargaFragil, motorista1, caminhaoLeve, rota1);
        Viagem viagem2 = new Viagem("Curitiba", "Porto Alegre", "2023-10-15", cargaPerigosa, motorista2, caminhaoPesado, rota2);
        Viagem viagem3 = new Viagem("Brasília", "Uberlândia", "2023-10-20", cargaFragil2, motorista3, van1, rota3);

        //  3 clientes
        Cliente cliente1 = new Cliente("Empresa A", "Rua 1, São Paulo", "contato@empresaA.com", new ArrayList<>());
        Cliente cliente2 = new Cliente("Empresa B", "Rua 2, Curitiba", "contato@empresaB.com", new ArrayList<>());
        Cliente cliente3 = new Cliente("Empresa C", "Rua 3, Brasília", "contato@empresaC.com", new ArrayList<>());

        // Associando viagens aos clientes
        cliente1.addViagem(viagem1);
        cliente2.addViagem(viagem2);
        cliente3.addViagem(viagem3);

        // Adicionando notificações de VIAGEM aos clientes
        NotificacaoEmail notificacaoEmailViagem1 = new NotificacaoEmail();
        notificacaoEmailViagem1.setViagem(viagem1);
        cliente1.addNotificacao(notificacaoEmailViagem1);

        NotificacaoSMS notificacaoSMSViagem2 = new NotificacaoSMS();
        notificacaoSMSViagem2.setViagem(viagem2);
        cliente2.addNotificacao(notificacaoSMSViagem2);

        NotificacaoEmail notificacaoEmailViagem3 = new NotificacaoEmail();
        notificacaoEmailViagem3.setViagem(viagem3);
        cliente3.addNotificacao(notificacaoEmailViagem3);


        // Adicionando notificações de MANUTENÇÃO aos motoristas
        NotificacaoSMS notificacaoSMSManutencao1 = new NotificacaoSMS();
        notificacaoSMSManutencao1.setManutencao(manutencao1);
        motorista1.adicionarNotificacao(notificacaoSMSManutencao1);

        NotificacaoEmail notificacaoEmailManutencao2 = new NotificacaoEmail();
        notificacaoEmailManutencao2.setManutencao(manutencao2);
        motorista2.adicionarNotificacao(notificacaoEmailManutencao2);


        NotificacaoEmail notificacaoEmailManutencao3 = new NotificacaoEmail();
        notificacaoEmailManutencao3.setManutencao(manutencao3);
        motorista3.adicionarNotificacao(notificacaoEmailManutencao3);


        // Exibindo informações dos clientes e suas viagens
        System.out.println("----- Informações do Cliente 1 -----");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Contato: " + cliente1.getContato());
        System.out.println("Viagens:");
        for (Viagem viagem : cliente1.getViagens()) {
            viagem.gerarRelatorio();
        }
        System.out.println("------------------------------");
        System.out.println("Notificações de Viagem:");
        for (Notificacao notificacao : cliente1.getNotificacoes()) {
            notificacao.notificacaoViagem();
        }

        System.out.println("\n----- Informações do Motorista 1 -----");
        System.out.println("Nome: " + motorista1.getNome());
        System.out.println("CNH: " + motorista1.getNumeroCNH());
        System.out.println("------------------------------");
        System.out.println("Notificações de Manutenção:");
        for (Notificacao notificacao : motorista1.getNotificacoes()) {
            notificacao.notificacaoManutencao();
        }

        System.out.println("\n----- Informações do Cliente 2 -----");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Endereço: " + cliente2.getEndereco());
        System.out.println("Contato: " + cliente2.getContato());
        System.out.println("Viagens:");
        for (Viagem viagem : cliente2.getViagens()) {
            viagem.gerarRelatorio();
        }
        System.out.println("------------------------------");
        System.out.println("Notificações de Viagem:");
        for (Notificacao notificacao : cliente2.getNotificacoes()) {
            notificacao.notificacaoViagem();
        }

        System.out.println("\n----- Informações do Motorista 2 -----");
        System.out.println("Nome: " + motorista2.getNome());
        System.out.println("CNH: " + motorista2.getNumeroCNH());
        System.out.println("------------------------------");
        System.out.println("Notificações de Manutenção:");
        for (Notificacao notificacao : motorista2.getNotificacoes()) {
            notificacao.notificacaoManutencao();
        }

        System.out.println("\n----- Informações do Cliente 3 -----");
        System.out.println("Nome: " + cliente3.getNome());
        System.out.println("Endereço: " + cliente3.getEndereco());
        System.out.println("Contato: " + cliente3.getContato());
        System.out.println("Viagens:");
        for (Viagem viagem : cliente3.getViagens()) {
            viagem.gerarRelatorio();
        }
        System.out.println("------------------------------");
        System.out.println("Notificações de Viagem:");
        for (Notificacao notificacao : cliente3.getNotificacoes()) {
            notificacao.notificacaoViagem();
        }

        System.out.println("\n----- Informações do Motorista 3 -----");
        System.out.println("Nome: " + motorista3.getNome());
        System.out.println("CNH: " + motorista3.getNumeroCNH());
        System.out.println("Notificações de Manutenção:");
        System.out.println("------------------------------");
        for (Notificacao notificacao : motorista3.getNotificacoes()) {
            notificacao.notificacaoManutencao();
        }
    }
}