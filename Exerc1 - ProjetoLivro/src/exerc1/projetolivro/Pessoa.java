package exerc1.projetolivro;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //Construtor
    
    public Pessoa(String nome, int idade, String sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    
    //Metodos
    
    public void mostrar(){
        System.out.println("Nome: "+this.getNome()+"\n"
                          +"Idade: "+this.getIdade()+"\n"
                          +"Sexo: "+this.getSexo()+"\n");
    }
    
    public void fazerNiver(){
        this.setIdade(this.getIdade() + 1);
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
    
}
