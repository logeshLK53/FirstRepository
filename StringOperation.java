public class StringOperation {
    public static void main(String args[])
    {
        String str= "ABC";
        String str1= "ABC";
        String str2 = new String("ABC");  
        System.out.println(str==str1);
        System.out.println(str==str2);
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
    }
}
