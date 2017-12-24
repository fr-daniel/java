/**
 * RegrasDeDesconto
 */
public class RegrasDeDesconto {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.adicionaValor(59.90);

        System.out.println("Valor atual: " + livro.retornaValor());

        if(!livro.aplicaDesconto(0.35)) {
            System.out.println("Desconto não pode ser maior que 30%!");
        } else {
            System.out.println("Valor do livro com desconto: " + livro.retornaValor());
        }
    }
    
}