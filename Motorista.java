
import java.time.LocalDate;
import java.util.ArrayList;

public class Motorista {
	private String nome;
	private String numeroCNH;
	private String experiência;
	private LocalDate dataCadastro;
	private ArrayList<Veiculo> veiculos;
	public Motorista(String nome, String numeroCNH, String experiência, LocalDate dataCadastro, ArrayList<Veiculo> veiculos) {
		if(dataCadastro.isAfter(LocalDate.now())) {
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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
	
	
}
