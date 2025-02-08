public class Viagem {
	private String origem;
	private String destino;
	private String data_Saída;
	private Carga cargaTransportada;
	private Motorista motorista;
	private Veiculo veiculo;

	public Viagem(String origem, String destino, String data_Saída, Carga cargaTransportada, Motorista motorista, Veiculo veiculo) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.data_Saída = data_Saída;
		this.cargaTransportada = cargaTransportada;
		this.motorista = motorista;
		this.veiculo = veiculo;
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

    public Carga getCargaTransportada() {
        return cargaTransportada;
    }

    public void setCargaTransportada(Carga cargaTransportada) {
        this.cargaTransportada = cargaTransportada;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
	
	
	
}
