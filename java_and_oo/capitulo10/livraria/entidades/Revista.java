package livraria.entidades;

import livraria.Editora;

public class Revista implements IProduto, IPromocional {
    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if(porcentagem <= 0.1) {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
            return true;
        }
        return false;
    }
}