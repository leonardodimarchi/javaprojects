package exercherança;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    //Metodos
    
    public void comecarTrabalho(String setor){
        if (this.getTrabalhando()){
            System.out.println("\nJá esta trabalhando.");
        }else{
            this.setSetor(setor);
        }
    }    
    
    public void demitir(){
        this.setTrabalhando(false);
    }
    
    //Getters e Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
