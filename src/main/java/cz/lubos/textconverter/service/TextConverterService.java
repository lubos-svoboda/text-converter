package cz.lubos.textconverter.service;

import org.springframework.stereotype.Service;

@Service
public class TextConverterService {

    private final static String VOWELS = "aeiouáéíóúů";

    /**
     * Transformaci provede tak, že textu otočí pořadí písmen (tedy přečte ho odzadu) s tím, že:
     * na pozici, kde se původně vyskytovala písmena a,e,i,o,u budou nově písmena uppercase, všechna ostatní písmena budou lowercase.
     * Dvě a více mezer spojí do jedné mezery
     *
     * Např:
     * Ahoj, jak se máš?
     * ?šÁm es kaj ,jOha
     *
     * Je     mi   fajn.
     * .NjaF iM ej
     *
     * @param text
     * @return
     */
    public String convertText(String text) {
        if (text == null) {
            return null;
        }

        String t = text.replaceAll("\\s+", " ");
        StringBuilder sb = new StringBuilder(t);

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (VOWELS.indexOf(ch) > 0) {
                sb.replace(i, i +1, String.valueOf(ch).toUpperCase());
            } else {
                sb.replace(i, i +1, String.valueOf(ch).toLowerCase());
            }
        }

        return sb.reverse().toString();
    }
}
