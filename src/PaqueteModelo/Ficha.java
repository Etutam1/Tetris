/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author matut
 */
public abstract class Ficha {

    //ATRIBUTOS
    public ArrayList<Cadrado> cadrados = new ArrayList<>();
    public Xogo xogo;
    public Iterator<Cadrado> iterator;
    public int posicion = 0;

    //CONSTRUCTOR
    public Ficha(Xogo xogo) {
        this.xogo = xogo;
    }

    public Xogo getXogo() {
        return xogo;
    }

    public void setXogo(Xogo xogo) {
        this.xogo = xogo;
    }

    public Iterator<Cadrado> getIterator() {
        return iterator;
    }

    //SETTER AND GETTER
    public void setIterator(Iterator<Cadrado> iterator) {
        this.iterator = iterator;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public ArrayList<Cadrado> getCadrados() {
        return cadrados;
    }

    public void setCadrados(ArrayList<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }

    //METODOS 
    public boolean moverDereita() {
        iterator = cadrados.iterator();

        while (iterator.hasNext()) {
            Cadrado cadrado3 = iterator.next();
            cadrado3.getLblCadrado().setLocation(cadrado3.getLblCadrado().getX() + Xogo.LADO_CADRADO, cadrado3.getLblCadrado().getY());
            cadrado3.setX(cadrado3.getLblCadrado().getX());
            cadrado3.setY(cadrado3.getLblCadrado().getY());
           
        }
        return true;
    }

    public boolean moverEsquerda() {
        iterator = cadrados.iterator();

        while (iterator.hasNext()) {

            Cadrado cadrado2 = iterator.next();
            cadrado2.getLblCadrado().setLocation(cadrado2.getLblCadrado().getX() - Xogo.LADO_CADRADO, cadrado2.getLblCadrado().getY());
            cadrado2.setX(cadrado2.getLblCadrado().getX());
            cadrado2.setY(cadrado2.getLblCadrado().getY());
            
        }

        return true;
    }

    public boolean moverAbaixoConTecla() {
        iterator = cadrados.iterator();

        while (iterator.hasNext()) {
            Cadrado cadrado4 = iterator.next();
            cadrado4.getLblCadrado().setLocation(cadrado4.getLblCadrado().getX(), cadrado4.getLblCadrado().getY() + Xogo.LADO_CADRADO);
            cadrado4.setX(cadrado4.getLblCadrado().getX());
            cadrado4.setY(cadrado4.getLblCadrado().getY());
            
        }
        return true;

    }

    public boolean moverAbaixo() {
        iterator = cadrados.iterator();

        while (iterator.hasNext()) {
            Cadrado cadrado1 = iterator.next();
            cadrado1.getLblCadrado().setLocation(cadrado1.getLblCadrado().getX(), cadrado1.getLblCadrado().getY() + Xogo.LADO_CADRADO);
            cadrado1.setX(cadrado1.getLblCadrado().getX());
            cadrado1.setY(cadrado1.getLblCadrado().getY());
            xogo.ventanaPrincipal.pintarCadrado(cadrado1.getLblCadrado());
//            System.out.println(cadrado1.getCoordenadas() + "    " + String.valueOf(cadrado1.getLblCadrado().getX()) + " " + String.valueOf(cadrado1.getLblCadrado().getY()));
        }
        return true;
    }

    public abstract boolean rotar();
}
