package PaqueteModelo;

import PaqueteIU.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import javax.swing.Timer;

/**
 *
 * @author matut
 */
public class Xogo {

    //ATRIBUTOS
    public final static int LADO_CADRADO = 40;
    public final int MAX_X;
    public final int MIN_Y;
    public final int MAX_Y;
    public final int MIN_X;
    public int comprobante = 0;
    public boolean pausa;
    public int numeroLineas = 0;
    public VentanaPrincipal ventanaPrincipal;
    public Ficha fichaActual;
    public ArrayList<Cadrado> cadradosChan = new ArrayList<>();
    public ArrayList<Cadrado> cadradosBorrar = new ArrayList<>();
    public Iterator<Cadrado> iterator;
    public Iterator<Cadrado> iteratorChan;
    public Iterator<Cadrado> iteratorBorrar;
    public Timer timerComprobarLineas;
    public int level = 0;
    public boolean gameOver = false;

    //CONSTRUCTOR
    public Xogo(boolean pausa, VentanaPrincipal ventanaPrincipal) {

        this.MAX_X = 400;
        this.MIN_X = 0;
        this.MAX_Y = 800;
        this.MIN_Y = 0;
        this.pausa = pausa;
        this.ventanaPrincipal = ventanaPrincipal;

    }

    public boolean ePosicionValida(int x, int y) {
        boolean posicionValida = false;
        if (x < MAX_X && x >= MIN_X && y < MAX_Y && y >= MIN_Y) {
            posicionValida = true;
        }
        iteratorChan = cadradosChan.iterator();
        while (iteratorChan.hasNext()) {
            Cadrado cadradoComprobado = iteratorChan.next();
            if (cadradoComprobado.getLblCadrado().getX() == x && cadradoComprobado.getLblCadrado().getY() == y) {
                posicionValida = false;
            }
        }

        return posicionValida;
    }

    public void moverFichaAbaixo() {

        if (chocaFichaCoChan()) {
            System.out.println("\n" + "TOCO CHAN");

            this.engadirFichaAoChan();
            System.out.println("CADRADOSCHAN " + cadradosChan.size());
            xenerarNovaFicha();
        } else {
            fichaActual.moverAbaixo();

        }
    }

    public void moverFichaDereita() {
        iterator = fichaActual.cadrados.iterator();
        boolean podeMover = true;

        while (iterator.hasNext()) {
            Cadrado actual = iterator.next();

            if (!ePosicionValida(actual.getLblCadrado().getX() + Xogo.LADO_CADRADO, actual.getLblCadrado().getY())) {
                podeMover = false;
            }

        }
        if (podeMover) {
            fichaActual.moverDereita();
        }
    }

    public void moverFichaEsquerda() {
        iterator = fichaActual.cadrados.iterator();
        boolean podeMover = true;

        while (iterator.hasNext()) {
            Cadrado actual = iterator.next();

            if (!ePosicionValida(actual.getLblCadrado().getX() - Xogo.LADO_CADRADO, actual.getLblCadrado().getY())) {
                podeMover = false;
            }

        }
        if (podeMover) {
            fichaActual.moverEsquerda();
        }
    }

    public void RotarFicha() {
        fichaActual.rotar();
    }

    public void xenerarNovaFicha() {

        int numAleatorio = (int) (Math.random() * 7 + 1);
//        System.out.println("NUMERO RANDOM " + numAleatorio);
        if (comprobante == numAleatorio) {
            numAleatorio = (int) (Math.random() * 7 + 1);
        }
        if (numAleatorio == 1) {
            fichaActual = new FichaCadrada(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 2) {
            fichaActual = new FichaBarra(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 3) {
            fichaActual = new FichaZ(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 4) {
            fichaActual = new FichaZInversa(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 5) {
            fichaActual = new FichaT(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 6) {
            fichaActual = new FichaL(this);
            comprobante = numAleatorio;
        }
        if (numAleatorio == 7) {
            fichaActual = new FichaLInversa(this);
            comprobante = numAleatorio;
        }
        pintarFicha();
    }

    public void pintarFicha() {
        iterator = fichaActual.getCadrados().iterator();

        while (iterator.hasNext()) {

            ventanaPrincipal.pintarCadrado(iterator.next().getLblCadrado());
        }
    }

    public boolean chocaFichaCoChan() {
        boolean tocaChan = false;
        iterator = fichaActual.cadrados.iterator();

        while (iterator.hasNext()) {
            Cadrado cadradoActual = iterator.next();
            if (!ePosicionValida(cadradoActual.getLblCadrado().getX(), cadradoActual.getLblCadrado().getY() + LADO_CADRADO)) {
                tocaChan = true;
            }
        }
        return tocaChan;
    }

    public void engadirFichaAoChan() {
        cadradosChan.addAll(fichaActual.cadrados);

    }

    public void borrarLinasCompletas() throws ConcurrentModificationException {

        for (int y = this.MAX_Y - Xogo.LADO_CADRADO; y >= this.MIN_Y; y -= Xogo.LADO_CADRADO) {
            iteratorChan = cadradosChan.listIterator();
            int contadorCadrados = 0;
            System.out.println("y: " + y);

            while (iteratorChan.hasNext()) {
                Cadrado cadradoChan = iteratorChan.next();

                if (cadradoChan.lblCadrado.getY() == y) {
                    contadorCadrados++;
                    System.out.println("contadorCadrados: " + contadorCadrados);

                    if (contadorCadrados == 10) {
                        this.borrarLina(y);
                        sumarNumeroLineas();
                        moverCadradosChan(y);
                    }
                }
            }
        }
    }

    public void sumarNumeroLineas() {
        numeroLineas++;

    }

    public void borrarLina(int linea) {

        System.out.println("NUM LINEAS " + this.numeroLineas);
        iteratorChan = cadradosChan.listIterator();

        while (iteratorChan.hasNext()) {
            Cadrado cadradoBorrar = iteratorChan.next();
            if (cadradoBorrar.getLblCadrado().getY() == linea) {
                cadradosBorrar.add(cadradoBorrar);
                this.ventanaPrincipal.borrarCadrado(cadradoBorrar.lblCadrado);
            }
        }

        cadradosChan.removeAll(cadradosBorrar);
    }

    public void moverCadradosChan(int linea) {

        iteratorChan = cadradosChan.iterator();
        while (iteratorChan.hasNext()) {

            Cadrado cadradoABaixar = iteratorChan.next();
            if (cadradoABaixar.getY() < linea) {
                cadradoABaixar.getLblCadrado().setLocation(cadradoABaixar.getLblCadrado().getX(), cadradoABaixar.getLblCadrado().getY() + Xogo.LADO_CADRADO);
            }
        }
    }

    public void comprobarLineasCompletas() {
        this.timerComprobarLineas = new Timer(100, (ActionEvent e) -> {
            ventanaPrincipal.mostrarNumeroLineas(this.numeroLineas);
            try {
                borrarLinasCompletas();
            } catch (ConcurrentModificationException ex) {

                System.out.println("SE ESTÁ MODIFICANDO MIENTRAS SE ITERA EN LA LISTA");
            }
        });
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
