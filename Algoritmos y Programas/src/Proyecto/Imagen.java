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
Dimension tama�o = getSize();
ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/Koala.jpg"));
g.drawImage(imagenFondo.getImage(),0,0,tama�o.width, tama�o.height, null);
setOpaque(false);
super.paintComponent(g);
}
}