package cz.lubos.textconverter.controller;

import cz.lubos.textconverter.model.ConversionResponse;
import cz.lubos.textconverter.service.TextConverterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class TextConverterController {

    private final TextConverterService textConverterService;

    public TextConverterController(TextConverterService textConverterService) {
        this.textConverterService = textConverterService;
    }

    @GetMapping("/convert-text")
    public ConversionResponse convert(
            @RequestParam String inputText) {
        String outputText = textConverterService.convertText(inputText);

        ConversionResponse response = new ConversionResponse();
        response.setInputText(inputText);
        response.setOutputText(outputText);

        return response;
    }
}
