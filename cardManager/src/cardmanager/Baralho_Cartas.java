/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardmanager;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Juliano Rodovalho & Lucas Capanelli
 */
public class Baralho_Cartas {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> ladoA;
    private ArrayList<Carta> ladoB;
    private String cartaFim;
    private String cartaInicio;

    /**
     * Metodo que cria o baralho
     *
     * @param numCartas
     * @param naipes
     */
    public void Baralho_Cartas(int numCartas, String[] naipes) {

        this.cartas = new ArrayList<>();
        this.ladoA = new ArrayList<>();
        this.ladoB = new ArrayList<>();
        this.newBaralho(numCartas, naipes);

    }

    public void newBaralho(int numCartas, String[] naipes) {


        for (int i = 0; i < naipes.length; i++) {
            for (int j = 0; j < (numCartas / 4); j++) {
                cartas.add(new Carta(j, naipes[i]));
            }
        }
    }

    /**
     * Método que retorna o número de cartas existentes no baralho.
     *
     * @return número de cartas no baralho
     */
    int getNumCartas() {

        return this.cartas.size();

    }

    /**
     * Método responsável por embaralhar o montante de cartas
     */
    public void embaralha() {

        Collections.shuffle(cartas);

    }

    /**
     * Método responsável por cortar o baralho em duas partes iguais;
     */
    public void cortarBaralho() {
        int tamLista = getNumCartas();
        int i = 0;
        int meioLista = (tamLista / 2);


        for (int j = 0; j < tamLista; j++) {
            if (i <= meioLista) {
                // cartas.add(new Carta(j, naipes[i]));
                ladoA.add(cartas.get(j));
                i++;

            } else if (i > meioLista) {
                ladoB.add(cartas.get(j));
                i++;

            }
        }

    }

    /**
     * Método responsável por mover uma carta do inicio;
     */
    public String retirarCartaInicio() {

        int j = 0;

        for (Carta carta : cartas) {
            for (; j < 1; j++) {

                cartaInicio = ((carta.getNumCarta() + 1) + " - " + carta.getNaipeCarta()).toString();

            }

        }

        return cartaInicio;

    }

    /**
     * Método responsável por retirar uma carta do final;
     */
    public String retirarCartaFim() {

        int numCartas = getNumCartas();
        int j;

        for (Carta carta : cartas) {
            for (j = numCartas; j >= numCartas; j--) {


                this.cartaFim = ((carta.getNumCarta() + 1) + " - " + carta.getNaipeCarta()).toString();

                //System.out.print("passou " + j);
            }

        }

        return this.cartaFim;

    }

    /*
     * Método responsável por mover uma carta do inicio para o final do baralho.
     */
    public void moveCartaIniFim() {
    }

    /**
     * Método responsável por criar o monte de descarte para o jogo. Neste
     * método é possivel visualizar as cartas sem move-las;
     */
    public void criaMonteDescarte() {
    }

    public void monteCompra() {
    }

    /**
     * imprime todo o array de cartas do baralho, mostrando seus números naipes.
     */
    public void getBaralho() {

        for (Carta carta : cartas) {
            System.out.println((carta.getNumCarta() + 1) + " " + carta.getNaipeCarta());
        }

//        for (Carta lado : ladoA) {
//            System.out.println("Lado A: " + (lado.getNumCarta() + 1) + " - " + lado.getNaipeCarta());
//        }
//
//        for (Carta lado : ladoB) {
//            System.out.println("Lado B: " + (lado.getNumCarta() + 1) + " - " + lado.getNaipeCarta());
//        }


    }
}