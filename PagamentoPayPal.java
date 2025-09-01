public class PagamentoPayPal implements Pagamento {
    private String email;

    public PagamentoPayPal(String email) {
        this.email = email;
    }

    private boolean validarContaPayPal() {
        return email != null && email.contains("@");
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarContaPayPal()) {
            return "Pagamento de R$ " + valor + " processado com sucesso via PayPal.";
        } else {
            return "Erro: E-mail não vinculado a uma conta PayPal.";
        }
    }
}