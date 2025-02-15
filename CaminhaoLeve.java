import java.util.ArrayList;

public class CaminhaoLeve extends Veiculo {
    private int multiGasto;

    public CaminhaoLeve(String placa, double capacidadeCarga, String tipoCombustivel, String chassi, String marca, int kmRodados, ArrayList<Manutencao> manutencoes) {
        super(placa, capacidadeCarga, tipoCombustivel, chassi, marca, kmRodados, manutencoes);
        this.multiGasto = 4;
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
        System.out.println(String.format("Os custos do caminhão leve são de %d", multiGasto * super.getKmRodados()));
    }
}
