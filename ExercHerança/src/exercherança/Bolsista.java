package exercherança;

public class Bolsista extends Aluno {
    private float bolsa;
    
    //Metodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" é bolsista, pagamento facilitado.");
    }
    
    //Getters e Setters

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
