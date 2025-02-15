public class NotificacaoSMS extends Notificacao {
    @Override
    public void notificacaoManutencao() {
        System.out.println("Notificação de manutenção via SMS");
        getManutencao().gerarRelatorio();
    }

    @Override
    public void notificacaoViagem() {
        System.out.println("Notificação de viagem via SMS");
        getViagem().gerarRelatorio();
    }
}