package com.SuperSoft.home.Contollers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Title", "Главная страница");
        return "index";
    }

    @GetMapping("/protocolHTTP")
    public String protocolHTTP(Model model) {
        model.addAttribute("Protocol", "HTTP");
        model.addAttribute("ResponseDB", "Тут будет ответ от сервера");
        return "PageProtocol";
    }

    @GetMapping("/protocolSOAP")
    public String protocolSOAP(Model model) {
        model.addAttribute("Protocol", "SOAP");
        model.addAttribute("ResponseDB", "Тут будет ответ от сервера");
        return "PageProtocol";
    }

    @GetMapping("/protocolJMS")
    public String protocolJMS(Model model) {
        model.addAttribute("Protocol", "SOAP");
        model.addAttribute("ResponseDB", "Тут будет ответ от сервера");
        return "PageProtocol";
    }

}