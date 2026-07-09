public class Exception1 {
      public static void main(String[] args) {
       int sum=0;
       try{
        for(int i=0;i<args.length;i++){
            sum+=Integer.parseInt(args[i]);
        }
       } 
       finally{
    
       System.out.println(sum);
    }
}
}
