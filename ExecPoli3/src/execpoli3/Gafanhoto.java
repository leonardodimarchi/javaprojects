package execpoli3;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    
    //Construtor

    public Gafanhoto(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //Metodos
    
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);        
    }
    
    //Getters e Setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //toString
    
    @Override
    public String toString() {
        return "Gafanhoto:\n"+super.toString()+"\nlogin: " +this.getLogin()+ "\ntotal de videos assistidos: "+this.getTotAssistido();
    }
    
    
}
