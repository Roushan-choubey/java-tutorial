import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        ArrayDeque obj=new ArrayDeque();
        obj.add(5);
        obj.add(4);
        obj.add(7);
        obj.add(9);
        obj.add(2);
        obj.add(10);
        System.out.println(obj);
        System.out.println(obj.size());
        obj.addFirst("Roushan");
        obj.addLast("Choubey");
        System.out.println(obj);
        System.out.println(obj.size());
        obj.pollFirst();
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.getFirst());
        System.out.println(obj.getLast());
        System.out.println(obj);
        System.out.println(obj.size());
    }
}
