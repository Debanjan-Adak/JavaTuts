abstract class Car//abstract class
{
    public abstract void drive();// while declaring & abstract method only in abstract class
    
    public void playMusic()
    {
        System.out.println("Play Music");
    }

}
class WagonR extends Car//concrete class
{
    public void drive()
    {
        System.out.println("Driving");
    }
}
public class abstractt {
    public static void main(String[] args) {
        //Car obj=new Car();// cannot create object of abstract class
        Car obj=new WagonR();// but reference can be created
        obj.drive();
        obj.playMusic();
        
    }
}
