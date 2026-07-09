import java.io.*;
public class exception {
    public static void main(String[] args) {
        int sum=0;
        try{
        for(int i=0;i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
        }
        }
        catch(NumberFormatException e){
            System.out.println("PassIntegerValue" +e);
        }
        System.out.println("Sum: "+sum);
    }
}
