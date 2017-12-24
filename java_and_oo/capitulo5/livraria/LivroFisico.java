/**
 * LivroFisico
 */
public class LivroFisico extends Livro {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe() {
        if(porcentagem <= 0.3) {
            this.valor -= this.valor * porcentagem;
            return true;
        }
        return false;
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }
    
}