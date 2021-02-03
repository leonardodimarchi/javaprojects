package execpoli1;

public class Canguru extends Mamifero{
    
    private float kgDeMusculo;
    
    @Override
    public void locomover(){
        System.out.println("Saltando.");
    }
    
    public void usarBolsa(){
        System.out.println("Usando a bolsa.");
    }
    
    //Getters e Setters
    
    public float getKgDeMusculo(){
        return this.kgDeMusculo;
    }
    
    public void setKgDeMusculo(float kg){
        this.kgDeMusculo = kg;
    }
    
}