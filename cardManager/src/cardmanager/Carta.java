/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardmanager;

/**
 * Universidade Federal do Pampa;
 * Graduação: Engenharia de Software; 
 * Disciplina: Práticas de Desenvolvimento de Software;
 * Professor: Wagner de Melo Reck;
 * Semestre: 5° - 2012/01
 *
 * @author Juliano Rodovalho & Lucas Capanelli
 * @version 0.1
 */
public class Carta {

    private int numCarta;
    private String naipeCarta;

    /**
     * Construtor da classe Carta
     *
     * @param int numeroCarta
     * @param String naipes
     */
    public Carta(int numeroCarta, String naipes) {

        this.numCarta = numeroCarta;
        this.naipeCarta = naipes;

    }

    /**
     * Responsável por buscar o valor da variável numCarta.
     *
     * @return int numCarta
     */
    public int getNumCarta() {

        return numCarta;
    }

    /**
     * Responsável por setar o valor da variável numeCarta, 
     * a partir da informação recebida por parâmetro(numeroCarta).
     *
     * @param int numeroCarta
     */
    public void setNumCarta(int numeroCarta) {

        this.numCarta = numeroCarta;
    }

    /**
     *Responsável por buscar o valor da variável naipeCarta.
     * 
     * @return String naipeCarta
     */
    public String getNaipeCarta() {

        return naipeCarta;
    }

    /**
     * Responsável por setar o valor da variável naipeCarta, 
     * a partir da informação recebida por parâmetro(naipes).
     * 
     * @param String naipes
     */
    public void setNaipeCarta(String naipes) {

        this.naipeCarta = naipes;
    }
}