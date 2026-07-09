public class autoboxing {
    public static void main(String[] args) {
        int i=10; //autoboxing
        Integer j=new Integer(i);
        System.out.println(j);
        Integer m=new Integer (21); //unboxing
        int y=m;
        System.out.println(y);
    }
}
