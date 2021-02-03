package testetrycatch;

public class TesteTryCatch {

    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        
        try{
            b = a/0;    //Tentando dividir por 0.
        }catch (Exception e){
            
            System.out.println("ERRO: "+e.getMessage()); // ERRO: / by zero.
            e.printStackTrace(System.out);  //Mostra o erro detalhadamente, inclusive, mostra a linha que deu erro.
        }
    }
    
}
