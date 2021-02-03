package exercherança;

public abstract class Pessoa {
    protected String nome;     // Protected permite com que as subclasses utilizem o "this.nome" por exemplo.
    protected int idade;
    protected String sexo;
    
    //Métodos
    
    public void mostrar(){
        System.out.println("\nNome: "+this.getNome()+"\n"
                          +"Idade: "+this.getIdade()+"\n"
                          +"Sexo: "+this.getSexo());
    }
    
    public final void fazerNiver(){
        this.setIdade(this.getIdade()+1);
    }
    
    //Getters e Setters.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Metodo toString()
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
 
}
