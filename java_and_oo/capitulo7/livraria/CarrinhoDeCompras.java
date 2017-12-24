/**
 * CarrinhoDeCompras
 */
public class CarrinhoDeCompras {
    private double total = 0;

    public void adiciona(IProduto produto) {
        System.out.println("Adicionado: " + produto);
        total += produto.getValor();
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }
    
}