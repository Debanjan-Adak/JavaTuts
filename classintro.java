import java.util.*;
class Calculator{
    int a;
    public int add(int num1,int num2)
        {
            //System.out.println("in add: ");
            int r=num1+num2;
            return r;
        }
    
}
class classintro{
    public static void main(String args[]){
        Calculator c=new Calculator();
        int result =c.add(7,9);
        System.out.println(result);

    }
}