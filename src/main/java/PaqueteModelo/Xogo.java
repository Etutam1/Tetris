/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import PaqueteIU.VentanaPrincipalFrame;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

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
    public VentanaPrincipalFrame ventanaPrincipal;
    public Ficha fichaActual;
    public ArrayList<Cadrado> cadradosChan;
    private Iterator<Cadrado> iterator;
    //private Ficha[] fichas = {new FichaCadrada(this), new FichaT(this), new FichaBarra(this), new FichaBarra( this)};
    private Random random = new Random();
    //CONSTRUCTOR
    public Xogo(boolean pausa, int numeroLineas, VentanaPrincipalFrame ventanaPrincipal) {
                this.LADO_CADRADO = 40;
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
        /* while (fichaActual.cadrados.get(3).y < this.MAX_Y) {
            for (int i = 0; i < fichaActual.cadrados.size(); i++) {
                fichaActual.cadrados.get(i).y = fichaActual.cadrados.get(i).y + 1;
            }
            pintarFicha();
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println(e);
            }   
        }*/
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

    public VentanaPrincipalFrame getVentanaPrincipal() {
        return ventanaPrincipal;
    }

    public void setVentanaPrincipal(VentanaPrincipalFrame ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public Ficha getFichaActual() {
        return fichaActual;
    }

    public void setFichaActual(Ficha fichaActual) {
        this.fichaActual = fichaActual;
    }

}
