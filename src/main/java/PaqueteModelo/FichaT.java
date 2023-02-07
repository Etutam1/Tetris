/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import java.awt.Color;

/**
 *
 * @author matut
 */
public class FichaT extends Ficha {

    public Cadrado cadrado1 = new Cadrado(xogo.MAX_X/2, 0, Color.MAGENTA);
    public Cadrado cadrado2 = new Cadrado(cadrado1.getX() + xogo.LADO_CADRADO, cadrado1.getY(), Color.MAGENTA);
    public Cadrado cadrado3 = new Cadrado(cadrado2.getX() + xogo.LADO_CADRADO, cadrado2.getY(), Color.MAGENTA);
    public Cadrado cadrado4 = new Cadrado(cadrado2.getX(), cadrado2.getY() + xogo.LADO_CADRADO, Color.MAGENTA);

    //CONSTRUCTOR
    public FichaT(Xogo xogo) {
        super(xogo);
        xogo.ventanaPrincipal.pintarCadrado(cadrado1.lblCadrado);
        xogo.ventanaPrincipal.pintarCadrado(cadrado2.lblCadrado);
        xogo.ventanaPrincipal.pintarCadrado(cadrado3.lblCadrado);
        xogo.ventanaPrincipal.pintarCadrado(cadrado4.lblCadrado);
        cadrados.add(cadrado1);
        cadrados.add(cadrado2);
        cadrados.add(cadrado3);
        cadrados.add(cadrado4);
    }

    //METODOS
    @Override
    public boolean rotar() {
        return false;
    }

}
