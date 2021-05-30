public class ContaCorrente implements Conta {

    private String cliente;
    private String numero;
    private double saldo;

    public ContaCorrente(String cliente, String numero, double saldo){
        setCliente(cliente);
        setNumero(numero);
        setSaldo(saldo);
    }
    
    private String getCliente() {
        return cliente;
    }

    private void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private String getNumero() {
        return numero;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void realizarDeposito(double valor) {
        try {
            if (valor > 0) {
                int saldoAux, valorAux;  // Bloco de código responsável por eliminar problemas de mantissa em números com ponto flutuante
                double saldo = getSaldo();
                saldoAux = (int) (saldo * 100);
                valorAux = (int) (valor * 100);
                saldo = saldoAux + valorAux;
                saldo = saldo / 100;
                setSaldo(saldo);
            } else {
                Exception e = new Exception("\nDepósito não pode ser negativo.");
                throw e;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void realizarSaque(double valor) {
        try {
            if (valor > 0) {
                int saldoAux, valorAux;  // Bloco de código responsável por eliminar problemas de mantissa em números com ponto flutuante
                double saldo = getSaldo();
                saldoAux = (int) (saldo * 100);
                valorAux = (int) (valor * 100);
                saldo = saldoAux - valorAux;
                saldo = saldo / 100;
                if (saldo > 0) {
                    setSaldo(saldo);
                } else {
                    Exception e = new Exception("\nNão é possível sacar valor maior que o saldo atual.");
                    throw e;    
                }
            } else {
                Exception e = new Exception("\nDepósito não pode ser negativo.");
                throw e;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void verificarSaldo() {
        System.out.printf("\n\nCliente: %s | Conta: %s | Saldo: %,.2f", getCliente(), getNumero(), getSaldo());
    }
}