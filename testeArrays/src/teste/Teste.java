package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Teste {
    public static void main(String[] args) {
        String aula1 = "Generics Java";
        String aula2 = "Spring Boot";
        String aula3 = "Git e GitHub";
        int cc = 0;
        int x;
        
        ArrayList<String> aulas = new ArrayList();
        
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
        //Collections.sort(aulas);   // Ordena a arraylist.    
                
       //aulas.remove(aula1);    // Remove algo da arraylist
        
       //String aulasegunda = aulas.get(1);   // Tem como usar o get(index) numa arraylist
    
        //for(String aula : aulas){             // ForEach da maneira normal (Para cada)
        //   cc++;                                                    
        //    System.out.format("Aula %d : %s\n",cc,aula );
        //}
        
       //System.out.println("A segunda aula é: " + aulasegunda);
       
       //for (cc = 0; cc < aulas.size(); cc++)          //For normal percorrendo a arraylist
       //   System.out.format("Aula%d: %s\n",cc+1,aulas.get(cc));
       //}
       
       //aulas.forEach(aula -> {                //ForEach sendo usado atráves do método da classe arraylist
       //    System.out.println("Percorrendo a aula: " + aula);
       // });
    }
    
}
