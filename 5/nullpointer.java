// null pointer exception
public class nullpointer {
        public static void main(String[] args) {
            try{
            String sc=null;
            System.out.println(sc.toUpperCase());
  
        }
        catch(Exception e){
            System.out.println("Please pass value except null");
        }
}
}
 