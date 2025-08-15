public class Carro {
    //Atributos
    //#region Atributos
    
    private String modelo;
     private Integer ano;
     private String cor;

//#endregion

//#region Construtores
public Carro(){}
    public Carro (String modelo, Integer ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;

    }

//#endregion


//#region Getters e Setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
   //#endregion
}
