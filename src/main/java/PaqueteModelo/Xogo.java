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
        this.MIN_Y = 0;
        this.MIN_X = 0;
        this.pausa = pausa;
        this.numeroLineas = numeroLineas;
        this.ventanaPrincipal = ventanaPrincipal;
        this.fichaActual = new FichaCadrada(this);
    }

//    public boolean ePosicionValida(int x, int y) {
//        boolean posicionValida = false;
//        iterator = fichaActual.cadrados.iterator();
//       
//        if (x < MAX_X && x >= MIN_X && y < MAX_Y + LADO_CADRADO && y >= MIN_Y) {
//            posicionValida = true;
//        }
//        while (iterator.hasNext()) {
//             Cadrado cadradoComprobado = iterator.next();
//            if (cadradoComprobado.getLblCadrado().getX() == x && cadradoComprobado.getLblCadrado().getY() + LADO_CADRADO == y) {
//                posicionValida = false;
//            }
//        }
//        return posicionValida;
//    }

    public void moverFichaAbaixo() {
        if (chocaFichaCoChan() == false) {
            fichaActual.moverAbaixo();
            if (chocaFichaCoChan() == true) {
                System.out.println("ENTRO");
                xenerarNovaFicha();
            }
        }
    }

    public void moverFichaDereita() {
        fichaActual.moverDereita();
    }

    public void moverFichaEsquerda() {
//        iterator = fichaActual.cadrados.iterator();
//        
//        while (iterator.hasNext()) {
//            Cadrado cadradoActual = iterator.next();
//            if (ePosicionValida(cadradoActual.getLblCadrado().getX(), cadradoActual.getLblCadrado().getY()) == true) {
                fichaActual.moverEsquerda();
//            }
//        }
    }

    public void RotarFicha() {

    }

    public void xenerarNovaFicha() {

        int numAleatorio = (int) (Math.random() * 5 + 1);
        System.out.println("NUMERO RANDOM" + numAleatorio);
        if (numAleatorio == 1) {
            fichaActual = new FichaCadrada(this);

        }
        if (numAleatorio == 2) {
            fichaActual = new FichaBarra(this);

        }
        if (numAleatorio == 3) {
            fichaActual = new FichaT(this);

        }
        if (numAleatorio == 4) {
            fichaActual = new FichaL(this);

        }
        if (numAleatorio == 5) {
            fichaActual = new FichaZ(this);
        }
        pintarFicha();
    }

    public void pintarFicha() {
        iterator = fichaActual.getCadrados().iterator();
        
        while (iterator.hasNext()) {
            Cadrado cadrado = iterator.next();
            ventanaPrincipal.pintarCadrado(cadrado.getLblCadrado());
        }
    }

    public boolean chocaFichaCoChan() {
        boolean tocaChan = false;
        iterator = fichaActual.cadrados.iterator();

        while (iterator.hasNext()) {
            Cadrado cadrado = iterator.next();
            if (cadrado.getLblCadrado().getY() >= this.MAX_Y - Xogo.LADO_CADRADO /*|| !ePosicionValida(cadrado.getX(), cadrado.getY() + LADO_CADRADO*/)  {

                System.out.println("TOCACHAN: " + String.valueOf(cadrado.getLblCadrado().getLocation()) + "  ");
                tocaChan = true;
            }
        }
        if (tocaChan == true) {
            this.engadirFichaAoChan();
            iteratorChan = cadradosChan.iterator();

            while (iteratorChan.hasNext()) {

                System.out.println("COORDS CHAN : " + iteratorChan.next().getCoordenadas() + "\n ------------------");
            }
        }
        return tocaChan;
    }

    public void engadirFichaAoChan() {
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
