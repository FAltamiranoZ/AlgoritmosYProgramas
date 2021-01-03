package Proyecto;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class Imagen extends javax.swing.JPanel {
public Imagen(){
this.setSize(400,280);
}
@Override
public void paintComponent (Graphics g){
Dimension tamaño = getSize();
ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Koala.jpg"));
g.drawImage(imagenFondo.getImage(),0,0,tamaño.width, tamaño.height, null);
setOpaque(false);
super.paintComponent(g);
}
}