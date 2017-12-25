package livraria.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import livraria.Autor;
import livraria.entidades.Ebook;
import livraria.entidades.IProduto;
import livraria.entidades.LivroFisico;

/**
 * OrdenandoComJava
 */
public class OrdenandoComJava {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Java 8 Prático");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java 8 Prático");
        ebook.setValor(29.90);

        Ebook ebook2 = new Ebook(autor);
        ebook2.setNome("Java 9 Prático");
        ebook2.setValor(29.91);

        List<IProduto> produtos = Arrays.asList(fisico, ebook, ebook2);

        Collections.sort(produtos);

        for (IProduto produto : produtos) {
            System.out.println(produto.getValor());
        }
        
    }
    
}