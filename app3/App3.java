/*
Um banco possui dois tipos de conta: conta corrente e conta corrente especial.
O tipo conta corrente possui um número, um cliente e um saldo. Neste tipo de
conta é possível fazer depósito, consultar saldo e realizar saque. O banco não
permite saque, neste tipo de conta, se o valor a ser retirado é maior que o saldo
da conta. Para as contas do tipo conta corrente especial deseja-se saber o
número, o cliente, o saldo e o limite. Para este tipo de conta são permitidas as
operações de depósito, consulta de saldo e saque. O banco permite que, para
este tipo de conta, o saque seja realizado mesmo que a retirada seja maior que
o saldo, desde que não ultrapasse o limite da conta. Para resolver este problema
utilize os conceitos de herança, polimorfismo e sobrescrita de métodos. Crie uma
classe Principal para testar os métodos criados.
*/

public class App3 {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Fulano", "885544", 5500.00);
        cc1.realizarDeposito(6.68);
        cc1.realizarSaque(7000);
        cc1.realizarSaque(1500.50);
        cc1.verificarSaldo();

        ContaCorrenteEspecial cce1 = new ContaCorrenteEspecial("Ciclano", "54484", 5500.00, 8000.50);
        cce1.realizarDeposito(6.68);
        cce1.realizarSaque(7000);
        cce1.realizarSaque(1500.50);
        cce1.verificarSaldo();
    }
}