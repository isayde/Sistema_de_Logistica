public class PagamentoPorPeso implements Pagamento {
    
    private double pesoKg;
    private double precoKg;
    
    public PagamentoPorPeso(double pesoKg, double precoKg) {
        if (pesoKg < 0 || precoKg < 0) {
            throw new IllegalArgumentException("Peso e preço devem ser positivos.");
        }
        this.pesoKg = pesoKg;
        this.precoKg = precoKg;
    }
    
    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg < 0) {
            throw new IllegalArgumentException("O peso deve ser positivo.");
        }
        this.pesoKg = pesoKg;
    }

    public double getPrecoKg() {
        return precoKg;
    }

    public void setPrecoKg(double precoKg) {
        if (precoKg < 0) {
            throw new IllegalArgumentException("O preço deve ser positivo.");
        }
        this.precoKg = precoKg;
    }
    
    public double calcularValor() {
        return pesoKg * precoKg;
    }
    
    public double calcularTaxas() {
        return (pesoKg > 100) ? 30 : 0;
    }
}
