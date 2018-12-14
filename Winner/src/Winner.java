import java.util.Map.Entry;
import java.util.*;

class SortedTreeMap implements Comparator<Object>
{
    private TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    private String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
            "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
    private int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
    public SortedTreeMap()
    {
        for (int i = 0; i < 16; i++) {
            map.put(times[i], names[i]);
        }
        TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
        tm1.putAll (map);
        Iterator<Entry<Integer, String>> it = tm1.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<  Integer, String> me = (Map.Entry<Integer, String>)it.next();
            for (int i=0;i<3;i++) {
                System.out.println(tm1.get(i));
            }
        }
    }
    public int compare( Object o1, Object o2 )
    {
        return ((String)map.get( o1 )).compareTo( (String)map.get( o2 )) ;
    }
    public static void main( String[] args )
    {
        new SortedTreeMap();
    }
}