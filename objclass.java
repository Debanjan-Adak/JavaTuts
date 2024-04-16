public class objclass {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.model="Lenevo";
        obj.price=35000;

        Laptop obj1=new Laptop();
        obj1.model="Lenevo";
        obj1.price=35000;

        boolean result= obj.equals(obj1);// compares hexa value when no equals method is in the class, when object class equal is called


        System.out.println(result);

        System.out.println(obj);// automatically converts to obj.toString
       // System.out.println(obj.toString());//A hash code is an integer value that is associated with each object in Java.
                //Its main purpose is to facilitate hashing in hash tables, which are used by data structures like HashMap.
    }
}
class Laptop{
    String model;
    int price;
    

    public String toString()
    {
        return model +" : "+price;
    }
    public boolean equals(Laptop that)
    {
        return this.model.equals(that.model)&& this.price==that.price;
       
    }
}
