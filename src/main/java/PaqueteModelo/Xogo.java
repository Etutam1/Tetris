/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import PaqueteIU.VentanaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author matut
 */
public class Xogo {

    //ATRIBUTOS
    public final int LADO_CADRADO;
    public final int MAX_X;
    public final int MAX_Y;
    public boolean pausa;
    public int numeroLineas;
    public VentanaPrincipal ventanaPrincipal;
    public Ficha fichaActual;
    public ArrayList<Cadrado> cadradosChan;

    //CONSTRUCTOR
    public Xogo(int LADO_CADRADO, int MAX_X, int MAX_Y, boolean pausa, int numeroLineas, VentanaPrincipal ventanaPrincipal, Ficha fichaActual, ArrayList<Cadrado> cadradosChan) {
        this.LADO_CADRADO = LADO_CADRADO;
        this.MAX_X = MAX_X;
        this.MAX_Y = MAX_Y;
        this.pausa = pausa;
        this.numeroLineas = numeroLineas;
        this.ventanaPrincipal = ventanaPrincipal;
        this.fichaActual = fichaActual;
        this.cadradosChan = cadradosChan;
    }

    //METODOS
    public void moverFichaDereita() {

    }

    public void moverFichaEsquerda() {

    }

    public void RotarFicha() {

    }

    public void moverFichaAbaixo() {

    }

    public boolean ePosicionValida(int x, int y) {
        return true;
    }

    public void xenerarNovaFicha() {

    }

    public void engadirFichaAoChan() {

    }

    public void borrarLinasCompletas() {

    }

    public void borrarLina() {

    }

    public boolean chocaFichaCoChan() {
        return false;
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
