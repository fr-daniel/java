package livraria.entidades;

import livraria.Autor;
import livraria.exception.AutorNuloException;

public abstract class Livro implements IProduto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        if(autor == null)
            throw new AutorNuloException("O autor do livro não pode ser nulo.");
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

    /*
    public Livro(Autor autor) {
        this(
        this.autor = autor;
    }

    public Livro() {
        this.isbn = "000-00-00000-00-0";
    }
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
         this.autor = autor;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    @Override
    public String toString() {
        return "\nMostrando detalhes do livro" + "\nNome: " + nome + "\nDescrição: " + descricao + "\nValor: " + valor + "\nISBN: " + isbn + autor.toString() + "\n---";
    }
}