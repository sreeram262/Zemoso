package Forms;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/customer")
public class CustomerController {


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }
    @RequestMapping("/showform")
    public String showForm(Model model)
    {

        model.addAttribute("customer",new Customer());
        return "customer-form";
    }

    @RequestMapping("/processform")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult)
    {
        System.out.println(customer.getLastName()+"|");
        System.out.println("BindingResults: "+bindingResult);

        if(bindingResult.hasErrors()) {
            System.out.println("errors");
            return "customer-form";
        }
//        else if(customer.getLastName().length()==0)
//            return "customer-form";
        else
        {
            System.out.println("no errors");
            return "customer-confirm";
        }
    }
}
