package Sistema_de_Logística_de_Transporte;

public class Van extends Veiculo{
	private int multiGasto;
	public Van(String placa, double capacidadeCarga, String tipoCombustivel) {
		super(placa, capacidadeCarga, tipoCombustivel);
		this.multiGasto = 10;
	}
	public int getMultiGasto() {
		return multiGasto;
	}
	public void setMultiGasto(int multiGasto) {
		this.multiGasto = multiGasto;
	}
	@Override
	public void calcularCustos() {
	}
	
}
