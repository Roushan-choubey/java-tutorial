import java.util.*;
public class stack1 {
    public static void main(String[] args) {
        Stack obj=new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println(obj);
        System.out.println(obj);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj);
        System.out.println(obj.size());

    }
}
