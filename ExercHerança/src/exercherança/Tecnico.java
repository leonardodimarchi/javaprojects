package exercherança;

public class Tecnico extends Aluno {
    private String registroProfissional;
    
    //Metodos
    
    public void praticar(){
        System.out.println(this.getNome()+" do curso de "+this.getCurso()+" esta praticando.");
    }
    
    //Getters e Setters

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
