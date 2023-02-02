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
    private Iterator<Cadrado> iterator;

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

    public ArrayList<Cadrado> getCadrados() {
        return cadrados;
    }

    public void setCadrados(ArrayList<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }

    //METODOS 
    public boolean moverDereita() {

        return false;
    }

    public boolean moverEsquerda() {

        return false;
    }

    public boolean moverAbaixo() {
        iterator = cadrados.iterator();

        while (iterator.hasNext()) {
            Cadrado c = iterator.next();
            c.lblCadrado.setLocation(c.lblCadrado.getX(), c.lblCadrado.getY() + Xogo.LADO_CADRADO);
            if (xogo.chocaFichaCoChan() && iterator.hasNext()) {
                iterator.next().lblCadrado.setBackground(Color.yellow);
                iterator.remove();
            }
        }
        return true;
    }

    public abstract boolean rotar();

}
