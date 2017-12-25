package livraria.testes;

import java.io.FileNotFoundException;
import java.util.List;

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
        
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);
        
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);
    
        System.out.println("Total: " + carrinho.getTotal());
        
        try {
            List<IProduto> produtos = carrinho.getProdutos();
            for (IProduto produto : produtos) {
                System.out.println(produto);
            }  
        } catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Foi uma das duas!");
        } 
    }

}