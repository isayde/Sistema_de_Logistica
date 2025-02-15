import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private String contato;
    private List<Viagem> viagens;
    private List<Notificacao> notificacoes;

    public Cliente(String nome, String endereco, String contato, ArrayList<Viagem> viagens) {
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
        this.viagens = viagens != null ? viagens : new ArrayList<>();
        this.notificacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null && !endereco.isEmpty()) {
            this.endereco = endereco;
        } else {
            throw new IllegalArgumentException("O endereço não pode ser nulo ou vazio.");
        }
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        if (contato != null && !contato.isEmpty()) {
            this.contato = contato;
        } else {
            throw new IllegalArgumentException("O contato não pode ser nulo ou vazio.");
        }
    }

    public List<Viagem> getViagens() {
        return viagens;
    }

    public void setViagens(List<Viagem> viagens) {
        if (viagens != null) {
            this.viagens = viagens;
        } else {
            throw new IllegalArgumentException("A lista de viagens não pode ser nula.");
        }
    }

    public void addViagem(Viagem viagem) {
        if (viagem != null) {
            this.viagens.add(viagem);
        } else {
            throw new IllegalArgumentException("A viagem não pode ser nula.");
        }
    }

    public void addNotificacao(Notificacao notificacao) {
        if (notificacao != null) {
            this.notificacoes.add(notificacao);
        } else {
            throw new IllegalArgumentException("A notificação não pode ser nula.");
        }
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        this.notificacoes = notificacoes;
    }
    
}
