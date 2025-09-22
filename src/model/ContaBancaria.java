package src.model;

import java.util.InputMismatchException;

public class ContaBancaria {

    //#region Atributos
    private String agencia;

    private String conta;

    private Integer digito;

    private Double saldo;

    private Double VALOR_MINIMO_DEPOSITO = 10.0;
    
//#endregion

//#region Construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;

        
    }
    //#endregion

    //#region Getters E Setters

    

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
        //#endregion
    }

   //#region Metodos
public void depositar(Double valor){
    //this.saldo = this.saldo + valor;
    
    if (valor < VALOR_MINIMO_DEPOSITO){
        throw new InputMismatchException("O valor minimo de depósito é R$" + VALOR_MINIMO_DEPOSITO);
    }
    this.saldo += valor;
}

public Double sacar (Double valor){
    if (valor > this.saldo) {
        throw new InputMismatchException("O saldo é insuficiente");
    }

    this.saldo -= valor;
    return valor;
}

public void transferir (Double valor, ContaBancaria contaDestino){
    this.sacar(valor);

    contaDestino.depositar(valor);
}

   //#endregion

    }

    

