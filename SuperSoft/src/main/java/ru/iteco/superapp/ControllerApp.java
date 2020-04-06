package ru.iteco.superapp;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.iteco.superapp.entity.Employee;
import ru.iteco.superapp.httpservice.repository.EmployeeRep;

@Controller
public class ControllerApp {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Title", "Главная страница");
        return "index";
    }


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

        EmployeeRep employeeRep = new EmployeeRep();
        Employee employee = new Employee();
        employee.setFirstName("jhhg");
        employee.setLastName("edckeh");
        employee.setMiddleName("efjbkjcbkejrc");
        employee.setPhone("213546");
        employee.setEmail("123@ya.ru");
        employeeRep.add(employee);
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
