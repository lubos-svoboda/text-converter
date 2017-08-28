package cz.lubos.textconverter.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TextConverterServiceTest {

    TextConverterService textConverterService;

    @Before
    public void setup() {
        this.textConverterService = new TextConverterService();
    }

    @Test
    public void shouldConvertTextWhenSimpleTextProvided() {
        final String inputText = "Ahoj, jak se máš?";

        String outputText = textConverterService.convertText(inputText);

        assertEquals("?šÁm es kaj ,jOha", outputText);
    }

    @Test
    public void shouldRemoveDoubleSpaceWhenMoreSpacesProvided() {
        final String inputText = "Je     mi   fajn.";

        String outputText = textConverterService.convertText(inputText);

        assertEquals(".NjaF iM ej", outputText);
    }
}