import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private String numeroCNH;
    private String experiencia;
    private LocalDate dataCadastro;
    private List<Veiculo> veiculos;
    private List<Notificacao> notificacoes;

    public Motorista(String nome, String numeroCNH, String experiencia, LocalDate dataCadastro, List<Veiculo> veiculos) {
        if (dataCadastro.isAfter(LocalDate.of(2020,02,01))) {
            this.nome = nome;
            this.numeroCNH = numeroCNH;
            this.experiencia = experiencia;
            this.dataCadastro = dataCadastro;
            this.veiculos = veiculos != null ? veiculos : new ArrayList<>();
            this.notificacoes = new ArrayList<>();
            System.out.println("Cadastro Feito");
        } else {
            System.out.println("O cadastro não está em dia");
        }
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

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        if (numeroCNH != null && !numeroCNH.isEmpty()) {
            this.numeroCNH = numeroCNH;
        } else {
            throw new IllegalArgumentException("O número da CNH não pode ser nulo ou vazio.");
        }
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        if (experiencia != null && !experiencia.isEmpty()) {
            this.experiencia = experiencia;
        } else {
            throw new IllegalArgumentException("A experiência não pode ser nula ou vazia.");
        }
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        if (dataCadastro.isAfter(LocalDate.of(2020,02,01))) {
            this.dataCadastro = dataCadastro;
        } else {
            throw new IllegalArgumentException("A data de cadastro não pode ser anterior à data atual.");
        }
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        if (veiculos != null) {
            this.veiculos = veiculos;
        } else {
            throw new IllegalArgumentException("A lista de veículos não pode ser nula.");
        }
    }

    public List<Notificacao> getNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(List<Notificacao> notificacoes) {
        if (notificacoes != null) {
            this.notificacoes = notificacoes;
        } else {
            throw new IllegalArgumentException("A lista de notificações não pode ser nula.");
        }
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            this.veiculos.add(veiculo);
        } else {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
    }

    public void removerVeiculo(Veiculo veiculo) {
        if (veiculo != null) {
            this.veiculos.remove(veiculo);
        } else {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
    }

    public void adicionarNotificacao(Notificacao notificacao) {
        if (notificacao != null) {
            this.notificacoes.add(notificacao);
        } else {
            throw new IllegalArgumentException("A notificação não pode ser nula.");
        }
    }
}
