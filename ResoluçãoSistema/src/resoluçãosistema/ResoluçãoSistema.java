package resoluçãosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Resolução do sistema
 * @author Gabriel
 */
public class ResoluçãoSistema {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double height = screenSize.getHeight();
        double width = screenSize.getWidth();
        System.out.println("A resolução da tela é de " + width + " x " + height);        
    }
}
