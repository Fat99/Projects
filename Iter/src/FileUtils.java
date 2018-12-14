import java.io.*;

public  class FileUtils {
    private FileUtils() {
    }

    /*public static void exists(String path) {
        return;
    }

   public static boolean exists(com.sun.java.util.jar.pack.Package.File file) {
        return file.exists();
    }*/

    public static String readAll(String path) {
        try(FileReader fr = new FileReader(path)) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            StringBuilder lines = new StringBuilder();
            while ((line = br.readLine())!=null){
                lines.append(line);
                lines.append('\n');
            }
            return lines.toString();
        } catch (IOException e) {
            System.err.println("File not found exc: " + path);
            return null;
        }
    }
    public static void writeAll(String path,String text){
        try (FileWriter fw = new FileWriter(path)){
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
        }catch (IOException e){
            System.err.println("File not found exc: " + path);
            return;
        }
    }
}