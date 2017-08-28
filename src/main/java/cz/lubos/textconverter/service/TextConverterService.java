package cz.lubos.textconverter.service;

import org.springframework.stereotype.Service;

@Service
public class TextConverterService {

    private final static String VOWELS_CZ = "aeiouáéěíóúů";

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
        text = text.replaceAll("\\s+", " ");
        StringBuilder sb = new StringBuilder(text.toLowerCase()).reverse();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (VOWELS_CZ.indexOf(ch) >= 0) {
                sb.replace(i, i +1, String.valueOf(sb.charAt(i)).toUpperCase());
            }
        }
        return sb.toString();
    }
}