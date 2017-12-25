package livraria.entidades;

@FunctionalInterface
public interface IProduto extends Comparable<IProduto> {
    double getValor();

    default int compareTo(IProduto outro) {
        return Double.compare(this.getValor(), outro.getValor());
    }
}