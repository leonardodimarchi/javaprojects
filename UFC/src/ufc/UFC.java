package ufc;

public class UFC {

  
    public static void main(String[] args) {
        Lutadores l[] = new Lutadores[6];
        l[0] = new Lutadores("Rodrigao",31,1.75f,68.9f,11,2,1,"França");
        l[1] = new Lutadores("Putaço",29,1.68f,57.8f,14,2,3,"Brasil");
        l[2] = new Lutadores("Sombrinha",35,1.65f,81.6f,12,2,1,"EUA");
        l[3] = new Lutadores("Mortinho",28,1.93f,80.9f,13,0,2,"Australia");
        l[4] = new Lutadores("Alignigeno",37,1.70f,119.3f,5,4,3,"Brasil");
        l[5] = new Lutadores("Nerdao",30,1.81f,105.7f,12,2,4,"EUA");
        
        Luta luta01 = new Luta();
        luta01.marcarLuta(l[1],l[0]);
        luta01.lutar();
        
    }
    
}
