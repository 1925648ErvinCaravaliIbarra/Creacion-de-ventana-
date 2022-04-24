/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentaciondeervincaravaliibarra;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.TitledBorder;


/*Clase
 * La clase en donde desarrollamos la GUI
 * se ponen los atributos de la clase.
 */
public class GUI_PresentacionDeErvinCaravaliIbarra extends  JFrame {
 
 /*Atributo de la clase boton(botones) */ private JButton miFoto, miHobby,misExpectativas;
 /*Atributo de la clase titulo(linea de texto)*/ private Titulos titulo1; 
 /*Atributo de la clase contenedor(contenedor)*/ private JPanel botones,datos;
  /*Atributo de la clase Action Listener*/ private Escucha escucha;
  /*Atributo de la clase Image */ private JLabel imagen;
  /*Atributo de la clase texto Area  */ private JTextArea texto1;
    
    
 /*Metodo
   * para inicializar el metodo initGUI(); en el metodo constructor de la clase
   * se crea el metodo initGUI dentro de la clase "public class GUI_PresentacionDeErvinCaravaliIbarra extends  JFrame"
   * dentro del metodo iniGUI se configuran los componentes graficos (JComponents). 
   * Antes de configurar los componentes graficos(JComponents). primero se debe definir container y layyout.
   * segundo se deben crear objetos escucha y control. 
  */
 private void initGUI() {
     
 /*componente grafico 1 titulo*/ titulo1 = new Titulos("Hola soy Ervin Caravali Ibarra, por favor oprime los botones",Color.BLACK);
 
 /*componente grafico 2 ubicacion del titulo segun el tipo de Layout*/ this.add(titulo1,BorderLayout.NORTH);
 /*componente grafico 3 boton Mi foto */ miFoto = new JButton("Mi foto");
 /* escuha miFoto*/ escucha= new Escucha();
                    miFoto.addActionListener(escucha);
 /*componente grafico 4 ubicacion del boton segun el tipo de Layout this.add(miFoto,BorderLayout.SOUTH);*/
 /*componente grafico 5 boton Mi Hobby */ miHobby = new JButton("Mi Hobby");
  /* escuha miHobby*/escucha= new Escucha();
                    miHobby.addActionListener(escucha);
 /*componente grafico 6 ubicacion del boton segun el tipo de Layout this.add(miHobby,BorderLayout.WEST);*/
 /*componente grafico 7 boton Mis Expectativas */ misExpectativas = new JButton("Mis Expectativas");
  /* escuha misExpectativas*/ escucha= new Escucha();
                    misExpectativas.addActionListener(escucha);
 /*componente grafico 8 ubicacion segun el tipo de Layout this.add(misExpectativas,BorderLayout.EAST);*/
 /*componente grafico 9 contenedor para los botones*/ botones = new JPanel();
/*componente grafico10ubicacion del boton segun el tipo de Layout*/ botones .add(miFoto);
/*componente grafico11ubicacion del boton segun el tipo de Layout*/ botones.add(miHobby);
/*componente grafico12ubicacion del boton segun el tipo de Layout*/botones.add(misExpectativas);
/*componente grafico13ubicacion del panel segun el tipo de Layout*/ this.add(botones,BorderLayout.SOUTH);
 /*componente grafico 10contenedor para los datos */ datos = new JPanel();
 /* poner un marco a el panel y ubicarlo */ datos.setBorder(BorderFactory.createTitledBorder(null, "Un poco mas de mi...",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,new Font("Calibri",Font.PLAIN,20),Color.BLACK));
 /*componente grafico14ubicacion del panel los datos segun el tipo de Layout*/ this.add(datos,BorderLayout.CENTER);
    /* Componente grafico psra la imagenes */ imagen= new JLabel();
    /* Componente grafico para la area del texto */ texto1= new JTextArea(10,12);


    }; 
 
    /*Clase
     * La clase en donde se instancioan los escuchas
     * Este escuha se llama ActionListener.
    */
 
  private class Escucha implements ActionListener{
        private ImageIcon imagenes ;
        @Override
        public void actionPerformed(ActionEvent e) {
            datos.removeAll();
            if(e.getSource()==miFoto){
          imagenes   = new ImageIcon(getClass().getResource("/Recursos/Ervin.jpg"));
          datos.add(imagen);
          imagen.setIcon(imagenes);
            }
            else if(e.getSource()==miHobby){
         imagenes = new ImageIcon(getClass().getResource("/Recursos/books.jpeg"));
              datos.add(imagen);
          imagen.setIcon(imagenes); 
            }
            
            else if(e.getSource()== misExpectativas){
            texto1.setText("Quiero aprender sobre la programacion orientada a eventos en java\n");
            datos.add(texto1);
            }
           revalidate();
           repaint();
        }
};
 
 
    
 /*Metodo
 * Constructor de la clase 
 * Dentro del constructor de la clase se realiza la configuracion basica de la
 * ventana. 
 */   
public GUI_PresentacionDeErvinCaravaliIbarra(){
    initGUI();
/*configuracion basica de la ventana*/this.setTitle("Mi presentaicion");//titulo de la ventana.
/*configuracion basica de la ventana*/this.setSize(600,540);// tamaño de la ventana ancho y alto respectivamente. 
/*configuracion basica de la ventana*/this.setLocationRelativeTo(null);//sin modificar en que zona de la pantalla quiero la presentacion.
/*configuracion basica de la ventana*/this.setVisible(true);// con esto hago visible la ventana.
/*configuracion basica de la ventana*/this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se cierra/abre la ventana. 
    };


    /*
     * Metodo main
     * En este metodo se instancia la clase en la que se desarrolla la GUI.
     * En este caso la clase llamada "GUI_PresentacionDeErvinCaravaliIbarra"
     * para instasiar una clase se crea un objeto para la clase "GUI_PresentacionDeErvinCaravaliIbarra"
     * la forma de instacinar es: nombre de la clase;nombre del objeto; = new constructor de la clase 
    */ 
    public static void main(String[] args) {
       GUI_PresentacionDeErvinCaravaliIbarra E  = new  GUI_PresentacionDeErvinCaravaliIbarra();
    }
      
}
