import java.util.Scanner;

public class א3 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int sum,flat;
        System.out.println("enter number of flats");
        flat=input.nextInt();
        sum=0;
        while(flat>=0)
        {
            sum=sum+1;
            System.out.println("enter number of flats or negative number to finish");
            flat=input.nextInt();
        }
        System.out.println(sum+" flats are sold");
    }
}
