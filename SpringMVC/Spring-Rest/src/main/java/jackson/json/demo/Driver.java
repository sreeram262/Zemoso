package jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) {
        ObjectMapper objectMapper= new ObjectMapper();

        Student student;

        {
            try {
                student = objectMapper.readValue(new File("data/sample-full.json"),Student.class);

                Address tempAddress = student.getAddress();

                System.out.println("Street = " + tempAddress.getStreet());
                System.out.println("City = " + tempAddress.getCity());

                // print out languages

                for (String tempLang : student.getLanguages()) {
                    System.out.println(tempLang);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
