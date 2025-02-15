public abstract class Notificacao {
    private Manutencao manutencao;
    private Viagem viagem;

    public Manutencao getManutencao() {
        return manutencao;
    }

    public void setManutencao(Manutencao manutencao) {
        this.manutencao = manutencao;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public abstract void notificacaoManutencao();
    public abstract void notificacaoViagem();
}