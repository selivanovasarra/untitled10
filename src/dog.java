import java.util.Scanner;

public class dog {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the count of the places on the trip");
        int Places= input.nextInt();
        while(Places>0) {
            System.out.println("Enter number of the family and count of members");
            int FamilyNumber= input.nextInt();
            int Members= input.nextInt();
            Places = Places - Members;
            if (Places > 0){
                System.out.println(FamilyNumber+" yes, you should pay "+ (Members*100));
            } else {
                System.out.println(FamilyNumber+ " no, not enough places");
            }

        }

    }
}