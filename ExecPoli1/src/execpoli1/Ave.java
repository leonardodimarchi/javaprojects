package execpoli1;

public class Ave extends Animal {
    private String corPena;
    
    @Override
    public void locomover(){
        System.out.println("A ave ta voando alto!");
    }
    
    @Override
    public void alimentar(){
        System.out.println("A ave ta comendo um belo rato. (RIP Stuart Little)");
    }
    
    @Override 
    public void emitirSom(){
        System.out.println("Uma ave ta gritano. CÓÓÒÒÒÒ");
    }
    
    public void fazerNinho(){
        System.out.println("Fazendo ninho.");
    }
    
    //Getters e Setters
    
    public String getCorPena(){
        return this.corPena;
    }
    
    public void setCorPena(String pena){
        this.corPena = pena;
    }
    
}
