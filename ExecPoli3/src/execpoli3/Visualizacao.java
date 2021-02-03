package execpoli3;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video video;
    
    //Construtor

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.video.setViews(this.video.getViews()+1);
    }
    
    //Metodos
    
    public void avaliar(){
        this.video.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.video.setAvaliacao(nota);
    }
    
    public void avaliar(float porcentagem){
        int x;
        if (porcentagem <= 20){
            x = 3;
        }else if (porcentagem <= 50){
            x = 5;
        }else if (porcentagem <= 90){
            x = 8;
        }else{
            x = 10;
        }
        this.video.setAvaliacao(x);
    }
    
    //Getters e Setters

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
    
    //toString

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", video=" + video + '}';
    }
    
    
}
