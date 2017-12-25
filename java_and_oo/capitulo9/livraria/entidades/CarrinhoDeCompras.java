package livraria.entidades;

public class CarrinhoDeCompras {
    private double total = 0;
    private IProduto[] produtos = new IProduto[10];
    private int contador = 0;

    public void adiciona(IProduto produto) {
        System.out.println("Adicionado: " + produto);
        produtos[contador] = produto;
        contador++;
        total += produto.getValor();
    }

    /**
     * @return the produtos
     */
    public IProduto[] getProdutos() {
        return produtos;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }
    
}