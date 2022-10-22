import java.io.FileWriter;
import java.io.IOException;

/**
 * сохраняет строку
 */
public class file_out {

    public static void save(String f) {
        try(FileWriter writer = new FileWriter("result.txt", true))
        {
            writer.write(f);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    } 
}
   