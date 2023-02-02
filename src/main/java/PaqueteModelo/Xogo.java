/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import PaqueteIU.VentanaPrincipal;
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
    private Iterator<Cadrado> iterator2 = fichaActual.getIterator();

    //private Ficha[] fichas = {new FichaCadrada(this), new FichaT(this), new FichaBarra(this), new FichaBarra( this)};
    private Random random = new Random();

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

    //METODOS
    /*public Ficha crearFichaAleatoria(Xogo xogo) {
        int indiceAleatorio = random.nextInt(fichas.length);
        fichaActual = fichas[0];
        return fichaActual;
    }*/
    public void moverFichaDereita() {

    }

    public void moverFichaEsquerda() {

    }

    public void RotarFicha() {

    }

    public void moverFichaAbaixo() {
        fichaActual.moverAbaixo();
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
        boolean tocaChan = false;
        
        while (iterator2.hasNext()) {
            
            if (iterator2.next().lblCadrado.getY() == this.MAX_Y - Xogo.LADO_CADRADO) {                
                this.cadradosChan.add(iterator2.next());
                tocaChan = true;
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
