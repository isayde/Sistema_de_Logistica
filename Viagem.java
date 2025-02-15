import java.util.List;
import java.util.Random;

public class Viagem implements Relatorio, Rastreamento {
    private String origem;
    private String destino;
    private String dataSaida;
    private Carga cargaTransportada;
    private Motorista motorista;
    private Veiculo veiculo;
    private Rota rota;

    public Viagem(String origem, String destino, String dataSaida, Carga cargaTransportada, Motorista motorista, Veiculo veiculo, Rota rota) {
        if (origem == null || origem.isEmpty()) {
            throw new IllegalArgumentException("A origem não pode ser nula ou vazia.");
        }
        if (destino == null || destino.isEmpty()) {
            throw new IllegalArgumentException("O destino não pode ser nulo ou vazio.");
        }
        if (dataSaida == null || dataSaida.isEmpty()) {
            throw new IllegalArgumentException("A data de saída não pode ser nula ou vazia.");
        }
        if (cargaTransportada == null) {
            throw new IllegalArgumentException("A carga transportada não pode ser nula.");
        }
        if (motorista == null) {
            throw new IllegalArgumentException("O motorista não pode ser nulo.");
        }
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
        if (rota == null) {
            throw new IllegalArgumentException("A rota não pode ser nula.");
        }
        this.origem = origem;
        this.destino = destino;
        this.dataSaida = dataSaida;
        this.cargaTransportada = cargaTransportada;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.rota = rota;
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        if (origem == null || origem.isEmpty()) {
            throw new IllegalArgumentException("A origem não pode ser nula ou vazia.");
        }
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        if (destino == null || destino.isEmpty()) {
            throw new IllegalArgumentException("O destino não pode ser nulo ou vazio.");
        }
        this.destino = destino;
    }

    public String getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(String dataSaida) {
        if (dataSaida == null || dataSaida.isEmpty()) {
            throw new IllegalArgumentException("A data de saída não pode ser nula ou vazia.");
        }
        this.dataSaida = dataSaida;
    }

    public Carga getCargaTransportada() {
        return cargaTransportada;
    }
    public void setCargaTransportada(Carga cargaTransportada) {
        if (cargaTransportada == null) {
            throw new IllegalArgumentException("A carga transportada não pode ser nula.");
        }
        this.cargaTransportada = cargaTransportada;
    }

    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        if (motorista == null) {
            throw new IllegalArgumentException("O motorista não pode ser nulo.");
        }
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
        this.veiculo = veiculo;
    }

    public Rota getRota() {
        return rota;
    }
    public void setRota(Rota rota) {
        if (rota == null) {
            throw new IllegalArgumentException("A rota não pode ser nula.");
        }
        this.rota = rota;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("----- Relatório da Viagem -----");
        System.out.println(String.format("Origem: %s", origem));
        System.out.println(String.format("Destino: %s", destino));
        System.out.println(String.format("Data de saída: %s", dataSaida));
        System.out.println("Carga transportada:");
        cargaTransportada.gerarRelatorio();
        System.out.println("---------------------------------------");
        System.out.println(String.format("Motorista: %s", motorista.getNome()));
        System.out.println(String.format("Veículo: %s, %s", veiculo.getMarca(), veiculo.getPlaca()));
        System.out.println("Rota:");
        rota.gerarRelatorio();
    }

    @Override
    public void obterLocalizacao() {
        List<String> pontos = rota.getPontosParada();
        if (pontos.isEmpty()) {
            System.out.println("Nenhum ponto de parada definido na rota.");
            return;
        }
        Random random = new Random();
        String local = pontos.get(random.nextInt(pontos.size()));
        System.out.println(String.format("Localização atual da viagem: %s", local));
    }

    @Override
    public void HistoricoLocalizacao() {
        List<String> pontos = rota.getPontosParada();
        if (pontos.isEmpty()) {
            System.out.println("Nenhum ponto de parada definido na rota.");
            return;
        }
        Random random = new Random();
        int indiceMax = random.nextInt(pontos.size());
        System.out.println("Histórico de localização:");
        for (int i = 0; i < indiceMax; i++) {
            System.out.println(String.format(" - %s", pontos.get(i)));
        }
    }
}
