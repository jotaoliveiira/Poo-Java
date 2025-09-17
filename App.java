public class App {
    public static void main(String[] args) {
        System.out.println("Aprendendo POO com Java");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Fulano";
        pessoa1.idade = 21;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Joao";
        pessoa2.idade = 13;

        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);
    }

}
