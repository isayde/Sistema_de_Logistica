public abstract class Carga implements Relatorio { 
    
    protected double peso;
    protected String tipo;
    protected double valor;
    
    public Carga(double peso, String tipo, double valor) {
        this.peso = peso;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("O peso deve ser positivo.");
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
    }

    public abstract void gerarRelatorio();
    public abstract double calcularSeguro();

}

