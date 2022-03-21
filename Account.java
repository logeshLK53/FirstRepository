import java.util.Scanner;

public class Account extends Exception {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int ammount=scan.nextInt();
        try
        {
        withDraw(ammount);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code...");
    }
    public static void withDraw(int ammount) throws Exception
    {
        if(ammount > 1000)
        {
            throw new Exception("InsufficientBalanceException");
        }
    }
}
