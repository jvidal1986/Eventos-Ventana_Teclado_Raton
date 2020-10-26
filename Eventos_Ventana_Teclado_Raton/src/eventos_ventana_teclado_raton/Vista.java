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
    private final String LETRA = "Letra: ";
    private final String COORDENADA_X = "Coordenada x->";
    private final String COORDENADA_Y = "Coordenada y->";
    private final String DENTRO_DE = "Dentro de: ";
    
    private JLabel estrella_Label;
   private ImageIcon imagen_Estrella_Amarilla = new ImageIcon(getClass().getResource("/imagenes/estrella.jpg"));
   private ImageIcon imagen_Estrella_Azul = new ImageIcon(getClass().getResource("/imagenes/estrella_Azul.jpg"));
   

    private JLabel caracter_Label;
    private JLabel coordenadaX_Label;
    private JLabel coordenadaY_Label;

    private JLabel dentroDe_JLabel;

    private Controlador_Ventana controlador_Ventana;

    public Vista() {
        controlador_Ventana = new Controlador_Ventana(this);
        this.addWindowListener(controlador_Ventana);
         this.addKeyListener(controlador_Ventana);
         this.addMouseMotionListener(controlador_Ventana);
        anadirPanel_Estrella();
        
        estrella_Label.addMouseListener(controlador_Ventana);
        
        anadir_Panel_Caracter_Coordenadas_Label();
       
        
        anadir_Panel_TextField_Dentro_De();

        iniciar_ventana();
    }

    private void iniciar_ventana() {
        this.setLayout(new GridLayout(3, 1));
        this.setSize(700, 700);
        this.setVisible(true);
    }

    /**
     * Metodos para el evento de WindowsEvent
     */
    public void escribir_Maximizado() {
        System.out.println(MAXIMIZADO);

    }

    public void escribir_Minimizado() {
        System.out.println(MINIMIZADO);

    }

    public void escribir_Cerrado() {
        System.out.println(CERRADO);

    }
    
    /**
     * Añadir el panel donde irá la imagen de la estrella con su imagen y su label
     */

    private void anadirPanel_Estrella() {
        JPanel panel_Estrella = new JPanel();

        this.add(panel_Estrella);
        estrella_Label = new JLabel();

        imagen_Estrella_Amarilla = new ImageIcon(getClass().getResource("/imagenes/estrella.jpg"));
        ImageIcon imagen_Estrella_Amarilla_2 = new ImageIcon(imagen_Estrella_Amarilla.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        estrella_Label.setIcon(imagen_Estrella_Amarilla_2);
        panel_Estrella.add(estrella_Label);

    }
    
    
    /*
    EMPIEZAN MÉTODOS PARA AÑADIR EL PANEL Y EL LABEL DONDE IRA LA IMAGEN DE LA ESTRELLA Y CAMBIARLA POR OTRA.
    */
/**
 * Método para obtener la imagen de la estrella amarilla
 * @return imageicon
 */
    public ImageIcon getImagen_Estrella_Amarilla() {
        ImageIcon imagen_Estrella_Amarilla_2 = new ImageIcon(imagen_Estrella_Amarilla.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        return imagen_Estrella_Amarilla_2;
    }
    

    /**
 * Método para obtener la imagen de la estrella azul
 * @return imageicon
 */
    public ImageIcon getImagen_Estrella_Azul() {
         ImageIcon imagen_Estrella_Azul_2 = new ImageIcon(imagen_Estrella_Azul.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        return imagen_Estrella_Azul_2;
    }
   
    /**
     * Cambia la imagen de un label.
     * @param imagen que es un imageIcon.
     */
    public void cambiar_Icono_Label_Estrella(ImageIcon imagen){
        estrella_Label.setIcon(imagen);
    }
    
    /*
    TERMNAN LOS MÉTODOS RELACIONADOS CON LA ESTRELLA
    */
    
    /*
    EMPIEZAN LOS MÉTODOS RELACIONADOS CON EL PANEL DEL CARACTER Y EL PANEL DE LAS COORDENADAS
    */
    
    /**
     * Añade los paneles del caracter y de las coordenadas a un panel que contiene los dos. Este a su vez es añadido al frame. Cambia de color el fondo de los paneles.
     */
    private void anadir_Panel_Caracter_Coordenadas_Label() {
        JPanel panel_Caracter_Coord = new JPanel();
        panel_Caracter_Coord.setLayout(new GridLayout(1,1));
        this.add(panel_Caracter_Coord);

        JPanel caracter_Panel = new JPanel();
        caracter_Panel.setBackground(Color.RED);
        caracter_Label = new JLabel(LETRA);
        caracter_Panel.add(caracter_Label);
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
    
    /**
     * Cambia el contenido del label de caracteres pasandole un char.
     * @param letra Es un char.
     */
    public void cambiar_caracterLabel(char letra){
        caracter_Label.setText(LETRA+ letra);
    }
/*
    FINAL MÉTODO PARA CARACTER
    */
    

    /*
    cambiar labels de coordenadas
    */
    public void cambiarCoordX(int x){
        coordenadaX_Label.setText(COORDENADA_X+x);
    }
    public void cambiarCoordY(int y){
        coordenadaY_Label.setText(COORDENADA_Y+y);
    }
    

    
    public void cambiarLabel_CoordX(int coordenada){
        coordenadaX_Label.setText(COORDENADA_X+ coordenada);
    }
  
    
     public void cambiarLabel_CoordY(int coordenada){
        coordenadaY_Label.setText(COORDENADA_Y+ coordenada);
    }
    private void anadir_Panel_TextField_Dentro_De() {
        JPanel panel_Dentro_Label = new JPanel();
        panel_Dentro_Label.setBackground(Color.ORANGE);
        this.add(panel_Dentro_Label);
        dentroDe_JLabel = new JLabel(DENTRO_DE);
        panel_Dentro_Label.add(dentroDe_JLabel);
    }
}
