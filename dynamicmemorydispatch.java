import java.util.*;
class A
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }

}
class C extends A
{
    public void show()
    {
        System.out.println("in C show");
    }

}
final class Calc
{
     final public void show()
     {
        System.out.println("in calc show");

     }
     public void add(int a,int b)
     {
        System.out.println(a+b);
     }
}
class AdvCalc extends Calc// error as class Calc is final
{
    public void show();
    {
        System.out.println("By DEbu");
    }

}

public class dynamicmemorydispatch
{
    public static void main(String[] args) 
    {
        // B obj=new B();
        // obj.show();
        A obj1=new A();// since B extends A. Type can be both parent and child, but object must be of child or own class type
        obj1.show();
        obj1=new B();
        obj1.show();
        obj1=new C();
        obj1.show();// obj1.show() same thing behaving differently with different objects POLYMORPHISM

        final int num=8;
        //num =7;//  cannot change as final
        AdvCalc obj
        
    }

}