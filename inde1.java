package Assignment2;

public class inde1 {
    public static void main(String[] args)
    {
        int x=2;
        int y=++x *2;
        int z=--y-2*x++;
        int result =x-- *++z+--y;
        System.out.println("x"+x);
        System.out.println("y"+y);
        System.out.println("z"+z);
        System.out.println("Result"+result);
    }
    
}
