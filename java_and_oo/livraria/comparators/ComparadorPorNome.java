package livraria.comparators;

import java.util.Comparator;

import livraria.entidades.Livro;

/**
 * ComparadorPorNome
 */
public class ComparadorPorNome implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return l2.getNome().compareTo(l2.getNome());
    }
    
}