package src;


import src.model.ContaCorrente;
import src.model.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaCorrente conta = new ContaCorrente("001", "7542", 5, 100.0);

        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();
        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        
        Double saque = conta.sacar(150.0);
        System.out.println();
         System.out.println("Saldo atual de R$" + conta.getSaldo());

         ContaPoupanca conta2 = new ContaPoupanca("001", "7542", 6, 200.0);

         conta2.transferir(100.0, conta);
         System.out.println();
         System.out.println("Saldo conta destino de R$" + conta2.getSaldo());
         System.out.println("Saldo conta atual de R$" + conta.getSaldo());
    }
}
