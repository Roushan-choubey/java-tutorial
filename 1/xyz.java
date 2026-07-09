 class Father{ 
  int a=32;
  int b=24;
}
class child1 extends Father{
    int c=0;
    void display(){
        c=a+b;
        System.out.println(c);
    }  
}
    class child2 extends Father{
    int c=0;
    void display(){
        c=a+b;
        System.out.println(c);
    }      
    }
    class xyz{
    public static void main(String[] args) {
        child1 bbd=new child1();
        bbd.display();

    
         child2 nitm=new child2();
        nitm.display();

    }
    }
