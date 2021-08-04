package Forms;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/showform")
    public String showForm(Model model)
    {
        //create student object
        Student student=new Student();
        // If you give data to the object then it will use else leave the form as null
        student.setFirstName("itachi");
        student.setLastName("uchiha");
        student.setCountry("India");
        student.setFavLang("Python");

        //add to model
        model.addAttribute("student",student);
        //return the page
        return "student-form";
    }
    @RequestMapping("processform")
    public String processForm(@ModelAttribute("student") Student student)
    {
        System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getCountry()+" "+student.getFavLang());
        return "process-form";
    }
}
