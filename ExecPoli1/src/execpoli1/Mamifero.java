package execpoli1;

public class Mamifero extends Animal {
    private String cor;

    @Override
    public void locomover() {
        System.out.println("Mamifero esta se movendo.");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamifero ta comendo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero.");
    }
    
    //Getters e Setters
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
}
