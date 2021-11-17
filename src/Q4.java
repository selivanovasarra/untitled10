import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
int total = 0;
System.out.println("enter hours amount");
int hours = s.nextInt();
while (hours <= 70) {
    if (hours > 15)
        total++;
    System.out.println("enter hours amount");
     hours = s.nextInt();
}
System.out.println("total students that worked more than 15 hours a week are:" + total);

    }
}
