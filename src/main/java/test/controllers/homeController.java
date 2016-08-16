package test.controllers;

import org.springframework.stereotype.Controller;
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
}
