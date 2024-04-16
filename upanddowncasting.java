class A
{
    public void show1()
    {
        System.out.println("In show 1");
    }

}
class B extends A
{
    public void show2()
    {
        System.out.println("In show 2");
    }

}
public class upanddowncasting {
    public static void main(String[] args) {
        A obj=(A)new B();// upcasting happens implicitly
        obj.show1();

      //  obj.show2();// cant call as reference is of A
        B obj1= (B)obj;// downcasting to child reference
        obj1.show2();
    }
    
}
