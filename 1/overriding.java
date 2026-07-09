//       class Parent{
//            void display(int a, int b){
//                 System.out.println(a+b);

//             }
//         }
    
//     class Child extends Parent{
//        void display(int a, int b){
//             System.out.println(a-b);  
//         }
//     }
//     class overriding{
//     public static void main(String[] args) {
//         Child bbd = new Child();
//         bbd.display(33, 43);
//     }
// }
class Person{
    void display(){
        System.out.println("Hello");
    }
}
    class A extends Person{
        void display(){
            System.out.println("Hello A");
        }
    }
    class B extends Person{
        void display(){
            System.out.println("Hello B");
        }
    }
    class overriding{
    public static void main(String[] args) {
        Person bbd = new Person();
        A m=new A();
        B n=new B();
        Person z;
        z=m;
        z.display();
        z=n;
        z.display();
    }
    }
