package src.model;

import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {
    //#region Atributos
    private String agencia;

    private String conta;

    private Integer digito;

    private Double saldo;

    private Date dataAbertura;

   


  



   private Double VALOR_MINIMO_DEPOSITO = 10.0;

    //#endregion

   
    //#region Construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
       this.dataAbertura = new Date();

       
    }
    //#endregion

    //#region Getters e Setters
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }
     public Date getDataAbertura() {
        return dataAbertura;
    }

        
   

  //#endregion

   //#region Metodos
   public void depositar (Double valor){
    //Verifica se o valor de depóstio é menor q o valor minimo
    //Se for, nao pode acontecer depósito
    if (valor < VALOR_MINIMO_DEPOSITO) {
        throw new InputMismatchException ("O valor mínimo de depósito é R$" + VALOR_MINIMO_DEPOSITO);
    }
    //this.saldo = this.saldo + valor;
    //Efetua o depósito somando o valor ao saldo
    this.saldo += valor;
   }
   


   public Double sacar (Double valor){
    //Verifica se o valor é maior q saldo da conta
    //Se for, aparece a msg de saldo
    if (valor > this.saldo) {
        throw new InputMismatchException("O saldo é insfuciente");
        
    }
    //this.saldo = this.saldo - valor;
    //AQUI removemos o valor de saque do saldo atual
    this.saldo -= valor;

    //retorna o valor ao usuário
    return valor;
    
   }
   


public void transferir (Double valor, ContaBancaria contaDestino){

    // Efetua Um saque na atual conta
    this.sacar (valor);

    //Efetua o deposito na conta de destino
    contaDestino.depositar(valor);

}
//#endregion
}


   

   

