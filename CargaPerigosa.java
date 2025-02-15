
public class CargaPerigosa extends Carga {

	public CargaPerigosa(double peso, double valor) {
		super(peso, "Perigosa", valor);
	}
	
	public double calcularSeguro() {
		return valor * 0.12;
	}

	@Override
	public void gerarRelatorio() {
		System.out.println("Carga Perigosa");
		System.out.println("Peso: " + peso);
		System.out.println("Valor: " + valor);
		System.out.println("Tipo: " + tipo);
		System.out.println("Seguro: " + calcularSeguro());
	}
	
}
