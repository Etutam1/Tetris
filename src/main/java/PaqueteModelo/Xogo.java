/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import PaqueteIU.VentanaPrincipal;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author matut
 */
public class Xogo {

    //ATRIBUTOS
    public final static int LADO_CADRADO = 40;
    public final int MAX_X;
    public final int MIN_Y;
    public final int MAX_Y;
    public final int MIN_X;
    public int comprobante = 0;
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
        this.MIN_X = 0 ;
        this.MAX_Y = 800;
        this.MIN_Y = 0;
        this.pausa = pausa;
        this.numeroLineas = numeroLineas;
        this.ventanaPrincipal = ventanaPrincipal;

    }

    public boolean ePosicionValida(int x, int y) {
        boolean posicionValida = false;
        if (x < MAX_X && x >= MIN_X && y < MAX_Y && y >= MIN_Y) {
            posicionValida = true;
        }
        iteratorChan = cadradosChan.iterator();
        while (iteratorChan.hasNext()) {
            Cadrado cadradoComprobado = iteratorChan.next();
            if (cadradoComprobado.getLblCadrado().getX() == x && cadradoComprobado.getLblCadrado().getY() == y) {
                posicionValida = false;
            }
        }

        return posicionValida;
    }

    public void moverFichaAbaixo() {

        if (chocaFichaCoChan()) {
            System.out.println("ENTRO");  
            this.engadirFichaAoChan();
            xenerarNovaFicha();
        } else {
            fichaActual.moverAbaixo();
            
        }
    }

    public void moverFichaDereita() {
        iterator = fichaActual.cadrados.iterator();
        boolean podeMover = true;

        while (iterator.hasNext()) {
            Cadrado actual = iterator.next();

            if (!ePosicionValida(actual.getLblCadrado().getX() + Xogo.LADO_CADRADO, actual.getLblCadrado().getY())) {
                podeMover = false;
            }

            System.out.println(ePosicionValida(actual.getLblCadrado().getX() + Xogo.LADO_CADRADO, actual.getLblCadrado().getY()));
        }
        if (podeMover) {
            fichaActual.moverDereita();
        }
    }

    public void moverFichaEsquerda() {
        iterator = fichaActual.cadrados.iterator();
        boolean podeMover = true;

        while (iterator.hasNext()) {
            Cadrado actual = iterator.next();

            if (!ePosicionValida(actual.getLblCadrado().getX() - Xogo.LADO_CADRADO, actual.getLblCadrado().getY())) {
                podeMover = false;
            }

            System.out.println(ePosicionValida(actual.getLblCadrado().getX() - Xogo.LADO_CADRADO, actual.getLblCadrado().getY()));
        }
        if (podeMover) {
            fichaActual.moverEsquerda();
        }
    }

    public void RotarFicha() {
        fichaActual.rotar();
    }

    public void xenerarNovaFicha() {

        int numAleatorio = (int) (Math.random() * 7 + 1);
        System.out.println("NUMERO RANDOM" + numAleatorio);
        if(comprobante == numAleatorio){
            numAleatorio = (int) (Math.random() * 7 + 1);
        }
        if (numAleatorio == 1) {
            fichaActual = new FichaCadrada(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 2) {
            fichaActual = new FichaBarra(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 3) {
            fichaActual = new FichaT(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 4) {
            fichaActual = new FichaL(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 5) {
            fichaActual = new FichaZ(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 6) {
            fichaActual = new FichaLInversa(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 7) {
            fichaActual = new FichaZInversa(this);
            comprobante = numAleatorio;
        }
        pintarFicha();
    }

    public void pintarFicha() {
        iterator = fichaActual.getCadrados().iterator();

        while (iterator.hasNext()) {

            ventanaPrincipal.pintarCadrado(iterator.next().getLblCadrado());
        }
    }

    public boolean chocaFichaCoChan() {
        boolean tocaChan = false;
        iterator = fichaActual.cadrados.iterator();

        while (iterator.hasNext()) {
            Cadrado cadradoActual = iterator.next();
            if (!ePosicionValida(cadradoActual.getLblCadrado().getX(), cadradoActual.getLblCadrado().getY() + LADO_CADRADO)) {
                System.out.println("TOCACHAN: " + String.valueOf(cadradoActual.getLblCadrado().getLocation()) + "  ");
                tocaChan = true;
            }
        }
        return tocaChan;
    }

    public void engadirFichaAoChan() {

        iteratorChan = cadradosChan.iterator();

        while (iteratorChan.hasNext()) {

            System.out.println("COORDS CHAN : " + iteratorChan.next().getCoordenadas() + "\n ------------------");
        }
        cadradosChan.addAll(fichaActual.cadrados);
    }

    public void borrarLinasCompletas() {

    }

    public void borrarLina() {

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
