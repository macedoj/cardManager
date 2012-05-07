/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardmanager;

/**
 * @author Juliano Rodovalho & Lucas Capanelli
 */
public class Main_Jogo {

    public static int numCartas = 52;
    public static String[] naipes = new String[4];

    public static void main(String[] args) {

        naipes[0] = "Ouros";
        naipes[1] = "Paus";
        naipes[2] = "Copas";
        naipes[3] = "Espadas";

        Baralho_Cartas baralho = new Baralho_Cartas();

        baralho.Baralho_Cartas(numCartas, naipes);

        System.out.println("Número de Cartas no Baralho: " + baralho.getNumCartas());
        baralho.cortarBaralho();
        baralho.getBaralho();
        //baralho.embaralha();
        //baralho.getBaralho();

        System.out.println("Carta do início: " + baralho.retirarCartaInicio());

        System.out.println("Carta do Final: " + baralho.retirarCartaFim());
    }
}
