
public class sample {
    public static void main(String args[])
    {
       String s="hai i am logesh";
       int count[]=new int[128];
       for(int i=0;i<s.length();i++)
       {
           count[s.charAt(i)]++;
       }
       for(int i=0;i<s.length();i++)
       {
           System.out.println(s.charAt(i)+" "+count[s.charAt(i)]);
       }
    }
    }
    
