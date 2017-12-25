package livraria.entidades;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private double total = 0;
    private List<IProduto> produtos;
    private int contador = 0;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adiciona(IProduto produto) {
        this.produtos.add(produto);
        total += produto.getValor();
    }

    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }

    /**
     * @return the produtos
     */
    public List<IProduto> getProdutos() {
        return produtos;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }
    
}