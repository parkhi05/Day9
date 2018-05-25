
package constinbaseclass;
import java.util.*;
class A            //In this program we are creating child class obj but here parent class is working
    {
    private int a,b;
    public A(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void show()
    {
     System.out.println("The 1st value you have entered is" +a);
       System.out.println("The 2nd value you have entered is" +b);
    }
    
}
class B extends A {
    public B(int a,int b)
    {
        super(a,b);                  //Constructor in a derived class
    }
}


public class ConstInBaseClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the 1st value : ");
                 int a =sc.nextInt();
                 
                 System.out.println("Enter the 2nd value : ");
                 int b =sc.nextInt();
       B obj = new B(a,b);
       obj.show();
    }
    
}
