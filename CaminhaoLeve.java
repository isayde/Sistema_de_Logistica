package Sistema_de_Logística_de_Transporte;

public class CaminhaoLeve extends Veiculo{
	private int multiGasto;
	public CaminhaoLeve(String placa, double capacidadeCarga, String tipoCombustivel) {
		super(placa, capacidadeCarga, tipoCombustivel);
		this.multiGasto = 4;
	}
	public int getMultiGasto() {
		return multiGasto;
	}
	public void setMultiGasto(int multiGasto) {
		this.multiGasto = multiGasto;
	}
	@Override
	public void calcularCustos() {
		System.out.println("Os custos do caminhão Leve é de "+5000*multiGasto);
	}
	
}
