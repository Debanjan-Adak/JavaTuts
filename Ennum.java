//constants
enum Status  
{
    Running,Failed,Pending,Success;//named constants

}
public class Ennum {
    public static void main(String[] args) {
        int i=5;
        Status s= Status.Running;
        Status[] all=Status.values();
        System.out.println(s);
        System.out.println(s.ordinal());
        System.out.println();
        System.out.println(all[0]);
    }
    
}
