public class NotificacaoEmail extends Notificacao {

    @Override
    public void notificacaoManutencao() {
        System.out.println("NOTIFICAÇÃO! Você tem uma nova mensagem de e-mail sobre a manutenção do veículo!");
        getManutencao().gerarRelatorio();
    }

    @Override
    public void notificacaoViagem() {
        System.out.println("NOTIFICAÇÃO! Você tem uma nova mensagem de e-mail sobre a viagem do veículo!");
        getViagem().gerarRelatorio();
    }
}