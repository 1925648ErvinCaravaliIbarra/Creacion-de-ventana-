/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentaciondeervincaravaliibarra;

import java.awt.EventQueue;
import javax.swing.JFrame;

/*
 * La clase en donde desarrollamos la GUI
 * se ponen los atributos de la clase.
 */
public class GUI_PresentacionDeErvinCaravaliIbarra extends  JFrame {
     
    
 /*
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
   * para inicializar el metodo initGUI(); en el metodo constructor de la clase
   * se crea el metodo initGUI dentro de la clase "public class GUI_PresentacionDeErvinCaravaliIbarra extends  JFrame"
   * dentro del metodo iniGUI se configuran los componentes graficos. 
  */
 private void initGUI() {
     
 
    };

    /*
     * Metodo main
     * En este metodo se instancia la clase en la que se desarrolla la GUI.
     * En este caso la clase llamada "GUI_PresentacionDeErvinCaravaliIbarra"
     * para instasiar una clase se crea un objeto para la clase "GUI_PresentacionDeErvinCaravaliIbarra"
     * la forma de instacinar es: nombre de la clase;nombre del objeto; = new constructor de la clase 
    */ 
    public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable(){
           @Override
      public void run (){
/*instaciacion de la clase */      GUI_PresentacionDeErvinCaravaliIbarra PresentacionDeErvinCaravaliIbarra = new  GUI_PresentacionDeErvinCaravaliIbarra();
    }
    
    });

    }
    
}
