import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataInputStreamClass {
    public static void main(String [] args){
        Path folder = Paths.get("G:\\M_ tech_focus\\Java\\myfolder");
        Path file=Paths.get(folder+"\\abc.txt");
        try(FileInputStream fileInputStream=new FileInputStream(file.toFile());
            DataInputStream dataInputStream=new DataInputStream(fileInputStream)){
        if(!Files.exists(file)){
        throw new MyFileNotFoundException("file not found");
        }
        while(dataInputStream.available()!=0){
            System.out.println(dataInputStream.readUTF());
        }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (MyFileNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

}
