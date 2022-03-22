public class StringAndArrays {
    public static void main(String[] args) {
        String s="hai i am LK";
        System.out.println(s.length());
        System.out.println(s.substring(4, 8));
        System.out.println(s.indexOf("L"));
        System.out.println(s.charAt(6));
        s=s.concat(" here.");
        System.out.println(s);
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.contains("LK")); 
        System.out.println(s.startsWith("I"));
        System.out.println(s.endsWith("hai"));
        
        String sarr[]=s.split(" ");
        System.out.println(sarr[3]);

        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]+=(i*i);
        }
        System.out.println(arr[5]);
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
