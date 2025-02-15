import java.time.LocalDate;

public class Manutencao implements Relatorio {
    private LocalDate data;
    private String tipo;
    private double custo;

    public Manutencao(LocalDate data, String tipo, double custo) {
        this.data = data;
        this.tipo = tipo;
        this.custo = custo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        if (data != null) {
            this.data = data;
        } else {
            throw new IllegalArgumentException("A data não pode ser nula.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isEmpty()) {
            this.tipo = tipo;
        } else {
            throw new IllegalArgumentException("O tipo não pode ser nulo ou vazio.");
        }
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        if (custo > 0) {
            this.custo = custo;
        } else {
            throw new IllegalArgumentException("O custo deve ser positivo.");
        }
    }

    @Override
    public void gerarRelatorio() {
        System.out.println(String.format("Data: %s", getData()));
        System.out.println(String.format("Tipo: %s", getTipo()));
        System.out.println(String.format("Custo: R$%.2f", getCusto()));
    }
}