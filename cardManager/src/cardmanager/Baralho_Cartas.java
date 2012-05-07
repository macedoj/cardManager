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
        this.newBaralho(naipes);

    }

    public void newBaralho(String[] naipes) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
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
    public void retirarCartaInicio() {
    }

    /**
     * Método responsável por retirar uma carta do final;
     */
    public void retirarCartaFim() {
    }

    /*
     * Método responsável por mover uma carta do inicio para o final do baralho.
     */
    public void moveCartaIniFm() {
    }

    /**
     * Método responsável por criar o monte de descarte para o jogo. Neste
     * método é possivel visualizar as cartas sem move-las;
     */
    public void criaMonteDescarte() {
    }

    /**
     * Não sei exatamente o que essa porra vai fazer... mas pelo visto é
     * necessário.
     */
    public void monteCompra() {
    }

    /**
     * imprime todo o array de cartas do baralho, mostrando seus números naipes.
     */
    public void getBaralho() {

        for (Carta carta : cartas) {
            System.out.println((carta.getNumCarta() + 1) + " " + carta.getNaipeCarta());
        }

        for (Carta lado : ladoA) {
            System.out.println("Lado A: " + (lado.getNumCarta() + 1) + " - " + lado.getNaipeCarta());
        }

        for (Carta lado : ladoB) {
            System.out.println("Lado B: " + (lado.getNumCarta() + 1) + " - " + lado.getNaipeCarta());
        }


    }
}