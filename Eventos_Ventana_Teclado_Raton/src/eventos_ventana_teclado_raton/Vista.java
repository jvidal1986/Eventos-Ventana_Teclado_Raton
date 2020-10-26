/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos_ventana_teclado_raton;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Vista extends JFrame {
     private final String MAXIMIZADO = "Ventana maximizada";
    private final String MINIMIZADO = "Ventana minimizada";
    private final String CERRADO = "Ventana cerrada";
    private final String LETRA = "Letra:";
    private final String COORDENADA_X = "Coordenada x->";
    private final String COORDENADA_Y = "Coordenada y->";
    private final String DENTRO_DE = "Dentro de: ";
    private JLabel estrella_Label;

    private JLabel carcter_Label;
    private JLabel coordenadaX_Label;
    private JLabel coordenadaY_Label;

    private JLabel dentroDe_JLabel;

    private Controlador_Ventana controlador_Ventana;

    public Vista() {
        controlador_Ventana = new Controlador_Ventana(this);
        this.addWindowListener(controlador_Ventana);
        anadirPanel_Estrella();
        anadir_Panel_Caracter_Coordenadas_Label();
        anadir_Panel_TextField_Dentro_De();

        iniciar_ventana();
    }

    private void iniciar_ventana() {
        this.setLayout(new GridLayout(3, 1));
        this.setSize(700, 700);
        this.setVisible(true);
    }

    public void escribir_Maximizado() {
        System.out.println(MAXIMIZADO);

    }

    public void escribir_Minimizado() {
        System.out.println(MINIMIZADO);

    }

    public void escribir_Cerrado() {
        System.out.println(CERRADO);

    }

    private void anadirPanel_Estrella() {
        JPanel panel_Estrella = new JPanel();

        this.add(panel_Estrella);
        estrella_Label = new JLabel();

        ImageIcon imagen_Estrella_Amarilla = new ImageIcon(getClass().getResource("/imagenes/estrella.jpg"));
        ImageIcon imagen_Estrella_Amarilla_2 = new ImageIcon(imagen_Estrella_Amarilla.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        estrella_Label.setIcon(imagen_Estrella_Amarilla_2);
        panel_Estrella.add(estrella_Label);

    }

    private void anadir_Panel_Caracter_Coordenadas_Label() {
        JPanel panel_Caracter_Coord = new JPanel();
        panel_Caracter_Coord.setLayout(new GridLayout(1,1));
        this.add(panel_Caracter_Coord);

        JPanel caracter_Panel = new JPanel();
        caracter_Panel.setBackground(Color.RED);
        carcter_Label = new JLabel(LETRA);
        caracter_Panel.add(carcter_Label);
        panel_Caracter_Coord.add(caracter_Panel);
        
        JPanel panel_Coord=new JPanel();
        panel_Coord.setLayout(new GridLayout(2,1));
        panel_Coord.setBackground(Color.CYAN);
        coordenadaX_Label = new JLabel(COORDENADA_X);
        coordenadaY_Label = new JLabel(COORDENADA_Y);

        panel_Coord.add(coordenadaX_Label);
        panel_Coord.add(coordenadaY_Label);
        panel_Caracter_Coord.add(panel_Coord);
    }

    private void anadir_Panel_TextField_Dentro_De() {
        JPanel panel_Dentro_Label = new JPanel();
        panel_Dentro_Label.setBackground(Color.ORANGE);
        this.add(panel_Dentro_Label);
        dentroDe_JLabel = new JLabel(DENTRO_DE);
        panel_Dentro_Label.add(dentroDe_JLabel);
    }
}
