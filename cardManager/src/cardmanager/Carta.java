/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardmanager;

/**
 * @author Juliano Rodovalho & Lucas Capanelli
 */
class Carta {

    private int numCarta;
    private String naipeCarta;

    /**
     * Construtor da classe CartaBara
     *
     * @param numeroCarta
     * @param naipes
     */
    public Carta(int numeroCarta, String naipes) {

        numCarta = numeroCarta;
        naipeCarta = naipes;

    }

    /**
     * 
     * @return int numCarta
     */
    public int getNumCarta() {

        return numCarta;
    }

    /**
     * 
     * @return String naipeCarta
     */
    public String getNaipeCarta() {

        return naipeCarta;
    }

    /**
     * 
     * @param numeroCarta 
     */
    public void setNumCarta(int numeroCarta) {

        this.numCarta = numeroCarta;
    }

    /**
     * 
     * @param naipes 
     */
    public void setNaipeCarta(String naipes) {

        this.naipeCarta = naipes;
    }
}