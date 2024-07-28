@FunctionalInterface
interface Hi
{
    void show();
} 
class A {
    public void showThisClassData() {
        System.out.println("In A show");
    }
}

class B extends A 
{
    @Override // annotation
    public void showThisClassData() {
        System.out.println("In B show");
    }
}

public class Annotations {
    public static void main(String[] args) {

        B obj = new B();
        obj.showThisClassData();

    }
}