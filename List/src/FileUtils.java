import java.io.*;

public class FileUtils {
    public static void writeAll(String path, java.util.List<String> lines){
        File file = new File (path);
        if(file.isDirectory()){
            throw new IllegalArgumentException("Path be file");
        } else{
            try(FileWriter fw = new FileWriter(path);
                BufferedWriter bw = new BufferedWriter(fw)) {
                for (String line: lines){
                    bw.write(line);
                    bw.newLine();
                }
            } catch (IOException e) {
                System.err.println("Exception while reading file: ");
                throw new RuntimeException(e);
            }
        }
    }
}
