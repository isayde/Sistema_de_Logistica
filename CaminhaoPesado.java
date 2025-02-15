import java.util.ArrayList;

public class CaminhaoPesado extends Veiculo {
    private int multiGasto;

    public CaminhaoPesado(String placa, double capacidadeCarga, String tipoCombustivel, String chassi, String marca, int kmRodados, ArrayList<Manutencao> manutencao) {
        super(placa, capacidadeCarga, tipoCombustivel, chassi, marca, kmRodados, manutencao);
        this.multiGasto = 10;
    }

    public int getMultiGasto() {
        return multiGasto;
    }

    public void setMultiGasto(int multiGasto) {
        if (multiGasto > 0) {
            this.multiGasto = multiGasto;
        } else {
            throw new IllegalArgumentException("O multiplicador de gasto deve ser positivo.");
        }
    }

    @Override
    public void calcularCustos() {
        System.out.println(String.format("Os custos do caminhão pesado são de %d", multiGasto * super.getKmRodados()));
    }
}
