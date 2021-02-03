package execpoli3;

public class ExecPoli3 {

    public static void main(String[] args) {
        Video video[] = new Video[2];
        video[0] = new Video("Video de panda");
    
        Gafanhoto gaf[] = new Gafanhoto[2];
        gaf[0] = new Gafanhoto("Leo",17,"Gordo","hinkoon");
        gaf[0].setExperiencia(10f);
    
        Visualizacao v[] = new Visualizacao[2];
        v[0] = new Visualizacao(gaf[0],video[0]);
        v[0].avaliar(10);
        video[0].like();
        System.out.println(v[0].toString());
    }
}
