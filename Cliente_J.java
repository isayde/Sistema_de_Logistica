import java.util.ArrayList;

public class Cliente_J extends Cliente {
    private String Cnpj;
    
    public Cliente_J(String nome, String endereco, String contato, ArrayList<Viagem> viagens, String Cnpj) {
        super(nome, endereco, contato, viagens);
        this.Cnpj = Cnpj;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj != null && !cnpj.isEmpty()) {
            this.Cnpj = cnpj;
        } else {
            throw new IllegalArgumentException("O CNPJ não pode ser nulo ou vazio.");
        }
    }
}
