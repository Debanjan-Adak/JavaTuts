//class-class   and   interface-interfac -> extends
//
//interface-class-> implements
    
interface Computer{
    int age=44 ;// all variable in interfaces are final and static so must be initialized

   void code();
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}
interface Car extends Computer
{

}


class Desktop implements Computer//,Car // class can implement multiple interfaces
{
    public void code()
    {
        System.out.println("code,compile,run faster");
    }
}

class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
public class Interface {
    
    public static void main(String[] args) {
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Developer debu=new Developer();
        debu.devApp(lap);
    }
}
