package ufc;

public class Lutadores {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Metodo construct.
    
    public Lutadores(String no,int id,float al,float pe,int vi, int de, int em,String na){
        this.setNome(no);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        this.setNacionalidade(na);
    }
    
    //Metodos.
    
    public void apresentar(){
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Altura: "+this.getAltura()+" m");
        System.out.println("Pesando: "+this.getPeso()+" Kg");
        System.out.println(this.getIdade()+" anos");
        System.out.println("Categoria: "+this.getCategoria());
        System.out.println("Ganhou: "+this.getVitorias()+" partidas.");
        System.out.println("Perdeu: "+this.getDerrotas()+" partidas.");
        System.out.println("Empatou: "+this.getEmpates()+" partidas.\n");
    }
    
    public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Peso "+this.getCategoria());
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    // Getters e Setters.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
       if(this.getPeso() <= 50 ){
           this.categoria = "Invalido";
       }else if (this.getPeso()<= 80){
           this.categoria = "Leve";
       }else if (this.getPeso()<= 100){
           this.categoria = "Médio";
       }else if (this.getPeso()<= 140){
           this.categoria = "Pesado";
       }else if (this.getPeso() > 140){
           this.categoria = "Invalido";
       }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
