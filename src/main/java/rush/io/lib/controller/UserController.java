package rush.io.lib.controller;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView login(User user) {
        ModelAndView mav = new ModelAndView();
        System.out.println(user.getName() + " " + user.getPassword());
        if (!userService.loginCheck(user)) {
            mav.setViewName("login.jsp");
            mav.addObject("errorMsg", "username or password error!");
        } else {
            mav.setViewName("tickets.jsp");
            mav.addObject("user", user);
        }
        return mav;
    }
}
