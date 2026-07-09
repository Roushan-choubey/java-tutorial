// class Person {
//     void display(int x, int y){
//         System.out.println(x+y);
//     }
//     void display(int x, int y, int z){
//         System.out.println(x+y+z);
//     }
//         public static void main(String[] args) {
//             Person bbd = new Person();
//             bbd.display(5, 10);
//             bbd.display(5, 10, 15);
//         }
//     }
// class Person{
// void display(int x, int y){
//     if (x>y){
//         System.out.println(x);
//     }
//     else{
//         System.out.println(y);

//     }
// }
//     void display(float x, float y){
//         if (x>y){
//             System.out.println(x);
//         }
//         else{
//             System.out.println(y);
//         }
//     }
//         public static void main(String[] args) {
//             Person bbd = new Person();
//             bbd.display(5, 10);
//             bbd.display(5.5f, 10.5f);
//         }
//     }

// sequence of params in method overloading
class Person{
    void display(int x, char y){
        System.out.println(x+" "+y);
    }
    void display(char y, int x){
        System.out.println(x+" "+y);
    }
        public static void main(String[] args) {
            Person bbd = new Person();
            bbd.display(5, 'A');
            bbd.display('B', 10);
        }
    }
