package horadosistema;

import java.util.Date;
import javax.swing.JOptionPane;
/**
 * Mostrar hora e data do sistema
 * @author Gabriel
 */
public class HoraDoSistema {
    public static void main(String[] args) {
        Date data = new Date();
        JOptionPane.showMessageDialog(null, data);
        System.out.println("A data e a hora do sistema são " + data.toString());
    } 
}
