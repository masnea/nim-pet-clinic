package nim.springframework.nimpetclinic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class HelloController {

    @RestController
    public class HelloConroller {

        @RequestMapping("/")
        public String index() {
            return "Greetings from Spring Boot!";
        }

    }
}
