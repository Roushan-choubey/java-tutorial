// //public class constructor {
    
// }

// class parent {
//     void display(){
//         System.out.println("this is parent class");
//     }
// }
// class child extends parent{
//     void display(){ 
//      super.display();
//         System.out.println("this is child class");
//     }
// }
//     class constructor{
//     public static void main(String[] args) {
//         child bbd = new child();
//         bbd.display();
//     }
// }
class Person{
    int a;
    int b;
    void display (int a, int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);    
    }
    class constructor{
    public static void main(String[] args) {
        Person p= new Person();
        p.display(10, 50);
    }
}
}