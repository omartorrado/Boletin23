/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;


import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author otorradomiguez
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame marco=new JFrame();
        JPanel panelTop=new JPanel();
        JPanel panelBot=new JPanel();
        
        marco.setSize(400,800);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        
        JLabel nombre=new JLabel("NOMBRE");
        JTextField textoNombre=new JTextField();
        JPasswordField textoPassword =new JPasswordField();
        JLabel password=new JLabel("PASSWORD");
        JButton pulsar=new JButton("PULSAR");
        JButton limpiar=new JButton("LIMPIAR");
        
        JComboBox lista=new JComboBox();        
        JButton botonBot=new JButton("BOTON");
        JTextField texto=new JTextField();
        
        lista.addItem("ElementoLista1");
        lista.addItem("ElementoLista2");
        lista.addItem("ElementoLista3");
        
        texto.setColumns(20);
        
        GridLayout panelTopGrid=new GridLayout(3,2);
        panelTopGrid.setVgap(30);
        panelTopGrid.setHgap(10);
        panelTop.setMaximumSize(new Dimension(400,400));
        panelTop.setLayout(panelTopGrid);     
        
        panelTop.add(nombre);
        panelTop.add(textoNombre);
        panelTop.add(password);
        panelTop.add(textoPassword);
        panelTop.add(pulsar);
        panelTop.add(limpiar);
        
        panelBot.add(lista);
        panelBot.add(botonBot);
        panelBot.add(texto);
         
        marco.setLayout(new BoxLayout(marco.getContentPane(),BoxLayout.Y_AXIS));
        
        marco.add(panelTop);
        marco.add(panelBot);
        marco.setVisible(true);
    }
    
}
