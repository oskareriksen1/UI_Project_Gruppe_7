package dk.kea.ui_project_gruppe_7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIcontroller {

    @GetMapping("/")
    public String visUIProject(){
        return "GrædOverSpildtMælk";

    }
    @GetMapping("/engros")
    public String visEngros(){
        return "engros";
    }
    @GetMapping("/detail")
    public String visDetail(){
        return "detail";
    }
    @GetMapping("/Restauratorer")
    public String visRestauratorer() { return "Restauratorer";}
    @GetMapping("/privat")
    public String visPrivat() { return "privat";}
    @GetMapping("/Partners")
    public String visPartners() { return "Partners";}

@GetMapping("/test")
    public String test(){
        return "test";
}
    @GetMapping("/omOs")
    public String omOs(){
        return "omOs";
    }
}

