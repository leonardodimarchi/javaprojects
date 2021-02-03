package testeconstrutores;

public class Pessoa {
    String nome;
    String condição;
    int idade;
    boolean aposentadoria;
    
    //Constructors
    
    public Pessoa(){
    
    }
    
    public Pessoa(int idade){
        this(idade > 60? "velho": "novo");
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade){
        this(idade);
        this.nome = nome;
    }
    
    private Pessoa(String condição){
        this.aposentadoria = condição.equals("velho");
    }
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCondição() {
        return condição;
    }

    public void setCondição(String condição) {
        this.condição = condição;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getAposentadoria() {
        return aposentadoria;
    }

    public void setAposentadoria(boolean aposentadoria) {
        this.aposentadoria = aposentadoria;
    }
    
    //toString

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", aposentadoria=" + aposentadoria + '}';
    }
    
    
}
