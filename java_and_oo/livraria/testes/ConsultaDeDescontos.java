package livraria.testes;

import livraria.entidades.GerenciadorDeCupons;

/**
 * ConsultaDeDescontos
 */
public class ConsultaDeDescontos {

    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
        
        if(gerenciador.validaCupom("CUP1234")) {
            System.out.println("Cupom válido.");
        } else {
            System.out.println("Esse cupom não existe!");
        }
    }

}