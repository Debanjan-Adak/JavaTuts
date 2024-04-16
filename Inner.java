class A// outer class cannot be static
{
    public void show()
    {
        System.out.println("in show");
    }
    cstatic lass B
    {
        public void config()
        {
            System.out.println("in config");
        }

    }
}
public class Inner {
    public static void main(String[] args) {
        A obj =new A();
        obj.show();
       //    B obj1 = new B();// belong s to A so
        A.B obj1=obj.new B(); // mention class then outer class object as well to create inner class objectpublic class Inner {

        //if B is static   A.B obj1=new A.B();
        
        obj1.config();

        
    }

    
}