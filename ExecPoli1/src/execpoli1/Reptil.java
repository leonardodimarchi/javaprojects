package execpoli1;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Reptil esta se movendo.");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil esta se alimentando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil.");
    }
    
    //Getters e Setters
    
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }
}
