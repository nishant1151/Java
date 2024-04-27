import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferFileReder {
    public static void main(String[] args) {

        Path folder= Paths.get("G:\\M_ tech_focus\\Java\\myfolder");
        Path file=Paths.get(folder+"\\newfile.txt");
        try(FileWriter fileWriter=new FileWriter(file.toFile());
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter)){

            if(!file.toFile().exists()){
                Files.createDirectories(folder);
                Files.createFile(file);
            }

            for(int i=0;i<10;i++){
                bufferedWriter.write("Hello"+i);
                bufferedWriter.write("\n");

            }

        }catch(IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
