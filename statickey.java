class Animal{
    static String name;
    int paws;
    int price;
    public void show()
    {
        System.out.println(name+" "+paws+" "+price);
    }
    public static void show1(Animal obj)
    {
        System.out.println(name+" "+obj.paws+" "+obj.price);
    }

}
public class statickey {
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.paws=5;
        obj.price=100;
        Animal.name="animal";//static so using class we accept
        Animal.show1(obj);
    }
    
}
