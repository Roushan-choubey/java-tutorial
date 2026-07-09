import java.util.*;
public class iterator {
    public static void main(String[] args) {
        ArrayList obj= new ArrayList();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        Iterator it=obj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
