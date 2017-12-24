/**
 * CarrinhoDeCompras
 */
public class CarrinhoDeCompras {
    private double total = 0;

    public void adiciona(Livro livro) {
        System.out.println("Adicionado: " + livro);
        livro.aplicaDescontoDe(0.05);
        total += livro.getValor();
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }
    
}