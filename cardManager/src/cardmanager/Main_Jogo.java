/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardmanager;

/**
 * Universidade Federal do Pampa
 * Graduação: Engenharia de Software
 * Disciplina: Práticas de Desenvolvimento de Software
 * Professor: Wagner de Melo Reck
 * Semestre: 5° - 2012/01 
 * 
 * @author Juliano Rodovalho & Lucas Capanelli
 * @version 0.1
 */
public class Main_Jogo {

    /**
     * Variáveis que definem as caracteristicas do baralho a ser criado.
     */
    public static int numCartas = 52;
    public static String[] naipes = new String[4];

    /**
     * Main do jogo, responsável por chamar os métodos e definições relevantes como, 
     * número de cartas, naipes e chamadas de métodos.
     * 
     * @param String[] args 
     */
    public static void main(String[] args) {

        /**
         * Criando 4 naipes para o baraho.
         */
        naipes[0] = "Ouros";
        naipes[1] = "Paus";
        naipes[2] = "Copas";
        naipes[3] = "Espadas";

        /**
         * Cria uma instância(Objeto) da classe Baralho_Cartas.java, 
         * a qual, jutamente com a classe Carta.java, são as bibliotecas.
         */
        Baralho_Cartas baralho = new Baralho_Cartas();

        /**
         * Chamada do construtor da biblioteca Baralho_Cartas, 
         * enviando as informações básicas para a criação do baralho.
         */
        baralho.Baralho_Cartas(numCartas, naipes);

        /**
         * Informações de impressão.
         */
        System.out.println("Número de Cartas no Baralho: " + baralho.getNumCartas());
        baralho.cortarBaralho();
        baralho.getBaralho();
        //baralho.embaralha();
        //baralho.getBaralho();

        System.out.println("Carta do início: " + baralho.retirarCartaInicio());

        System.out.println("Carta do Final: " + baralho.retirarCartaFim());
    }
}
