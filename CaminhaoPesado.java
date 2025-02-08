package Sistema_de_Logística_de_Transporte;

public class CaminhaoPesado extends Veiculo{
	private int multiGasto;
	public CaminhaoPesado(String placa, double capacidadeCarga, String tipoCombustivel) {
		super(placa, capacidadeCarga, tipoCombustivel);
		this.multiGasto = 10;
	}
	@Override
	public void calcularCustos() {
		System.out.println("Os custos do caminhão Leve é de "+5000*multiGasto);
	}
	
}
