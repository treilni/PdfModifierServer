package fr.axigate.pdfmodifierserver.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("pdf")
public class PdfController {
    @ResponseBody
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

    @ResponseBody
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }
}
