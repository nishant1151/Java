import javax.swing.text.html.parser.Parser;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.FileHandler;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String [] args){
        try{
            Path folder = Paths.get("G:\\M_ tech_focus\\Java\\myfolder");
            Path file=Paths.get(folder+"\\mytextfile.txt");
            String str="55";
            int a=parseInt(str);
            System.out.println(a+5);

            if(!Files.exists(file)){
               Files.createDirectories(folder);
               Files.createFile(file);
            }
            FileWriter fileWriter=new FileWriter(file.toFile(),true);

           for(int i=0;i<7;i++){
               fileWriter.append("Hello"+i+" ");
//               fileWriter.write("\n");
           };
           fileWriter.flush();
            fileWriter.close();

        }catch(IOException e){
        e.printStackTrace();
    }catch(Exception e){
        e.printStackTrace();
        }


        Person person=new Person(55,",dfj");
        Person person1=person;
        person1.setAge(24525);
        System.out.println(person);
    }
}
