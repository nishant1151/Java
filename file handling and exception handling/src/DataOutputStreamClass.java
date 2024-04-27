import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataOutputStreamClass {
    public static void main(String[] args) throws  Exception{
        Path folder =Paths.get("G:\\M_ tech_focus\\Java\\myfolder");
        Path file=Paths.get(folder+"\\abc.txt");
        if(!Files.exists(file)){
            Files.createDirectories(folder);
            Files.createFile(file);
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file.toFile());
        DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);
        for(int i=0;i<10;i++){
            dataOutputStream.writeUTF("hello");
        }
    }
}
