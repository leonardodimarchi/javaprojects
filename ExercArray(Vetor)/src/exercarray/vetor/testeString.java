/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercarray.vetor;

/**
 *
 * @author leogu
 */
public class testeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String letras= "string";
       
       final char[] x = letras.toCharArray();
       
       String stringFinal = "";
       
       for(int i = 0; i < letras.length(); i++){
          stringFinal = stringFinal+x[i]+"-"; 
       }
       
       System.out.println(stringFinal);
    }
    
    
}
