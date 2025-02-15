public class PagamentoPorDistancia implements Pagamento {
    
    private double distanciaKm;
    private double precoKm;
    
    public PagamentoPorDistancia(double distanciaKm, double precoKm) {
        if (distanciaKm < 0 || precoKm < 0) {
            throw new IllegalArgumentException("Distância e preço devem ser positivos.");
        }
        this.distanciaKm = distanciaKm;
        this.precoKm = precoKm;
    }
    
    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm < 0) {
            throw new IllegalArgumentException("A distância deve ser positiva.");
        }
        this.distanciaKm = distanciaKm;
    }

    public double getPrecoKm() {
        return precoKm;
    }

    public void setPrecoKm(double precoKm) {
        if (precoKm < 0) {
            throw new IllegalArgumentException("O preço deve ser positivo.");
        }
        this.precoKm = precoKm;
    }

    public double calcularValor() {
        return distanciaKm * precoKm;
    }
    
    public double calcularTaxas() {
        return (distanciaKm > 1000) ? 20 : 0;
    }
}
