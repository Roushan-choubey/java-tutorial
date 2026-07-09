import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue obj=new PriorityQueue();
        obj.offer("Roushan");
        obj.offer("Saurabh");
        obj.offer("Sahil");
        obj.offer("shakti");
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.peek());
        System.out.println(obj);
        System.out.println(obj.size());

        System.out.println(obj.poll());
        System.out.println(obj);
        

    }
}
