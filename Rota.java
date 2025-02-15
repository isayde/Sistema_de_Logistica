import java.util.ArrayList;
import java.util.List;

public class Rota implements Relatorio {
    private double distancia;
    private String condicaoEstrada;
    private List<String> pontosParada;

    public Rota(double distancia, String condicaoEstrada, ArrayList<String> pontosParada) {
        if (distancia <= 0) {
            throw new IllegalArgumentException("A distância deve ser maior que 0!");
        }
        if (condicaoEstrada == null) {
            throw new IllegalArgumentException("A Condição da Estrada não pode ser nula!");
        }
        this.distancia = distancia;
        this.condicaoEstrada = condicaoEstrada;
        this.pontosParada = pontosParada != null ? pontosParada : new ArrayList<>();
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        if (distancia > 0) {
            this.distancia = distancia;
        } else {
            throw new IllegalArgumentException("A distância deve ser maior que 0!");
        }
    }

    public String getCondicaoEstrada() {
        return condicaoEstrada;
    }

    public void setCondicaoEstrada(String condicaoEstrada) {
        if (condicaoEstrada != null) {
            this.condicaoEstrada = condicaoEstrada;
        } else {
            throw new IllegalArgumentException("A Condição da Estrada não pode ser nula!");
        }
    }

    public List<String> getPontosParada() {
        return pontosParada;
    }

    public void setPontosParada(List<String> pontosParada) {
        this.pontosParada = pontosParada != null ? pontosParada : new ArrayList<>();
    }

    public void addPontoParada(String parada) {
        if (parada != null) {
            this.pontosParada.add(parada);
        } else {
            throw new IllegalArgumentException("O ponto de parada não pode ser nulo!");
        }
    }

    public void removerPontoParada(String parada) {
        if (pontosParada.contains(parada)) {
            pontosParada.remove(parada);
        } else {
            System.out.println("Ponto de parada já ausente!");
        }
    }

    @Override
    public void gerarRelatorio() {
        System.out.println(String.format("Distância da Rota: %.2f km", getDistancia()));
        System.out.println("Condição da Estrada: " + getCondicaoEstrada());
        System.out.println("Pontos de Parada:");
        for (String p : pontosParada) {
            System.out.println(" - " + p);
        }
    }
}
