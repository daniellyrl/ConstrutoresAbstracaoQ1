public class Gato extends Animal implements Correr{
    public Gato(String nome){
        super(nome);
    }
    @Override
    public void EmitirSom(){
        System.out.println("Miau Miau");
    }

    @Override
    public void Correr(){
        System.out.println("Este animal corre");
    }
}
