package nim.springframework.nimpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by masoud on 7/2/2020.
 */

@Controller
public class OwnerCintroller {
    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listOwners(){
        return "Owners/index";
    }
}
