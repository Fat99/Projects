import java.io.IOException;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;

public class FileIterator implements Iterator<String> {
    private Scanner scan;
    public FileIterator(String path) throws  IOException{
        scan = new Scanner(Paths.get(path));
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public String next() {
        return null;
    }

    public void close() {
        scan.close();
    }

    public void remove(){

    }
}
