public class ContaResultado {
    public static void main(String[] args) {
        Conta conta = new Conta(1234);
        conta.credito(2000);
        conta.debito(500);
        conta.imprimirDados();
    }
}
