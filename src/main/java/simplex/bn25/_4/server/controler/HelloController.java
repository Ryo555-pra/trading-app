package simplex.bn25._4.server.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
