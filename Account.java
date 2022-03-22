import java.util.Scanner;

public class Account {
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
    public static void withDraw(int ammount) throws CustomException
    {
        if(ammount > 1000)
        {
            throw new CustomException("InsufficientBalanceException");
        }
    }
}
class CustomException extends Exception
{
    public CustomException(String str)
    {
        super (str);
    }
}
