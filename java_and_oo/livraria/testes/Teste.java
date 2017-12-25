package livraria.testes;

import java.io.FileNotFoundException;
import java.util.List;

import livraria.entidades.CarrinhoDeCompras;
import livraria.entidades.IProduto;;

/**
 * Teste
 */
public class Teste {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        try {
            List<IProduto> produtos = carrinho.getProdutos();
            for (IProduto produto : produtos) {
                System.out.println(produto);
            }  
        } catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Foi uma das duas!");
        } 
        finally {

        }

        /*
        try {
            abreArquivo();
        } catch(FileNotFoundException e1) {
            System.out.println("Não consegui abrir o arquivo.");
        }

        System.out.println("Fui executado!");
        */

        
    }

    public static void abreArquivo() throws FileNotFoundException {
        new java.io.FileInputStream("arquvi.txt");
    }
    
}