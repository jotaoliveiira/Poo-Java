package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {

    //#region Atributos
    protected String agencia;

    protected String conta;

    protected Integer digito;

    protected Double saldo;

    protected Double VALOR_MINIMO_DEPOSITO = 10.0;

    protected Date dataAbertura;

    protected ArrayList <Movimentacao> movimentacoes;

    
//#endregion


    //#region Construtores
    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();

        this.movimentacoes = new ArrayList<Movimentacao>();

        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);

        //EStou SALVANDO A MOVIMENTAÇÃO DENTRO DDO ARRAY DE MOVIMENTACOES
        this.movimentacoes.add(movimentacao);
        
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
}
    public Date getDataAbertura() {
        return dataAbertura;
    }

        //#endregion
    

    


   //#region Metodos

public void depositar(Double valor){
    //this.saldo = this.saldo + valor;
    
    if (valor < VALOR_MINIMO_DEPOSITO){
        throw new InputMismatchException("O valor minimo de depósito é R$" + VALOR_MINIMO_DEPOSITO);
    }
    this.saldo += valor;
    //AQ FAÇO UMA MOVIMENTAÇAO NO EXTRATO
    Movimentacao movimentacao = new Movimentacao("Depósito", valor);
    this.movimentacoes.add(movimentacao);
}

public Double sacar (Double valor){
    if (valor > this.saldo) {
        throw new InputMismatchException("O saldo é insuficiente");
    }
    this.saldo -= valor;
    Movimentacao movimentacao = new Movimentacao("Retirada de valor", valor);
    this.movimentacoes.add(movimentacao);
    return valor;
}

public void transferir (Double valor, ContaBancaria contaDestino){
    this.sacar(valor);

    contaDestino.depositar(valor);
}

   //#endregion


    public abstract void imprimirExtrato();

    

    }

    

