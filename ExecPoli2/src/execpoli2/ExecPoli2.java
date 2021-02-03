package execpoli2;

public class ExecPoli2 {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir("fofo");
        c.reagir(true);
        c.reagir(22);
        c.reagir(10, 5.2f);
    }
}
