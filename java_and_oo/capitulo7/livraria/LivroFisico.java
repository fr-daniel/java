/**
 * LivroFisico
 */
public class LivroFisico extends Livro implements IPromocional {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem <= 0.3) {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
            return true;
        }
        return false;
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }
    
}