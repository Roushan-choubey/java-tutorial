import java.util.*;
public class setinterface {
    public static void main(String[] args) {
        HashSet obj= new HashSet();
        obj.add("Roushan");
        obj.add("Choubey");
        obj.add(23);
        obj.add("Roushan");
        System.out.println(obj);
        System.out.println(obj.size());
        obj.add("Saurabh");
         System.out.println(obj);
        System.out.println(obj.size());
        obj.clear();
        System.out.println(obj);
        System.out.println(obj.size());
    }
    
}
