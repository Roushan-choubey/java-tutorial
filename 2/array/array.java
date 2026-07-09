import java.util.*;
public class array {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add("Saurabh");
        obj.add("Roushan");
        obj.add(23);
        obj.add("Saurabh");
        System.out.println(obj);
        System.out.println(obj.size());
        obj.add(2, "BBD");
        System.out.println(obj);
        System.out.println(obj.size());
        obj.remove(2);
        System.out.println(obj);
        System.out.println(obj.size());
        obj.clear();
        System.out.println(obj);
        System.out.println(obj.size());
    }
    
}
