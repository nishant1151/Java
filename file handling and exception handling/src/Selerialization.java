import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Selerialization {
    public static void main(String []args){
        Path folder= Paths.get("G:\\M_ tech_focus\\Java\\myfolder");
        Path file=Paths.get(folder+"\\personObject.txt");

        try(FileOutputStream fileOutputStream=new FileOutputStream(file.toFile(),true);
            ObjectOutputStream ObjectOutputStream=new ObjectOutputStream(fileOutputStream)){

            if(!Files.exists(folder)){
                Files.createDirectories(folder);
                if(!Files.exists(file)){
                Files.createFile(file);}
            }

            ObjectOutputStream.writeObject(new Person(55,"Nishant"));

            ObjectOutputStream.writeObject(new Person(45,"fededv"));


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
