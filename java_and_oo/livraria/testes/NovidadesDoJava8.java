package livraria.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import livraria.Autor;
import livraria.comparators.ComparadorPorNome;
import livraria.entidades.Livro;
import livraria.entidades.LivroFisico;

/**
 * NovidadesDoJava8
 */
public class NovidadesDoJava8 {

    public static void main(String[] args) {
        Autor autor = new Autor();   
        autor.setNome("Rodrigo Turini");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.O.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        Livro estruturas = new LivroFisico(autor);
        estruturas.setNome("Estruturas de dados");

        List<Livro> livros = Arrays.asList(javaoo, estruturas, java8);

        //Collections.sort(livros, new ComparadorPorNome());

        /*livros.sort(new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getNome().compareTo(l2.getNome());
            }
        });*/

        /*livros.sort((Livro l1, Livro l2) -> {
            return l1.getNome().compareTo(l2.getNome());
        });*/

        livros.sort((l1, l2) -> l1.getNome().compareTo(l2.getNome()));

        //livros.sort(comparing(Livro::getNome));

        /*for (Livro livro : livros) {
            System.out.println(livro.getNome());
        }*/

        livros.forEach(l -> System.out.println(l.getNome()));

        Stream<Livro> stream = livros.stream();

        livros.stream().filter(l -> l.getNome().contains("tru"))
            .forEach(l -> System.out.println(l.getNome()));
    }
    
}