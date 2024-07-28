import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

@FunctionalInterface  //interface containing 1 method
interface A 
{
    void show(int a);
}
interface B 
{
    int add(int i,int j);
}
public class lambda {
    public static void main(String[] args) {
        A obj=(i)-> System.out.println("in A show"+i); // lambda function
        obj.show(5);

        B obj1=(i,j)-> i+j;// lambda expression with return type. If its a single statement and return then no need to mention return
        int result = obj1.add(5,3);
        System.out.println(result);
        
    }
    
}
