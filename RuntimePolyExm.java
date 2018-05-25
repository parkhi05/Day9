
package runtimepolyexm;
class A
{
    public void sum(int a,int b)
    {
        System.out.println("Sum is :"+(a*b));
    }
}
class B extends A
{
    public void sum(int a,int b )
    {
       System.out.println("Sum is :"+(a+b)); 
    }
}


public class RuntimePolyExm {

    public static void main(String[] args) {
        B ob = new B();
        ob.sum(3, 4);
       
        
    }
    
}
