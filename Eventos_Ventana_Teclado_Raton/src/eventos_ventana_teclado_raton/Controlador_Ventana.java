/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_ventana_teclado_raton;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author User
 */
class Controlador_Ventana implements WindowListener {

    Vista vista;

    public Controlador_Ventana(Vista vista) {
        this.vista = vista;
    }

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

}

