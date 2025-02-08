package Sistema_de_Logística_de_Transporte;

import java.util.ArrayList;

public class Motorista {
	private String nome;
	private String numeroCNH;
	private String experiência;
	private ArrayList<Veiculo> veiculos;
	public Motorista(String nome, String numeroCNH, String experiência, boolean cadastroDia, ArrayList<Veiculo> veiculos) {
		if(cadastroDia == true) {
			this.nome = nome;
			this.numeroCNH = numeroCNH;
			this.experiência = experiência;
			this.veiculos = veiculos;
			System.out.println("Cadastro Feito");
		} else {
			System.out.println("O cadastro não está em dia");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroCNH() {
		return numeroCNH;
	}
	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
	}
	public String getExperiência() {
		return experiência;
	}
	public void setExperiência(String experiência) {
		this.experiência = experiência;
	}
	
	
}
