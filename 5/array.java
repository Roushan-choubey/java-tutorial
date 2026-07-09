// array outbounds exception
public class array {
    public static void main(String[] args) {
       try{
        int m[] = new int[3];
        m[0]= 10;
        m[1]= 20;
        m[2]= 30;
        System.out.println(m[3]);
       
} catch (Exception p) {
            System.out.println("Pass Value Within range");
        }
    }
}