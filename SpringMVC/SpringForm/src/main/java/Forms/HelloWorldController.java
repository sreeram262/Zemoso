package Forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {

    @RequestMapping("/showform")
    public String showForm()
    {
        return "helloworld-form";
    }
    @RequestMapping("/processform")
    public String processForm()
    {
        return "processed-form";
    }
    @RequestMapping("/processform2")
    public String Shout(HttpServletRequest request, Model model)
    {
        // get the request parameter from form
        String name=request.getParameter("studentName");
        name=name.toUpperCase();
        //final value that will be used by the webpage
        String result= "HI! "+name;
        //add the paramter to the model
        model.addAttribute("message",result); // key-value pairs. Can access data from the model hence store it in model.

        return "processed-form";
    }
    @RequestMapping("/processform3")
    public String ShoutLouder(@RequestParam("studentName") String name, Model model)
    {

        name=name.toUpperCase();
        //final value that will be used by the webpage
        String result= "Heya there ! "+name;
        //add the paramter to the model
        model.addAttribute("message",result); // key-value pairs. Can access data from the model hence store it in model.

        return "processed-form";
    }

}
