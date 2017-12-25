package livraria.testes;

import livraria.Autor;
import livraria.entidades.Livro;
import livraria.entidades.LivroFisico;

public class CadastroDeLivros {

    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem.");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        System.out.println(livro);

        Autor autor2 = new Autor();
        autor2.setNome("Paulo Silveira");
        autor2.setEmail("paulo.silveira@caelum.com.br");
        autor2.setCpf("123.456.789.10");

        Livro outroLivro = new LivroFisico(autor2);
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas.");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");

        outroLivro.setAutor(autor2);

        System.out.println(outroLivro);       
    }

}