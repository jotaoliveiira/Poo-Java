package src;


import src.model.ContaBancaria;
import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.utils.DataUtil;


public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

       ContaCorrente conta = new ContaCorrente("001", "7542", 5, 100.0);

        System.out.println("Saldo atual de R$" +conta.getSaldo());System.out.println();

        conta.depositar(250.0);

        System.out.println("Saldo atual de R$" +conta.getSaldo());System.out.println();

        conta.sacar(150.00);
        System.out.println("Saldo atual de R$" +conta.getSaldo());System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("001", "7542", 5, 100.0);

        conta2.transferir(100.0, conta);

        System.out.println("Saldo da conta de destino de " +  conta2.getSaldo());
        System.out.println();
        System.out.println("Saldo da conta atual de "  + conta.getSaldo());

        System.out.println(conta2.getDataAbertura());

       

         String f1 =  DataUtil.converterDateParaDataEHora(conta2.getDataAbertura());
          String f2 =  DataUtil.converterDateParaHora(conta2.getDataAbertura());
           String f3 =  DataUtil.converterDateParaData(conta2.getDataAbertura());
       
        System.out.println(f2);
        System.out.println(f3);
       
    }
}
