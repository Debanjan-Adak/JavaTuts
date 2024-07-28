//constants
enum Status  
{
    Running,Failed,Pending,Success;//named constants

}
enum Laptop
{
    Macbook(2000),XPS(2200),PC(5000);
    private int price;
    private Laptop(int price)//constructor of the enum
    {
        this.price=price;
    }

}
public class Ennum {
    public static void main(String[] args) {
        int i=5;
        Status s= Status.Running;
        Status[] all=Status.values();// .values() gives all values
        System.out.println(s.getClass().getSuperclass());

        System.out.println(s);
        System.out.println(s.ordinal());
        System.out.println();
        System.out.println(all[0]);
        Laptop lap=Laptop.Macbook;
    }
    
}
