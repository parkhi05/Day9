
package constructor1;
import java.util.*;
class A
{
    int a,b;
    public void sum(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void sum()
    {
        System.out.println("Sum is :"+(a+b));
    }
}

public class Constructor1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value : ");
        int n=sc.nextInt();
        System.out.println("Enter the 2nd value : ");
        int m=sc.nextInt();
        
        
        A obj=new A();
       // obj.sum(4,5);
        obj.sum(n,m);
        obj.sum();
        
    }
    
}
