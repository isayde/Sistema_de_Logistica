package Sistema_de_Logística_de_Transporte;

public class Viagem {
	private String origem;
	private String destino;
	private String data_Saída;
	private String cargaTransportada;
	public Viagem(String origem, String destino, String data_Saída, String cargaTransportada) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.data_Saída = data_Saída;
		this.cargaTransportada = cargaTransportada;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getData_Saída() {
		return data_Saída;
	}
	public void setData_Saída(String data_Saída) {
		this.data_Saída = data_Saída;
	}
	public String getCargaTransportada() {
		return cargaTransportada;
	}
	public void setCargaTransportada(String cargaTransportada) {
		this.cargaTransportada = cargaTransportada;
	}
	
	
}
