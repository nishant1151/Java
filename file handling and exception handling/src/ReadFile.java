import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {

        try{
            Path folder = Paths.get("G:\\M_ tech_focus\\Java\\myfolder");
            Path file=Paths.get(folder+"\\mytextfile.txt");
        if (!Files.exists(file)) {
            System.out.println("Function Called");
            throw new FileNotFoundException();
        }
            FileReader fileReader=new FileReader(file.toFile());
//            System.out.println((char)fileReader.read());

//            int i=0;
//            while((int)file.toFile().length()!=i){
//                System.out.println((char)fileReader.read());
//                i++;
//            }
            char [] arr=new char[(int)file.toFile().length()];
            fileReader.read(arr);
            System.out.print(arr);

        fileReader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        }
    }

