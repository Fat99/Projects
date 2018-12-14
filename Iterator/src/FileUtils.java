import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public boolean exists(String path){
        return Files.exists(Paths.get(path)) && (Files.isDirectory(Paths.get(path)));
    }
    public List<String> readAll (String path) throws IOException{
        List<String> result = new ArrayList<>();
        String tmp;
        if(!exists(path))
            throw new FileNotFoundException(path);
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            while ((tmp = br.readLine()) != null){
                result.add(tmp);
            }
        }
        return result;
    }

    public void writeAll(String path, List <String> ){

    }
}
