public class App {
    public static void main(String[] args) {
        System.out.println("OLA MUNDO");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fulano");
        pessoa1.setIdade(21);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        Carro meuCarro = new Carro();
        meuCarro.setModelo("Honda");
        meuCarro.setAno(2024);
        meuCarro.setCor("Azul");

        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getAno());
        System.out.println(meuCarro.getCor());


        Carro novoCarro = new Carro("Fiat TOuro", 2022, "Branca");


        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getAno());
        System.out.println(novoCarro.getCor());


      
      

    }
}
