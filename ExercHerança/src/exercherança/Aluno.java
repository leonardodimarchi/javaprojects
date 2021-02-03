package exercherança;

public class Aluno extends Pessoa {
    private int valorMatr;
    private String curso;

    //Metodos

    public void pagarMensalidade(){
        System.out.println(this.getNome()+" pagou a matricula sem bolsa.");
    }
    
    //Getters e Setter

    public int getvalorMatr() {
        return valorMatr;
    }

    public void setValorMatr(int valorMatr) {
        this.valorMatr = valorMatr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
