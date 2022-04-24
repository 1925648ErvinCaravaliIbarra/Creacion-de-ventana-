
package presentaciondeervincaravaliibarra;

//import java.awt.Color;
import java.awt.*;
import javax.swing.*;

/**
 *Clase titutlos esta va ser mi plantilla de titulos 
 * ervin.caravali@correounivalle.edu.co
 */
public class Titulos extends JLabel {
    
    public Titulos(String titulo,Color colorFondo){
       /*titulo*/ this.setText(titulo);
       /*color de fondo*/ this.setBackground(colorFondo);
       /*color del texto*/ this.setForeground(Color.BLACK );
       /*tipo de fuente del texto */ this.setFont(new Font(Font.DIALOG,Font.BOLD+Font.ITALIC,18));
       /*Ubicacion del texto*/ this.setHorizontalAlignment(JLabel.CENTER);
    }
    
}
