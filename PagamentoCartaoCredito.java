public class PagamentoCartaoCredito implements Pagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    private boolean validarCartao() {
        return numeroCartao != null && numeroCartao.length() == 16;
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarCartao()) {
            return "Pagamento de R$ " + valor + " processado com sucesso via Cartão de Crédito.";
        } else {
            return "Erro: Número de cartão de crédito inválido.";
        }
    }
}