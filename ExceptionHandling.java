import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling extends Exception{
    public static void main(String args[]) throws ArithmeticException
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            try
            {
                String str=null;
                System.out.print(str.charAt(0));
            }
            catch(NullPointerException e){
                 System.out.println("No String data");
            }
            int res=scan.nextInt();
            res=res/0;
            System.out.println(res);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Wrong Input");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occured");
        }
        catch(Exception e)
        {
            System.out.println("Other Exception occured");
        }
        finally{
            System.out.println("Program runs successfully...");
        }
    
    }
}

