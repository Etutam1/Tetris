/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteModelo;

import java.awt.Color;

/**
 *
 * @author maste
 */
public class FichaZ  extends Ficha{
    public Cadrado cadrado1 = new Cadrado(160, 0, Color.YELLOW);
    public Cadrado cadrado2 = new Cadrado(cadrado1.getX() + xogo.LADO_CADRADO, cadrado1.getY(), Color.YELLOW);
    public Cadrado cadrado3 = new Cadrado(cadrado2.getX(), cadrado2.getY() + xogo.LADO_CADRADO, Color.YELLOW);
    public Cadrado cadrado4 = new Cadrado(cadrado3.getX() + xogo.LADO_CADRADO, cadrado3.getY(), Color.YELLOW);

    //CONSTRUCTOR
    public FichaZ(Xogo xogo) {
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