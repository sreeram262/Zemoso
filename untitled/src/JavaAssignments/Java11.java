package JavaAssignments;

import edu.duke.FileResource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Java11 {
    public static void main(String[] args) {
        FileResource file = new FileResource();
        HashMap<Character,Integer> letterCount = new HashMap<>();
        for(char ch:file.asString().toCharArray())
        {
            if(letterCount.containsKey(ch))
            {
                letterCount.put(ch,letterCount.get(ch)+1);
            }
            else
                letterCount.put(ch,1);
        }

        try{
            File newFile=new File("output.txt");
            if(newFile.createNewFile())
            {
                System.out.println("new file created");
            }
            else
                System.out.println("Same file already exists");
            FileWriter writer=new FileWriter(newFile);
            for(var pair:letterCount.entrySet())
            {
                if(Character.isAlphabetic(pair.getKey()))
                writer.write(pair.getKey()+" : "+pair.getValue()+"\n");
            }
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getStackTrace());
        }
    }
}
