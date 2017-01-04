package rush.io.lib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller // @Controller 代表本Java类是controller控制层
public class Login {

    @RequestMapping(value = "/login")
    public String index() {
        return "ok";
    }

}
