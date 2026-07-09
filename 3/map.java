import java.util.*;
public class map {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(1,"Roushan");
        h.put(2,"Saurabh");
        h.put(3,"Sahil");
        h.put(4,"Sanyam");
        System.out.println(h);
        System.out.println(h.get(1));
        System.out.println(h.keySet());
        System.out.println(h.containsKey(6));
        
    }
}


