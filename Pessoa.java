public class Pessoa {
    //Atributos
    private String nome;
    private Integer idade;

    //Geters e Setters
    public void setNome(String nome){
        this.nome = nome;

    }
    public String getNome(){
        return this.nome;
    }
    public Integer getIdade(){
        return this.idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
  

 
    
}
//                      Métodos acessores

// Private:  Somente a classe consegue acessar
//Public:     Qualquer um pode acessar os atributos/elementos
// Protected:   Indica que somente a classe e seus filhos conseguem acessar
// Default:     Indica que somente a classe, seus filhos e as classes no mesmo package podem acessar
//Se n digitar nada é DEFAULT
/*Geter e Setters: são métodos que a classe disponibiliza pra quem quiser usar do lado de fora para modifcar ou obter informações sobre os atributos */
