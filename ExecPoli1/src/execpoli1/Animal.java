package execpoli1;

public abstract class Animal {
    protected float peso;
    protected String nome;
    protected int idade;
    protected int membros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract  void emitirSom();
    
    
    //Getters e Setters

    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
