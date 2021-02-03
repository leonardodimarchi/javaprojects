package execpoli2;

public class Mamifero extends Animal {
     protected String corPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero.");
    }
    
    //Getters e Setters
    
    public String getCorPelo(){
        return this.corPelo;
    }
    
    public void setCorPelo(String cor){
        this.corPelo = cor;
    }
    
}
