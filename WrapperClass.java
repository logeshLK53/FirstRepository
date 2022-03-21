public class WrapperClass {
    public static void main(String args[])
    {
        int arr[]=new int[5];
         arr[0]=Integer.parseInt(args[0]);
         arr[1]=Integer.parseInt(args[1]);
         arr[2]=Integer.parseInt(args[2]);
         arr[3]=Integer.parseInt(args[3]);
         arr[4]=Integer.parseInt(args[4]);

        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
    }
}
