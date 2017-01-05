package rush.io.lib.controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import rush.io.lib.entity.User;
import rush.io.lib.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by root on 16-12-31.
 */
@Controller
@RequestMapping(value = "/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "username", required = true) String name,
                        @RequestParam(value = "password", required = true) String password,
                        @RequestParam(value = "email", required = false) String email) {
        ModelAndView mav = new ModelAndView();
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);
        if (!userService.loginCheck(user)) {
            mav.setViewName("login");
            mav.addObject("errorMsg", "username or password error!");
            return "login";
        } else {
            userService.register(user);
            return "tickets";
        }
    }
}
