interface Father{
    void input1();
}
interface Mother{
    void input2();
}
class Child implements Father, Mother{
    public void input1(){
        System.out.println("hello");
    }
    public void input2(){
        System.out.println("hello");
    }

}

public class interfrace {
    public static void main(String[] args) {
        Child bbd = new Child();
        bbd.input1();
        bbd.input2();
    }
    
}
