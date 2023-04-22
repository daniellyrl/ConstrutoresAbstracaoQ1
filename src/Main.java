public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Carlos");
        Gato g1 = new Gato("Júlio");
        Passarinho p1 = new Passarinho("Vick");
        System.out.println("Informações sobre o Cachorro: \n" +
                "Nome: " + c1.getNome());
        c1.EmitirSom();
        c1.Correr();
        System.out.println("Informações sobre o Gato: \n" +
                "Nome: " + g1.getNome());
        g1.EmitirSom();
        g1.Correr();
        System.out.println("Informações sobre o Passarinho: \n" +
                "Nome: " + p1.getNome());
        p1.EmitirSom();
        p1.Voar();
    }
}