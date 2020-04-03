package com.SuperSoft.home.Contollers;

import com.SuperSoft.home.BD;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Title", "Главная страница");
        return "index";
    }



//    @GetMapping("/protocolHTTP")
//    public String GETprotocolHTTP(Model model) {
//        model.addAttribute("Protocol", "HTTP");
//        model.addAttribute("ResponseDB", "Тут будет ответ от сервера");
//        return "PageProtocol";
//    }
//
//    @GetMapping("/protocolSOAP")
//    public String GETprotocolSOAP(Model model) {
//        model.addAttribute("Protocol", "SOAP");
//        model.addAttribute("ResponseDB", "Тут будет ответ от сервера");
//        return "PageProtocol";
//    }

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

    //============================================ Контроллер HTTP===================================
    @GetMapping("/protocolHTTP")
    public String GETprotocolHTTP(@RequestParam(name="first_name", required=false, defaultValue="Тут будет ответ от БД") String first_name,
                                 @RequestParam(name="last_name", required=false, defaultValue="") String last_name,
                                 @RequestParam(name="middle_name", required=false, defaultValue="") String middle_name,
                                 @RequestParam(name="phone", required=false, defaultValue="") String phone,
                                 @RequestParam(name="email", required=false, defaultValue="") String email,
                                   Model model) {


        model.addAttribute("Protocol", "HTTP");
        model.addAttribute("ResponseDB", first_name);
        return "PageProtocol";
    }
    @PostMapping("/protocolHTTP")
    public String POSTprotocolHTTP(@RequestParam(name="first_name", required=false, defaultValue="Тут будет ответ от БД") String first_name,
                                   @RequestParam(name="last_name", required=false, defaultValue="") String last_name,
                                   @RequestParam(name="middle_name", required=false, defaultValue="") String middle_name,
                                   @RequestParam(name="phone", required=false, defaultValue="") String phone,
                                   @RequestParam(name="email", required=false, defaultValue="") String email,
                                   Model model) {
        model.addAttribute("Protocol", "HTTP");
        model.addAttribute("ResponseDB", first_name);
        return "PageProtocol";
    }

    @PostMapping("/protocolHTTPCreate")
    public String POSTprotocolHTTPCreate(@RequestParam(name="first_name", required=false) String first_name,
                                   @RequestParam(name="last_name", required=false, defaultValue="") String last_name,
                                   @RequestParam(name="middle_name", required=false, defaultValue="") String middle_name,
                                   @RequestParam(name="phone", required=false, defaultValue="") String phone,
                                   @RequestParam(name="email", required=false, defaultValue="") String email,
                                   Model model) {

        BD m = new BD();
        m.testDatabase(first_name,last_name,middle_name,phone,email);
        model.addAttribute("Protocol", "HTTP");
        model.addAttribute("ResponseDB", first_name);
        return "PageProtocol";
    }



    //============================================ Контроллер SOAP===================================

    @GetMapping("/protocolSOAP")
    public String GETprotocolSOAP(@RequestParam(name="first_name", required=false, defaultValue="Тут будет ответ от БД") String first_name,
                                   @RequestParam(name="last_name", required=false, defaultValue="") String last_name,
                                   @RequestParam(name="middle_name", required=false, defaultValue="") String middle_name,
                                   @RequestParam(name="phone", required=false, defaultValue="") String phone,
                                   @RequestParam(name="email", required=false, defaultValue="") String email,
                                   Model model) {
        model.addAttribute("Protocol", "SOAP");
        model.addAttribute("ResponseDB", first_name);
        return "PageProtocol";
    }
    @PostMapping("/protocolSOAP")
    public String POSTprotocolSOAP(@RequestParam(name="first_name", required=false, defaultValue="Тут будет ответ от БД") String first_name,
                                   @RequestParam(name="last_name", required=false, defaultValue="") String last_name,
                                   @RequestParam(name="middle_name", required=false, defaultValue="") String middle_name,
                                   @RequestParam(name="phone", required=false, defaultValue="") String phone,
                                   @RequestParam(name="email", required=false, defaultValue="") String email,
                                   Model model) {
        model.addAttribute("Protocol", "SOAP");
        model.addAttribute("ResponseDB", first_name);
        return "PageProtocol";
    }


    //============================================ Контроллер JMS===================================

    @GetMapping("/protocolJMS")
    public String GETprotocolJMS(@RequestParam(name="first_name", required=false, defaultValue="Тут будет ответ от БД") String first_name,
                                 @RequestParam(name="last_name", required=false, defaultValue="") String last_name,
                                 @RequestParam(name="middle_name", required=false, defaultValue="") String middle_name,
                                 @RequestParam(name="phone", required=false, defaultValue="") String phone,
                                 @RequestParam(name="email", required=false, defaultValue="") String email,
                                 Model model) {
        model.addAttribute("Protocol", "JMS");
        model.addAttribute("ResponseDB", first_name);
        return "PageProtocol";
    }
    @PostMapping("/protocolJMS")
    public String POSTprotocolJMS(@RequestParam(name="first_name", required=false, defaultValue="Тут будет ответ от БД") String first_name,
                                  @RequestParam(name="last_name", required=false, defaultValue="") String last_name,
                                  @RequestParam(name="middle_name", required=false, defaultValue="") String middle_name,
                                  @RequestParam(name="phone", required=false, defaultValue="") String phone,
                                  @RequestParam(name="email", required=false, defaultValue="") String email,
                                  Model model) {
        model.addAttribute("Protocol", "JMS");
        model.addAttribute("ResponseDB", first_name);
        return "PageProtocol";
    }




    //http://localhost:8080/protocolJMSCreate?name=123&email=123&other=123

}
