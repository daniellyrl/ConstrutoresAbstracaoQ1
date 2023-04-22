public class Animal {
    protected String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void EmitirSom(){
        System.out.println("Este animal emite som");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
