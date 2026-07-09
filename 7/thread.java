public class thread implements Runnable {
    public void run() {
       for(int i=0; i<=10; i++)
        {
        try{
            System.out.println(i);
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }
       }
    }

    public static void main(String[] args) {
        thread t = new thread();    // to implement class thread
        Thread th = new Thread(t);  // to implement thread
        th.start();
    }
}
