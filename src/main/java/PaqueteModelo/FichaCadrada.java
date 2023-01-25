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
public class FichaCadrada extends Ficha{
    
    //CONSTRUCTOR
    public FichaCadrada() {
        Cadrado cadrado1 = new Cadrado(0,1,Color.RED);
        Cadrado cadrado2 = new Cadrado(1,1,Color.RED);
        Cadrado cadrado3 = new Cadrado(1,1,Color.RED);
        Cadrado cadrado4 = new Cadrado(1,1,Color.RED);
    }
    
    //METODOS
    @Override
    public boolean rotar() {
        
        return false;
    }
    
}
