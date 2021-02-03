package execpoli3;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Construtor
    
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setViews(1);
        this.setAvaliacao(5);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    //Metodos
    
    @Override
    public void play() {
        System.out.println("Play no video \""+this.getTitulo()+"\"");
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        System.out.println("Pausando o video \""+this.getTitulo()+"\"");
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        System.out.println("Like no video \""+this.getTitulo()+"\"");
        this.curtidas++;
    }
    
    
    //Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int avaliaFinal = 0;
        avaliaFinal = (int)((this.getAvaliacao()+avaliacao)/this.getViews());
        this.avaliacao = avaliaFinal;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    //toString

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + '}';
    }
    
    
    
}
