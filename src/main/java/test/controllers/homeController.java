package test.controllers;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by AlexandrGoloborodko on 13.08.16.
 */
@Controller
public class homeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView home (){
        String str = "Hello, my little World! (^^,)";
        ModelAndView mav = new ModelAndView("index", "hello", str);
        return mav;
    }

    @RequestMapping(path = "/form", method = RequestMethod.GET)
    public ModelAndView form (){
        User user = new User();
        ModelAndView modelAndView = new ModelAndView("form","user",user);
        return modelAndView;
    }

    @RequestMapping(path = "/result", method = RequestMethod.GET)
    public ModelAndView result (@ModelAttribute("user") User user){
        ModelAndView modelAndView = new ModelAndView("result","user",user);
        return modelAndView;
    }
}
