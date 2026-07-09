import java.util.*;
public class treeset {
    public static void main(String[] args) {
        TreeSet obj=new TreeSet();
        obj.add("5"); 
        obj.add("4"); 
        obj.add("3"); 
        obj.add("2"); 
        obj.add("1"); 
        System.out.println(obj);
        System.out.println(obj.size());
        //obj.pollFirst();
        System.out.println(obj.pollFirst());
        System.out.println(obj);
        System.out.println(obj.size());
         System.out.println(obj.pollLast());
        System.out.println(obj);
        System.out.println(obj.size());
        obj.clear();
        System.out.println(obj);
        System.out.println(obj.size());
    }
}
