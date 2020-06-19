package nim.springframework.nimpetclinic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by masoud on 6/19/2020.
 */
@RestController
public class AppController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
