import java.util.ArrayList;

public class Cliente_F extends Cliente {
    private String Cpf;
    
    public Cliente_F(String nome, String endereco, String contato, ArrayList<Viagem> viagens, String Cpf) {
        super(nome, endereco, contato, viagens);
        this.Cpf = Cpf;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.isEmpty()) {
            this.Cpf = cpf;
        } else {
            throw new IllegalArgumentException("O CPF não pode ser nulo ou vazio.");
        }
    }
}
