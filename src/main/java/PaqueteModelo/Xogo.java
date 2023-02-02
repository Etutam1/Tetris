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
    public final int MAX_Y;
    public boolean pausa;
    public int numeroLineas;
    public VentanaPrincipal ventanaPrincipal;
    public Ficha fichaActual;
    public ArrayList<Cadrado> cadradosChan = new ArrayList<>();
    private Iterator<Cadrado> iterator;

    //CONSTRUCTOR
    public Xogo(boolean pausa, int numeroLineas, VentanaPrincipal ventanaPrincipal) {

        this.MAX_X = 400;
        this.MAX_Y = 800;
        this.pausa = pausa;
        this.numeroLineas = numeroLineas;
        this.ventanaPrincipal = ventanaPrincipal;
        this.fichaActual = new FichaCadrada(this);  //crearFichaAleatoria(this);

        //moverFichaAbaixo();
    }

    public void moverFichaDereita() {

    }

    public void moverFichaEsquerda() {

    }

    public void RotarFicha() {

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

        int numAleatorio = (int) (Math.random() * 4 + 1);
        System.out.println(numAleatorio);
        if (numAleatorio == 1) {
            this.fichaActual = new FichaCadrada(this);

        }
        if (numAleatorio == 2) {
            this.fichaActual = new FichaCadrada(this);

        }
        if (numAleatorio == 3) {
            this.fichaActual = new FichaCadrada(this);

        }
        if (numAleatorio == 4) {
            this.fichaActual = new FichaCadrada(this);

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
            if (cadrado.getLblCadrado().getY() == this.MAX_Y - Xogo.LADO_CADRADO) {
                cadrado.setX(cadrado.lblCadrado.getX());
                cadrado.setY(cadrado.lblCadrado.getY());
                cadrado.getLblCadrado().setLocation(cadrado.getX(), cadrado.getY());
                System.out.println("TOCACHAN: " + String.valueOf(cadrado.getLblCadrado().getLocation()) + "  ");
                tocaChan = true;

            }

            if (tocaChan) {
                this.cadradosChan.addAll(fichaActual.cadrados);
                iterator = cadradosChan.iterator();
                Cadrado c = iterator.next();
                while (iterator.hasNext()) {
                    System.out.println("arraychan: " + c.getCoordenadas() + "  ");
                    System.out.println("CADRADOSCHAN " + this.cadradosChan.size());
                }

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
