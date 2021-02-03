package exerc1.projetolivro;

import java.util.Scanner;

public class Exerc1ProjetoLivro {

    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[3];
        Livro[] livros = new Livro[3];
        
        pessoas[0] = new Pessoa("Leo",17,"Machão");
        pessoas[1] = new Pessoa("Joãozão",94,"Fêmea");
        
        livros[0] = new Livro("Como treinar seu dragão","Soluço",94,pessoas[0]);
        livros[1] = new Livro("Livro dos cachorro loko","el Catioro",2,pessoas[1]);
            
        pessoas[1].mostrar();
        
        pessoas[0].mostrar();
        
        livros[0].abrir();
        livros[0].folhear(57);
        livros[0].avancarPag();
        livros[0].detalhes();
        
        livros[1].abrir();
        livros[1].avancarPag();
        livros[1].detalhes();
        
        /* Teste de novo livro com Scanner
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite o nome do seu livro: ");
        String nLivro = tecla.nextLine();       
        System.out.println("Seu nome (autor): ");
        String nAutor = tecla.nextLine();
        System.out.println("Numero de paginas: ");
        int nPags = tecla.nextInt();
        tecla.nextLine();
        System.out.println("-- Primeiro leitor -- \nNome: ");
        String nomeLeitor = tecla.nextLine();
        System.out.println("Idade: ");
        int idadeLeitor = tecla.nextInt();
        tecla.nextLine();
        System.out.println("Sexo: ");
        String sexoLeitor = tecla.nextLine();
        
        pessoas[2] = new Pessoa(nomeLeitor,idadeLeitor,sexoLeitor);
        livros[2] = new Livro(nLivro,nAutor,nPags,pessoas[2]);
        
        livros[2].detalhes();
        pessoas[2].mostrar();
        */
    }
    
}
