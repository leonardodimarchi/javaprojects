package exercherança;

public class ExercHerança {

    public static void main(String[] args) {
        Tecnico a1 = new Tecnico();
        a1.setNome("clebao");
        a1.setValorMatr(1300);
        a1.setIdade(17);
        a1.setCurso("Engenharia");
        a1.setSexo("Machão");
        System.out.println(a1.toString());
        a1.praticar();
        a1.pagarMensalidade();
    }
}
