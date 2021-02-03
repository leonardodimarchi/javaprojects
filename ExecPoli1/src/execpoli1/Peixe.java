package execpoli1;

public class Peixe extends Animal {
    private String corPeixe;
    

    @Override
    public void locomover() {
        System.out.println("Continuando a nadar!");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe ta comendo comida de peixe.");
    }

    @Override
    public void emitirSom() {
        System.out.println("BLUB, peixe faz barulho ?");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolha BLUB.");
    }
    
    //Getters e Setters
    
    public String getCorPeixe(){
        return this.corPeixe;
    }
    
    public void setCorPeixe(String cor){
        this.corPeixe = cor;
    }
}
