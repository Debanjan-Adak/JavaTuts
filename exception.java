public class exception {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        int nums[]=new int[5];
        try{
            j=18/i;// jumps out of try if exception occurs
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            
            System.out.println("SOmething went wong"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of BOUNDSSSS");
        }
        catch(Exception e)// incase of some other exception. KEEP this at the end else wont make sense of the other excepions
        {
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("Bye");

    }
    
}
