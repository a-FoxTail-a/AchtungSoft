package com.SuperSoft.home.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

//    @GetMapping("/protocolJMS")
//    public String protocolJMS(Model model) {
//        model.addAttribute("Protocol", "JMS");
//        model.addAttribute("ResponseDB", "Тут будет ответ от сервера");
//        return "PageProtocol";
//    }

//
//    (@RequestParam Integer idProvider,
//    @RequestParam String department,
//    @RequestParam String carNumber,
//    @RequestParam ("arrivalDate") @DateTimeFormat(iso = ISO.DATE) LocalDate startDate,
//    @RequestParam("arrivalDate") @DateTimeFormat(iso = ISO.DATE) LocalDate endDate,
//    @ModelAttribute("idAttribute") Supply supply, Model model)


    @GetMapping("/protocolJMS")
    public String protocolJMS(@RequestParam(name="name", required=false, defaultValue="Тут будет ответ от БД") String name,
                              @RequestParam(name="email", required=false, defaultValue="") String email,Model model) {
        model.addAttribute("Protocol", "JMS");
        model.addAttribute("ResponseDB", name + email);

        return "PageProtocol";
    }



    //http://localhost:8080/protocolJMSCreate?name=123&email=123&other=123

}
