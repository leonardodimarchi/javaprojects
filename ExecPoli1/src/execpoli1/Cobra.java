package execpoli1;

public class Cobra extends Reptil {
    private boolean venenosa;
    
    @Override
    public void locomover(){
        System.out.println("Cobra rastejando de finin.");
    }
    
    //Getters e Setters
    
    public boolean getVenenosa(){
        return this.venenosa;
    }
    
    public void setVenenosa(boolean venenosa){
        this.venenosa = venenosa;
    }
}
