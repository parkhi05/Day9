
package childclassconstructor;
import java.util.*;   //Acessing child class values
class A{
    int a,b;
    public A(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void show(int a,int b)
    {
        System.out.println("Sum is "+(a+b));
    }
}
class B extends A 
{
    float f;
    public B(int a,int b,float f)
    {
    super(a,b);
    this.f=f;
    }
    public void show()
    {
        super.show(a,b);
        System.out.println("Float value is :"+f);
    }
}
 


public class ChildClassConstructor {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the 1st value : ");
                 int a =sc.nextInt();
                 
                 System.out.println("Enter the 2nd value : ");
                 int b =sc.nextInt();
                  B obj = new B(a,b,3.5f);
                  obj.show();
               
    }
    
}
