/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

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
        iterator = cadrados.iterator();
        boolean flag = true;
        while (iterator.hasNext()) {
            Cadrado c = iterator.next();
            if (c.lblCadrado.getY() <= xogo.ventanaPrincipal.getPanelJuego().getHeight() - (Xogo.LADO_CADRADO) * 2) {
                c.lblCadrado.setLocation(c.lblCadrado.getX(), c.lblCadrado.getY() + Xogo.LADO_CADRADO);        
            } else {
                xogo.cadradosChan.add(c);
                iterator.remove();
                
                
                
                
                
                
                //cadrados.removeAll(cadrados);
            } 
        }
        for (int i = 0; i < xogo.cadradosChan.size(); i++) {
                    xogo.cadradosChan.get(i).lblCadrado.setLocation(xogo.cadradosChan.get(i).lblCadrado.getX(),  700);
                }

        return true;
    }

    public abstract boolean rotar();

}
