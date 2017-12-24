/**
 * CalculadoraDeEstoque
 */
public class CalculadoraDeEstoque {

    public static void main(String[] args) {
        double soma = 0;
        double valorDoLivro = 59.90;

        /*while(contador < 35) {
            soma += valorDoLivro;
            contador++;    
        }*/

        for(int contador = 0; contador < 35; contador++) {
            soma += valorDoLivro;
        }

        System.out.println("O total em estoque é " + soma + ".");

        if(soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if(soma> 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom.");
        }
    }

}