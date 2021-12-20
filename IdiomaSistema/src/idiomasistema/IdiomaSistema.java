package idiomasistema;

import java.util.Locale;

/**
 * Idioma do sistema
 * @author Gabriel
 */
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        System.out.println("Seu sistema está em " + idioma);
    }
}
