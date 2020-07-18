package nim.springframework.nimpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by masoud on 6/30/2020.
 */
@Controller
public class VetController {
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){
        return "Vets/index";
    }
}
