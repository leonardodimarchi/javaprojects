package execpoli2;

public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU!");
    }
    
    //Metodos
    
    public void reagir(String dito){
        String frase = dito.toLowerCase();
        if (frase.equals("toma comida") || frase.equals("ola") || frase.equals("oi") || frase.equals("fofo")){
            System.out.println("Abanando rabo :D");
        }else{
            System.out.println("Rosnando puto ;(");
        }
    }
    
    public void reagir(int hora){
        if (hora < 12){
            System.out.println("Abanando rabo com sono da manha!");
        }else if(hora >= 18){
            System.out.println("Ignorando e indo dormir.");
        }else{
            System.out.println("Abanando e latindo!!!");
        }
    }
    
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanando rabo pro dono ;D");
        }else{
            System.out.println("Rosnando puto pro desconhecido.");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade <5){
            if (peso < 7){
                System.out.println("O novin levin ta feliz.");
            }else{
                System.out.println("Latido de pinscher.");   
            }
        }else{ 
            if(peso>7){
                System.out.println("O pinscher véio ta rosnando.");
            }else{
                System.out.println("O cachorro ta véio e gordo, ignorando geral.");
            }
        }
    }
}
