import java.util.ArrayList;

public class Veiculo implements Relatorio {
    private String placa;
    private double capacidadeCarga;
    private String tipoCombustivel;
    private String chassi;
    private String marca;
    private int kmRodados;
    private ArrayList<Manutencao> manutencoes;

    public Veiculo(String placa, double capacidadeCarga, String tipoCombustivel, String chassi, String marca, int kmRodados, ArrayList<Manutencao> manutencoes) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
        this.tipoCombustivel = tipoCombustivel;
        this.chassi = chassi;
        this.marca = marca;
        this.kmRodados = kmRodados;
        this.manutencoes = manutencoes != null ? manutencoes : new ArrayList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && !placa.isEmpty()) {
            this.placa = placa;
        } else {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public void calcularCustos() {
        // Implementação padrão ou abstrata
    }
    
    // Retorna uma cópia defensiva da lista de manutenções
    public ArrayList<Manutencao> getManutencoes() {
        return new ArrayList<>(manutencoes);
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = (manutencoes != null) ? manutencoes : new ArrayList<>();
    }

    public void addManutencao(Manutencao manutencao) {
        if (manutencao != null) {
            this.manutencoes.add(manutencao);
        } else {
            throw new IllegalArgumentException("A manutenção não pode ser nula.");
        }
    }

    @Override
    public void gerarRelatorio() {
        System.out.println(String.format("Placa: %s", getPlaca()));
        System.out.println(String.format("Capacidade de Carga: %.2f", getCapacidadeCarga()));
        System.out.println("Tipo de Combustível: " + getTipoCombustivel());
        System.out.println("Chassi: " + getChassi());
        System.out.println("Marca: " + getMarca());
        System.out.println("Km Rodados: " + getKmRodados());
        System.out.println("Manutenções: ");
        for (Manutencao manutencao : manutencoes) {
            manutencao.gerarRelatorio();
        }
    }
}
