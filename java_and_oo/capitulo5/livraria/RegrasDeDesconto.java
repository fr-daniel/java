/**
 * RegrasDeDesconto
 */
public class RegrasDeDesconto {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro livro = new Livro(autor);
        livro.setValor(59.90);

        System.out.println("Valor atual: " + livro.getValor());

        if(!livro.aplicaDescontoDe(0.35)) {
            System.out.println("Desconto não pode ser maior que 30%!");
        } else {
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        System.out.println("Valor atual: " + ebook.getValor());

        if(!ebook.aplicaDescontoDe(0.20)) {
            System.out.println("Desconto não pode ser maior que 15%!");
        } else {
            System.out.println("Valor do livro com desconto: " + ebook.getValor());
        }

    }
    
}