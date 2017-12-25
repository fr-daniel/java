package livraria.testes;

import java.io.FileNotFoundException;

import livraria.entidades.CarrinhoDeCompras;
import livraria.entidades.Ebook;
import livraria.entidades.LivroFisico;
import livraria.Autor;
import livraria.entidades.IProduto;

public class RegistroDeVendas {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        if(fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + fisico.getValor());
        }

        Ebook ebook = new Ebook(null);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);
        
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
    
        System.out.println("Total: " + carrinho.getTotal());
        
        try {
            IProduto[] produtos = carrinho.getProdutos();
            for(int i = 0; i <= produtos.length; i++) {
                IProduto produto = produtos[i];
                if(produto != null)
                    System.out.println(produto.getValor());
            }    
        } catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Foi uma das duas!");
        } 
        /* catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Deu exception no indice!");
        } catch(NullPointerException e) {
            System.out.println("O array não foi instânciado!");
        } */ finally {

        }

        try {
            abreArquivo();
        } catch(FileNotFoundException e1) {
            System.out.println("Não consegui abrir o arquivo.");
        }

        System.out.println("Fui executado!");
    }
    
    public static void abreArquivo() throws FileNotFoundException {
        new java.io.FileInputStream("arquvi.txt");
    }
}