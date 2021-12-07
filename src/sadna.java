import java.util.Scanner;
public class sadna {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter how many park slots are in he park:");
        int didNotPass=0;
        int ParkS=input.nextInt();

        while(ParkS>0)
        {
            System.out.println("Enter height and weight");
            int Height= input.nextInt();
            int Weight= input.nextInt();
            if((Height>5)||(Weight>10)){
                didNotPass++;
                System.out.println("The track can't come in");}
            else {
                ParkS--;
                System.out.println("The track can come in");
            }
        }
        System.out.println("The tracks that didn't fit: "+didNotPass);
    }
}