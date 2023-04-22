public class Passarinho extends Animal implements Voar {
    public Passarinho(String nome){
        super(nome);
    }
    @Override
    public void EmitirSom(){
        System.out.println("Piu Piu");
    }

    @Override
    public void Voar(){
        System.out.println("Este animal voa");
    }
}

