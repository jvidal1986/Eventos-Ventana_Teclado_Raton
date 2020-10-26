/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_ventana_teclado_raton;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
class Controlador_Ventana implements WindowListener, MouseListener, KeyListener {

    Vista vista;

    public Controlador_Ventana(Vista vista) {
        this.vista = vista;
    }

    /*
    Eventos Ventana
     */
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        vista.escribir_Cerrado();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        vista.escribir_Minimizado();
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        vista.escribir_Maximizado();
    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    /*
    Eventos Ratón
     */
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JLabel imagen = (JLabel) e.getSource();

        vista.cambiar_Icono_Label_Estrella(vista.getImagen_Estrella_Azul());
        vista.repaint();

    }

    @Override
    public void mouseExited(MouseEvent e) {
        vista.cambiar_Icono_Label_Estrella(vista.getImagen_Estrella_Amarilla());
        vista.repaint();
    }

    /*
    Eventos teclado
     */
    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        vista.cambiar_caracterLabel(letra);
        vista.repaint();

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        char letra = e.getKeyChar();
        vista.cambiar_caracterLabel(letra);
        vista.repaint();
    }

}
