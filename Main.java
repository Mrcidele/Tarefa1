public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        System.out.println("--- Pagamento via Cartão de Crédito ---");
        service.processarPagamento(new FactoryCartaoCredito("1234567890123456"), 150.00); 
        service.processarPagamento(new FactoryCartaoCredito("12345"), 50.00); // Exemplo de cartão inválido

        System.out.println("\n--- Pagamento via PayPal ---");
        service.processarPagamento(new FactoryPayPal("usuario@exemplo.com"), 75.00);
        service.processarPagamento(new FactoryPayPal("emailinvalido"), 25.00); // Exemplo de e-mail inválido

        System.out.println("\n--- Pagamento via Criptomoeda ---");
        service.processarPagamento(new FactoryCriptomoeda(500.00), 300.00);
        service.processarPagamento(new FactoryCriptomoeda(100.00), 300.00); // Exemplo de saldo insuficiente
    }
}