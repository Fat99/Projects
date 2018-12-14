import java.util.TreeMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(times[i], names[i]);
        }
        int index = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (index >= 0 && index < 3) {
                System.out.println(entry);
                index++;
            } else {
                break;
            }
        }
    }
}
