import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deserelization {
    public static void main(String[]args){
        Path folder = Paths.get("G:\\M_ tech_focus\\Java\\myfolder");
        Path file=Paths.get(folder+"\\personObject.txt");
        try(FileInputStream fileInputStream=new FileInputStream(file.toFile());
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)){
            if(!Files.exists(file)){
                throw new FileNotFoundException();
            }

           while(true){
               Person p=(Person) objectInputStream.readObject();
               System.out.println(p);
           }

//            System.out.println(objectInputStream.readObject());


        }catch (IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
