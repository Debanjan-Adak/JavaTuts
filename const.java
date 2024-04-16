class constr{
    int age;
    String name;
    constr(int age,String name)//parameterised
    {
        this.age=age;
        this.name=name;
    }
    constr()//non parameterised
    {
        age=12;
        name="Debu";
    }
}
class tutconstr
{
    public static void main(String[] args) {
        constr ob=new constr();
        constr ob1=new constr(40,"Debanjan");
        constr obj2;
        obj2=new constr();
        new constr();//anonymous object, no reference or name, and can be called just once
        //new constr().show();// just once as everytime this statement is written a new object is created
        System.out.println("Object ob: Name:"+ob.name+" age: "+ob.age);
        System.out.println("Object ob1: Name:"+ob1.name+" age: "+ob1.age);
        
    }
}