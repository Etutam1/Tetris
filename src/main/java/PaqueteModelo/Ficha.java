/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import java.util.ArrayList;

/**
 *
 * @author matut
 */
public abstract class Ficha {

    //ATRIBUTOS
    public ArrayList<Cadrado> cadrados = new ArrayList<>();
    public Xogo xogo;

    //CONSTRUCTOR
    public Ficha(Xogo xogo) {
        this.xogo=xogo;
    }

    //SETTER AND GETTER
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
        return false;
    }

    public abstract boolean rotar();

    
    }


