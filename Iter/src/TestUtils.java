import java.io.*;
import java.util.Iterator;

public class TestUtils implements Iterator<String>,AutoCloseable {
    private BufferedReader br;
    private FileReader fr;
    private String next;

    public TestUtils(BufferedReader br, FileReader fr, String next) {
        this.br = br;
        this.fr = fr;
        this.next = next;
    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public String next() {
        String tmp = next;
        try {
            next = br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        return tmp;
    }
    public void remove(){

    }
}
