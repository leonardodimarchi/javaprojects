package ufc;

import java.util.Random;

public class Luta {
    private Lutadores desafiante;
    private Lutadores desafiado;
    private boolean aprovado;
    private int rounds;
    
    //Métodos.
    
    public void marcarLuta(Lutadores l1,Lutadores l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
            this.setAprovado(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }else{
            this.setAprovado(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    
    public void lutar(){
        if(this.getAprovado()){
            System.out.println("*****Desafiante*****\n");
            this.desafiante.apresentar();
            System.out.println("*****Desafiado*****\n");
            this.desafiado.apresentar();
            Random numaleatorio = new Random();
            System.out.println("\n*****Resultado*****\n");
            int vencedor = numaleatorio.nextInt(3); // Devolve um numero aleatorio começando em 0, ou seja, 0 1 2 .
            switch(vencedor){
                case 0: // Vitoria do desafiante.
                    System.out.println("O desafiante "+this.desafiante.getNome()+" Venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 1: // Vitoria do desafiado.
                    System.out.println("O desafiado "+this.desafiado.getNome()+" Venceu!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
                case 2: //Empate.
                    System.out.println("--- Empatou ---");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
            }        
        }else{
            System.out.println("A luta não pode acontecer.");
        }
        System.out.println("-------------------------------");
    }
    
    //Getter e setters.

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
}
