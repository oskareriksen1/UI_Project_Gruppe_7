package dk.kea.ui_project_gruppe_7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIcontroller {

    @GetMapping("/UIProject")
    public String visUIProject(){
        return "UIProject";

    }
}
