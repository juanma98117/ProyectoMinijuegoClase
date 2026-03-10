package vista;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelJuego extends JPanel {

    private CardLayout cardLayout;

    private JPanel contenedor;

    private JLabel pregunta;

    private JButton boton;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    public PanelJuego() {

        setLayout(null);
        setBounds(0,0,1000,800);

        // Layout de tarjetas
        cardLayout = new CardLayout();

        contenedor = new JPanel();
        contenedor.setLayout(cardLayout);
        contenedor.setBounds(0,0,1000,800);

        add(contenedor);

        // Panel donde irá la pregunta y las respuestas
        JPanel panelJuego = new JPanel();
        panelJuego.setLayout(null);

        contenedor.add(panelJuego,"pregunta");

        

        pregunta = new JLabel("pregunta");
        pregunta.setBounds(200,100,600,50);

        panelJuego.add(pregunta);

         
        //  System.out.println("Cargar pregunta");
         //pregunta.setText(listaPreguntas.get(indice));
         
        
        boton = new JButton("");
        boton.setBounds(200,400,200,60);
        panelJuego.add(boton);
        
        boton.addActionListener((ActionEvent e) -> {
            System.out.println("Boton 1 pulsado");
        });

        boton2 = new JButton("");
        boton2.setBounds(600,400,200,60);
        panelJuego.add(boton2);
        
        boton2.addActionListener((ActionEvent e) -> {
            System.out.println("Boton 2 pulsado");
        });


        boton3 = new JButton("");
        boton3.setBounds(200,500,200,60);
        panelJuego.add(boton3);
        
        boton3.addActionListener((ActionEvent e) -> {
            System.out.println("Boton 3 pulsado");
        });

        boton4 = new JButton("");
        boton4.setBounds(600,500,200,60);
        panelJuego.add(boton4);

        boton4.addActionListener((ActionEvent e) -> {
            System.out.println("Boton 4 pulsado");
        });
        

        
        

        

    }
}