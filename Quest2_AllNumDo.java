//print all even no from 1 to n do while ;
public class Quest2_AllNumDo {
    public static void main(String[] args)
    {
        int a=1;
        do{
            if(a%2==0)
            {
                System.out.println(a);
            }
            a++;
        }while(a<=50);
    }
}
