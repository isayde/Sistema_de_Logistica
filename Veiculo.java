package Sistema_de_Logística_de_Transporte;

public class Veiculo {
	private String placa;
	private double capacidadeCarga;
	private String tipoCombustivel;
	public Veiculo(String placa, double capacidadeCarga, String tipoCombustivel) {
		super();
		this.placa = placa;
		this.capacidadeCarga = capacidadeCarga;
		this.tipoCombustivel = tipoCombustivel;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
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
	
	public void calcularCustos() {
		
	}
}
