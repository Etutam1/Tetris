/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import PaqueteIU.VentanaPrincipal;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author matut
 */
public class Xogo {

    //ATRIBUTOS
    public final static int LADO_CADRADO = 40;
    public final int MAX_X;
    public final int MIN_X;
    public final int MAX_Y;
    public boolean pausa;
    public int numeroLineas;
    public VentanaPrincipal ventanaPrincipal;
    public Ficha fichaActual;
    public ArrayList<Cadrado> cadradosChan = new ArrayList<>();
    private Iterator<Cadrado> iterator;
    private Iterator<Cadrado> iteratorChan;

    //CONSTRUCTOR
    public Xogo(boolean pausa, int numeroLineas, VentanaPrincipal ventanaPrincipal) {

        this.MAX_X = 400;
        this.MAX_Y = 800;
        this.MIN_X = 0;
        this.pausa = pausa;
        this.numeroLineas = numeroLineas;
        this.ventanaPrincipal = ventanaPrincipal;
        this.fichaActual = new FichaCadrada(this);  //crearFichaAleatoria(this);

        //moverFichaAbaixo();
    }

    public void moverFichaDereita() {
        fichaActual.moverDereita();
    }

    public void moverFichaEsquerda() {
        fichaActual.moverEsquerda();
    }

    public void RotarFicha() {

    }

    public void moverFichaAbaixoConTecla() {
        fichaActual.moverAbaixoConTecla();
    }

    public void moverFichaAbaixo() throws InterruptedException {
        while (chocaFichaCoChan() == false) {
            fichaActual.moverAbaixo();
            sleep(200);
            if (chocaFichaCoChan() == true) {
                System.out.println("ENTRO");
                xenerarNovaFicha();

            }
        }

    }

    public boolean ePosicionValida(int x, int y) {
        return true;
    }

    public void xenerarNovaFicha() {

        int numAleatorio = (int) (Math.random() * 5 + 1);
        System.out.println("NUMERO RANDOM" + numAleatorio);
        if (numAleatorio == 1) {
            this.fichaActual = new FichaCadrada(this);

        }
        if (numAleatorio == 2) {
            this.fichaActual = new FichaBarra(this);

        }
        if (numAleatorio == 3) {
            this.fichaActual = new FichaT(this);

        }
        if (numAleatorio == 4) {
            this.fichaActual = new FichaL(this);

        }
        if (numAleatorio == 5) {
            this.fichaActual = new FichaZ(this);
        }

    }

    public void engadirFichaAoChan() {

    }

    public void borrarLinasCompletas() {

    }

    public void borrarLina() {

    }

    public boolean chocaFichaCoChan() {
        boolean tocaChan = false;
        iterator = fichaActual.cadrados.iterator();

        while (iterator.hasNext()) {
            Cadrado cadrado = iterator.next();
            if (cadrado.getLblCadrado().getY() >= this.MAX_Y - Xogo.LADO_CADRADO) {

                System.out.println("TOCACHAN: " + String.valueOf(cadrado.getLblCadrado().getLocation()) + "  ");
                tocaChan = true;

            }

        }
        if (tocaChan == true) {
            cadradosChan.addAll(fichaActual.cadrados);
            iteratorChan = cadradosChan.iterator();

            while (iteratorChan.hasNext()) {

                System.out.println("COORDS CHAN : " + iteratorChan.next().getCoordenadas() + "\n ------------------");

            }
        }
        return tocaChan;
    }

    //SETTERs AND GETTERs 
    public boolean isPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    public int getNumeroLineas() {
        return numeroLineas;
    }

    public void setNumeroLineas(int numeroLineas) {
        this.numeroLineas = numeroLineas;
    }

    public VentanaPrincipal getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public Ficha getFichaActual() {
        return fichaActual;
    }

    public void setFichaActual(Ficha fichaActual) {
        this.fichaActual = fichaActual;
    }

}
