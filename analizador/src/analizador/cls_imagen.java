/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author efralerma
 */
public class cls_imagen extends javax.swing.JPanel{
    
    public cls_imagen() {
        this.setSize(300, 400); //se selecciona el tamaño del panel
    }
 
    //Se crea un método cuyo parámetro debe ser un objeto Graphics

    public void paint(Graphics grafico) {
    Dimension height = getSize();

    //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

    ImageIcon Img = new ImageIcon(getClass().getResource("/img_automatas/img_a1.png")); 

    //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

    grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

    setOpaque(false);
    super.paintComponent(grafico);
    }
    
}
