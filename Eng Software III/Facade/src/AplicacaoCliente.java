public class AplicacaoCliente {
    public static void main(String[] args) {
        ClienteDoBanco cliente = new ClienteDoBanco("Dakva Branco");
        ContaBancaria conta = new ContaBancaria("1345-9");

        Fachada facade = new Fachada();
        facade.fazerDeposito(150, cliente, conta);
    }
}
