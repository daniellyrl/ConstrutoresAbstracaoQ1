public class Cachorro extends Animal implements Correr{
    public Cachorro(String nome){
        super(nome);
    }
    @Override
    public void EmitirSom(){
        System.out.println("Au Au");
    }

    @Override
    public void Correr(){
        System.out.println("Este animal corre");
    }
}
