public class PagamentoCriptomoeda implements Pagamento {
    private double saldoCarteira;

    public PagamentoCriptomoeda(double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }

    private boolean validarSaldo(double valor) {
        return saldoCarteira >= valor;
    }

    @Override
    public String processarPagamento(double valor) {
        if (validarSaldo(valor)) {
            saldoCarteira -= valor; 
            return "Pagamento de R$ " + valor + " processado com sucesso via Criptomoeda. Saldo restante: R$ " + saldoCarteira;
        } else {
            return "Erro: Saldo insuficiente na carteira digital.";
        }
    }
}