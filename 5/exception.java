
public class exception {
    public static void main(String[] args) {
       int sum=0;
       try{
        for(int i=0;i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
        }
       } catch(NumberFormatException| ArithmeticException p) {
           System.out.println("PassIntegerValur"+p);
       }
       finally{
        System.out.println("ExecuteAlways");
       }
    
       System.out.println(sum);
    }
}
