package SpringPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/hello_world")
    public String printHelloWorld(ModelMap modelMap){

        // add attribute to load modelMap
        modelMap.addAttribute("message",
                "Hello Sreeram and Welcome to Spring MVC!");

        // return the name of the file to be loaded "hello_world.jsp"
        return "hello_world";
    }
}
