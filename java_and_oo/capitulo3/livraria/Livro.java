/**
 * Livro
 */
public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public void aplicarDesconto(double porcetagem) {
        this.valor -= this.valor * porcetagem;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        
        if(temAutor())
            autor.mostrarDetalhes();
        
        System.out.println("---");
    }
}