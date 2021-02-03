package exerc1.projetolivro;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Construtor.
    
    public Livro(String titulo, String autor, int totalPg, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPag(totalPg);
        this.setLeitor(leitor);
        this.setAberto(false);
        this.setPagAtual(0);
    }
    
    //Metodos.
    
    public void detalhes(){
        System.out.println("\nTitulo: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de paginas: "+this.getTotalPag());
        System.out.println("Página atual: "+this.getPagAtual());
        if (this.getAberto()){
            System.out.println("O livro esta aberto !");
        }else{
            System.out.println("O livro esta fechado !");
        }
        System.out.println(this.getLeitor().getNome()+" esta lendo atualmente.\n");
    }
    
    // Metodos da inferface.
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotalPag()){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
    
    //Getters e Setter.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }        
}
