class SumArrayQ1{
    public static void main(String[] ars)
    {
        int a[]={4,3,2,1};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum =sum+a[i];
           
            //System.out.println(sum); // op like 4+3=7  7+2= 9 9+1=10;
        }
         System.out.println(sum);
    } 
}