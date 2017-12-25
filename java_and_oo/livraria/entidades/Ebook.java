package livraria.entidades;

import livraria.Autor;

public class Ebook extends Livro implements IPromocional {
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    /**
     * @param waterMark the waterMark to set
     */
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    /**
     * @return the waterMark
     */
    public String getWaterMark() {
        return waterMark;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem <= 0.15) {
            double desconto = this.getValor() * porcentagem;
            this.setValor(this.getValor() - desconto);
            return true;
        }
        return false;
    }
    
}